///////////////////////////////////////////////////////////////////
// Student name: Instructor  
// File Name: solution4.c  
// Program's Purpose: Provides the definitions for the functions that
//          read and search a word puzzle file
// Limitations: See the limitation comments in the puzzleSearcher.h file
// 
// Development Computer: Dell 
// Operating System: Windows XP
// Integrated Development Environment (IDE): wordpad
// Compiler: gcc
///////////////////////////////////////////////////////////////////

#include <pthread.h>  // When linking this file with the driver file, also put
                      // "-lpthread" on the command line so that the linker
                      // obtains the pthread function definitions from the
                      // pthreads library

#include "puzzleSearcher.h"

#define MAX_THREADS 8

#define HORIZONTALLY_RIGHT          "to the right" 
#define HORIZONTALLY_LEFT           "to the left"
#define VERTICALLY_UP             "straight up"
#define VERTICALLY_DOWN           "straight down"
#define DIAGONALLY_DOWN_RIGHT   "diagonally down to the right"
#define DIAGONALLY_DOWN_LEFT    "diagonally down to the left"
#define DIAGONALLY_UP_RIGHT     "diagonally up to the right"
#define DIAGONALLY_UP_LEFT      "diagonally up to the left"


// Global Variables visible in this file only
static char puzzle[MAX_ROWS][MAX_COLUMNS];  
static int nbrOfPuzzleRows;
static int nbrOfPuzzleColumns;

static wordSearchType wordList[MAX_WORDS];
static int nbrOfWordsInList;


// Function Prototypes visible in this file only
static void *searchHorizontallyRight(void *parameter);
static void *searchHorizontallyLeft(void *parameter);
static void *searchVerticallyUp(void *parameter);
static void *searchVerticallyDown(void *parameter);
static void *searchDiagonallyDownRight(void *parameter);
static void *searchDiagonallyDownLeft(void *parameter);
static void *searchDiagonallyUpRight(void *parameter);
static void *searchDiagonallyUpLeft(void *parameter);


// Functions used to set and get the global variables from outside
// of this file

// ###############################################################
void setPuzzleDimensions(int rows, int columns)
{
nbrOfPuzzleRows = rows;
nbrOfPuzzleColumns = columns;
} // End setPuzzleDimensions


// ###############################################################
void setPuzzleCell(int row, int column, char symbol)
{
puzzle[row][column] = symbol;
} // End setPuzzleCell



// ###############################################################
void setNbrOfWordsInList(int wordCount)
{
nbrOfWordsInList = wordCount;
} // End setnbrOfWordsInList


// ###############################################################
int getNbrOfWordsInList(void)
{
return nbrOfWordsInList;
} // End getnbrOfWordsInList


// ###############################################################
void setWordInList(int row, wordSearchType wordRecord)  
{
wordList[row] = wordRecord;
} // End setWordInList


// ###############################################################
wordSearchType getWordFromList(int row)  
{
return wordList[row];
} // End getWordFromList


// ================== MAKE NO CODE CHANGES ABOVE THIS LINE ==================



// ********************************************************
void performSequentialSearch(void)
{
searchHorizontallyRight(NULL);
searchHorizontallyLeft(NULL);
searchVerticallyUp(NULL);
searchVerticallyDown(NULL);
searchDiagonallyDownRight(NULL);
searchDiagonallyDownLeft(NULL);
searchDiagonallyUpRight(NULL);
searchDiagonallyUpLeft(NULL);
} // End performSequentialSearch


