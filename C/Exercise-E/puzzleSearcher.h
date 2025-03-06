#ifndef PUZZLE_SEARCHER_HEADER
#define PUZZLE_SEARCHER_HEADER

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define MIN_ROWS 4
#define MIN_COLUMNS 4
#define MAX_ROWS 100
#define MAX_COLUMNS 100

#define MAX_WORDS 100
#define MAX_WORD_SIZE 40

#define FALSE 0
#define TRUE  1

#define MAX_DIRECTION_SIZE 30
 
typedef struct
   {
   char forward[MAX_WORD_SIZE];         // Character string read forward
   char backward[MAX_WORD_SIZE];        // Character string read backward
   int  length;                         // Number of letters in the word
   int  found;                          // Boolean flag indicating if word was found 
   int  startRow;                       // Row containing first letter of word
   int  startColumn;                    // Column containing first letter of word
   char direction[MAX_DIRECTION_SIZE];  // See #define constants in the puzzle searcher module                   
   } wordSearchType; 

// Function Prototypes
void setPuzzleDimensions(int rows, int columns);
void setPuzzleCell(int row, int column, char symbol);
void setNbrOfWordsInList(int wordCount);
int getNbrOfWordsInList(void);
void setWordInList(int row, wordSearchType wordRecord);  
wordSearchType getWordFromList(int row);  

void performSequentialSearch(void);
void performParallelSearch(void);

#endif