// ********************************************************
void performParallelSearch(void) 
{ 
int singleStatus;      
int status[MAX_THREADS];
int i;
pthread_t threadTable[MAX_THREADS];
int index = -1;
 

// Create threads to search the puzzle
index++;
status[index] = pthread_create(threadTable + index, NULL, searchHorizontallyRight, NULL);
index++;
status[index] = pthread_create(threadTable + index, NULL, searchHorizontallyLeft, NULL);
index++;
status[index] = pthread_create(threadTable + index, NULL, searchVerticallyUp, NULL);
index++;
status[index] = pthread_create(threadTable + index, NULL, searchVerticallyDown, NULL);
index++;
status[index] = pthread_create(threadTable + index, NULL, searchDiagonallyDownRight, NULL);
index++;
status[index] = pthread_create(threadTable + index, NULL, searchDiagonallyUpLeft, NULL);
index++;
status[index] = pthread_create(threadTable + index, NULL, searchDiagonallyUpRight, NULL);
index++;
status[index] = pthread_create(threadTable + index, NULL, searchDiagonallyDownLeft, NULL);

// Check the status values returned by each of the pthread_create calls
for (i = 0; i < index; i++)
   {
   if (status[i] != 0) 
      {
      fprintf(stderr, "Failed to create thread #%d: %s\n", i, strerror(status[i]));
      exit(1);
      } // End if
   } // End for

// Check the search results returned by each thread
for (i = 0; i < MAX_THREADS; i++) 
   {
   singleStatus = pthread_join(threadTable[i], NULL);
   if (singleStatus != 0)
      fprintf(stderr, "Failed to join thread %d: %s\n", i, strerror(singleStatus));
   } // End for
 
} // End performParallelSearch


// ****************************************************************
static void *searchHorizontallyRight(void *parameter) 
{
int listIndex;
int wordIndex;
int wordFound;
int puzzleRow;
int puzzleStartColumn;
int puzzleLastColumn;
char word[MAX_WORD_SIZE];
int wordLength;

for (puzzleRow = 0; puzzleRow < nbrOfPuzzleRows; puzzleRow++)
   {
   for (listIndex = 0; listIndex < nbrOfWordsInList; listIndex++)
      {
      if (wordList[listIndex].found)
         continue; // Skip over this word if it is already found
 
      strncpy(word, wordList[listIndex].forward, MAX_WORD_SIZE);
      wordLength = wordList[listIndex].length;
      puzzleLastColumn = nbrOfPuzzleColumns - wordLength;

      for (puzzleStartColumn = 0; puzzleStartColumn <= puzzleLastColumn; puzzleStartColumn++)
         {
         wordFound = TRUE; // Assume the word is found until proven otherwise
         for (wordIndex = 0; wordIndex < wordLength; wordIndex++)
            {
            if (puzzle[puzzleRow][puzzleStartColumn + wordIndex] != word[wordIndex]) 
               {
               wordFound = FALSE;
               break; // Quit searching for word starting at this column in the puzzle
               } // End if
            } // for wordIndex
 
         if (wordFound)  
             break;  // Word was found so stop searching this line
         } // End for puzzleStartColumn

      if (wordFound)
         {  
         wordList[listIndex].found = TRUE;
         wordList[listIndex].startRow = puzzleRow;
         wordList[listIndex].startColumn = puzzleStartColumn;
         strcpy(wordList[listIndex].direction, HORIZONTALLY_RIGHT);
         } // End if 

      } // End listIndex
    
   } // End for puzzleRow

} // End searchHorizontallyRight


// ****************************************************************
static void *searchHorizontallyLeft(void *parameter) 
{
int listIndex;
int wordIndex;
int wordFound;
int puzzleRow;
int puzzleStartColumn;
int puzzleLastColumn;
char word[MAX_WORD_SIZE];
int wordLength;

for (puzzleRow = 0; puzzleRow < nbrOfPuzzleRows; puzzleRow++)
   {
   for (listIndex = 0; listIndex < nbrOfWordsInList; listIndex++)
      {
      if (wordList[listIndex].found)
         continue; // Skip over this word if it is already found
 
      strncpy(word, wordList[listIndex].backward, MAX_WORD_SIZE);
      wordLength = wordList[listIndex].length;
      puzzleLastColumn = nbrOfPuzzleColumns - wordLength;

      for (puzzleStartColumn = 0; puzzleStartColumn <= puzzleLastColumn; puzzleStartColumn++)
         {
         wordFound = TRUE; // Assume the word is found until proven otherwise
         for (wordIndex = 0; wordIndex < wordLength; wordIndex++)
            {
            if (puzzle[puzzleRow][puzzleStartColumn + wordIndex] != word[wordIndex]) 
               {
               wordFound = FALSE;
               break; // Quit searching for word starting at this column in the puzzle
               } // End if
            } // for wordIndex
 
         if (wordFound)  
             break;  // Word was found so stop searching this line
         } // End for puzzleStartColumn

      if (wordFound)
         {  
         wordList[listIndex].found = TRUE;
         wordList[listIndex].startRow = puzzleRow;
         wordList[listIndex].startColumn = puzzleStartColumn + wordLength - 1;
         strcpy(wordList[listIndex].direction, HORIZONTALLY_LEFT);
         } // End if 

      } // End listIndex
    
   } // End for puzzleRow

} // End searchHorizontallyLeft


// ****************************************************************
static void *searchVerticallyDown(void *parameter) 
{
int listIndex;
int wordIndex;
int wordFound;
int puzzleColumn;
int puzzleStartRow;
int puzzleLastRow;
char word[MAX_WORD_SIZE];
int wordLength;

for (puzzleColumn = 0; puzzleColumn < nbrOfPuzzleColumns; puzzleColumn++)
   {
   for (listIndex = 0; listIndex < nbrOfWordsInList; listIndex++)
      {
      if (wordList[listIndex].found)
         continue; // Skip over this word if it is already found
 
      strncpy(word, wordList[listIndex].forward, MAX_WORD_SIZE);
      wordLength = wordList[listIndex].length;
      puzzleLastRow = nbrOfPuzzleRows - wordLength;

      for (puzzleStartRow = 0; puzzleStartRow <= puzzleLastRow; puzzleStartRow++)
         {
         wordFound = TRUE; // Assume the word is found until proven otherwise
         for (wordIndex = 0; wordIndex < wordLength; wordIndex++)
            {
            if (puzzle[puzzleStartRow + wordIndex][puzzleColumn] != word[wordIndex]) 
               {
               wordFound = FALSE;
               break; // Quit searching for word starting at this column in the puzzle
               } // End if
            } // for wordIndex
 
        if (wordFound)  
            break;  // Word was found so stop searching this line
         } // End for puzzleStartRow

      if (wordFound)
         {  
         wordList[listIndex].found = TRUE;
         wordList[listIndex].startRow = puzzleStartRow;
         wordList[listIndex].startColumn = puzzleColumn;
         strcpy(wordList[listIndex].direction, VERTICALLY_DOWN);
         } // End if 

      } // End listIndex
    
   } // End for puzzleColumn

} // End searchVerticallyDown


// ****************************************************************
static void *searchVerticallyUp(void *parameter)
{
int listIndex;
int wordIndex;
int wordFound;
int puzzleColumn;
int puzzleStartRow;
int puzzleLastRow;
char word[MAX_WORD_SIZE];
int wordLength;

for (puzzleColumn = 0; puzzleColumn < nbrOfPuzzleColumns; puzzleColumn++)
   {
   for (listIndex = 0; listIndex < nbrOfWordsInList; listIndex++)
      {
      if (wordList[listIndex].found)
         continue; // Skip over this word if it is already found
 
      strncpy(word, wordList[listIndex].backward, MAX_WORD_SIZE);
      wordLength = wordList[listIndex].length;
      puzzleLastRow = nbrOfPuzzleRows - wordLength;

      for (puzzleStartRow = 0; puzzleStartRow <= puzzleLastRow; puzzleStartRow++)
         {
         wordFound = TRUE; // Assume the word is found until proven otherwise
         for (wordIndex = 0; wordIndex < wordLength; wordIndex++)
            {
            if (puzzle[puzzleStartRow + wordIndex][puzzleColumn] != word[wordIndex]) 
               {
               wordFound = FALSE;
               break; // Quit searching for word starting at this column in the puzzle
               } // End if
            } // for wordIndex
 
        if (wordFound)  
            break;  // Word was found so stop searching this line
         } // End for puzzleStartRow

      if (wordFound)
         {  
         wordList[listIndex].found = TRUE;
         wordList[listIndex].startRow = puzzleStartRow + wordLength - 1;
         wordList[listIndex].startColumn = puzzleColumn;
         strcpy(wordList[listIndex].direction, VERTICALLY_UP);
         } // End if 

      } // End listIndex
    
   } // End for puzzleColumn

} // End searchVerticallyUp


// ****************************************************************
static void *searchDiagonallyDownRight(void *parameter)
{
int listIndex;
int wordIndex;
int wordFound;
int puzzleRow;
int puzzleLastRow;
int puzzleStartColumn;
int puzzleLastColumn;
char word[MAX_WORD_SIZE];
int wordLength;

puzzleLastRow = nbrOfPuzzleRows;

for (puzzleRow = 0; puzzleRow <= puzzleLastRow; puzzleRow++)
   {
   for (listIndex = 0; listIndex < nbrOfWordsInList; listIndex++)
      {
      if (wordList[listIndex].found)
         continue; // Skip over this word if it is already found
 
      strncpy(word, wordList[listIndex].forward, MAX_WORD_SIZE);
      wordLength = wordList[listIndex].length;

      if (puzzleRow > (nbrOfPuzzleRows - wordLength) )
         continue; // Word is too long to fit in the puzzle starting at this row
                   // so move on to next word in the list 

      puzzleLastColumn = nbrOfPuzzleColumns - wordLength;


      for (puzzleStartColumn = 0; puzzleStartColumn <= puzzleLastColumn; puzzleStartColumn++)
         {
         wordFound = TRUE; // Assume the word is found until proven otherwise
         for (wordIndex = 0; wordIndex < wordLength; wordIndex++)
            {
            if (puzzle[puzzleRow + wordIndex][puzzleStartColumn + wordIndex] != word[wordIndex]) 
               {
               wordFound = FALSE;
               break; // Quit searching for word starting at this column in the puzzle
               } // End if
            } // for wordIndex
 
         if (wordFound)  
             break;  // Word was found so stop searching this line
         } // End for puzzleStartColumn

      if (wordFound)
         {  
         wordList[listIndex].found = TRUE;
         wordList[listIndex].startRow = puzzleRow;
         wordList[listIndex].startColumn = puzzleStartColumn;
         strcpy(wordList[listIndex].direction, DIAGONALLY_DOWN_RIGHT);
         } // End if 

      } // End listIndex
    
   } // End for puzzleRow

} // End searchDiagonallyDownRight


// ****************************************************************
static void *searchDiagonallyUpLeft(void *parameter)
{
int listIndex;
int wordIndex;
int wordFound;
int puzzleRow;
int puzzleLastRow;
int puzzleStartColumn;
int puzzleLastColumn;
char word[MAX_WORD_SIZE];
int wordLength;

puzzleLastRow = nbrOfPuzzleRows;

for (puzzleRow = 0; puzzleRow <= puzzleLastRow; puzzleRow++)
   {
   for (listIndex = 0; listIndex < nbrOfWordsInList; listIndex++)
      {
      if (wordList[listIndex].found)
         continue; // Skip over this word if it is already found
 
      strncpy(word, wordList[listIndex].backward, MAX_WORD_SIZE);
      wordLength = wordList[listIndex].length;

      if (puzzleRow > (nbrOfPuzzleRows - wordLength) )
         continue; // Word is too long to fit in the puzzle starting at this row
                   // so move on to next word in the list 

      puzzleLastColumn = nbrOfPuzzleColumns - wordLength;

      for (puzzleStartColumn = 0; puzzleStartColumn <= puzzleLastColumn; puzzleStartColumn++)
         {
         wordFound = TRUE; // Assume the word is found until proven otherwise
         for (wordIndex = 0; wordIndex < wordLength; wordIndex++)
            {
            if (puzzle[puzzleRow + wordIndex][puzzleStartColumn + wordIndex] != word[wordIndex]) 
               {
               wordFound = FALSE;
               break; // Quit searching for word starting at this column in the puzzle
               } // End if
            } // for wordIndex
 
         if (wordFound)  
             break;  // Word was found so stop searching this line
         } // End for puzzleStartColumn

      if (wordFound)
         {  
         wordList[listIndex].found = TRUE;
         wordList[listIndex].startRow = puzzleRow + wordLength - 1;
         wordList[listIndex].startColumn = puzzleStartColumn + wordLength - 1;
         strcpy(wordList[listIndex].direction, DIAGONALLY_UP_LEFT);
         } // End if 

      } // End listIndex
    
   } // End for puzzleRow

} // End searchDiagonallyUpLeft


// ****************************************************************
static void *searchDiagonallyUpRight(void *parameter)
{
int listIndex;
int wordIndex;
int wordFound;
int puzzleRow;
int puzzleLastRow;
int puzzleStartColumn;
int puzzleLastColumn;
char word[MAX_WORD_SIZE];
int wordLength;

puzzleLastRow = 0;

for (puzzleRow = nbrOfPuzzleRows - 1; puzzleRow >= puzzleLastRow; puzzleRow--)
   {
   for (listIndex = 0; listIndex < nbrOfWordsInList; listIndex++)
      {
      if (wordList[listIndex].found)
         continue; // Skip over this word if it is already found
 
      strncpy(word, wordList[listIndex].forward, MAX_WORD_SIZE);
      wordLength = wordList[listIndex].length;

      if (puzzleRow < wordLength)
         continue; // Word is too long to fit in the puzzle starting at this row
                   // so move on to next word in the list 

      puzzleLastColumn = nbrOfPuzzleColumns - wordLength;

      for (puzzleStartColumn = 0; puzzleStartColumn <= puzzleLastColumn; puzzleStartColumn++)
         {
         wordFound = TRUE; // Assume the word is found until proven otherwise
         for (wordIndex = 0; wordIndex < wordLength; wordIndex++)
            {
            if (puzzle[puzzleRow - wordIndex][puzzleStartColumn + wordIndex] != word[wordIndex]) 
               {
               wordFound = FALSE;
               break; // Quit searching for word starting at this column in the puzzle
               } // End if
            } // for wordIndex
 
         if (wordFound)  
             break;  // Word was found so stop searching this line
         } // End for puzzleStartColumn

      if (wordFound)
         {  
         wordList[listIndex].found = TRUE;
         wordList[listIndex].startRow = puzzleRow;
         wordList[listIndex].startColumn = puzzleStartColumn;
         strcpy(wordList[listIndex].direction, DIAGONALLY_UP_RIGHT);
         } // End if 

      } // End listIndex
    
   } // End for puzzleRow

} // End searchDiagonallyUpRight


// ****************************************************************
static void *searchDiagonallyDownLeft(void *parameter)
{
int listIndex;
int wordIndex;
int wordFound;
int puzzleRow;
int puzzleLastRow;
int puzzleStartColumn;
int puzzleLastColumn;
char word[MAX_WORD_SIZE];
int wordLength;

puzzleLastRow = 0;

for (puzzleRow = nbrOfPuzzleRows - 1; puzzleRow >= puzzleLastRow; puzzleRow--)
   {
   for (listIndex = 0; listIndex < nbrOfWordsInList; listIndex++)
      {
      if (wordList[listIndex].found)
         continue; // Skip over this word if it is already found
 
      strncpy(word, wordList[listIndex].backward, MAX_WORD_SIZE);
      wordLength = wordList[listIndex].length;

      if (puzzleRow < wordLength)
         continue; // Word is too long to fit in the puzzle starting at this row
                   // so move on to next word in the list 

      puzzleLastColumn = nbrOfPuzzleColumns - wordLength;

      for (puzzleStartColumn = 0; puzzleStartColumn <= puzzleLastColumn; puzzleStartColumn++)
         {
         wordFound = TRUE; // Assume the word is found until proven otherwise
         for (wordIndex = 0; wordIndex < wordLength; wordIndex++)
            {
            if (puzzle[puzzleRow - wordIndex][puzzleStartColumn + wordIndex] != word[wordIndex]) 
               {
               wordFound = FALSE;
               break; // Quit searching for word starting at this column in the puzzle
               } // End if
            } // for wordIndex
 
         if (wordFound)  
             break;  // Word was found so stop searching this line
         } // End for puzzleStartColumn

      if (wordFound)
         {  
         wordList[listIndex].found = TRUE;
         wordList[listIndex].startRow = puzzleRow - wordLength + 1;
         wordList[listIndex].startColumn = puzzleStartColumn + wordLength - 1;
         strcpy(wordList[listIndex].direction, DIAGONALLY_DOWN_LEFT);
         } // End if 

      } // End listIndex
    
   } // End for puzzleRow

} // End searchDiagonallyDownLeft
