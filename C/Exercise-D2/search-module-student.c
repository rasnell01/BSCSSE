#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>

#include "listSearcher.h"

// Function Prototypes
static int findMaxInteger(int list[], int startingIndex, int numbrOfEntries);


// ----------------------------------------------------------
void searchIntegerList(int list[], int nbrOfListEntries, int childrenCount)
{
   pid_t childPID;
   int i;
   int startingIndex;
   int nbrOfSubEntries;
   int maxValue;

   nbrOfSubEntries = nbrOfListEntries / childrenCount;

   startingIndex = 0;

   for (i = 1; i <= childrenCount; i++)
   {
      childPID = fork();

      if (childPID < 0)
      {
         fprintf(stderr, "(Parent) Error in fork() call at iteration #%d\n", i);
         exit(1);
      } // End if
      else if (childPID == 0) // This is the child
      {
         maxValue = findMaxInteger(list, startingIndex, nbrOfSubEntries);
         exit(maxValue);
      } // End else if

      else // This is the parent
      {

         // Set up the search variables to be used by the next child
         startingIndex = startingIndex + nbrOfSubEntries;

         // Make sure that the algorithm doesn't read past the end of the array
         if ( (i == childrenCount - 1) &&
              (startingIndex + nbrOfSubEntries) < nbrOfListEntries)
            nbrOfSubEntries = nbrOfListEntries - startingIndex;
      } // End else

   } // End while

} // End searchIntegerList


// ----------------------------------------------------------
static int findMaxInteger(int list[], int startingIndex, int nbrOfEntries)
{
   int i;
   int maxInteger;
   int endingIndex;

   endingIndex = startingIndex + nbrOfEntries - 1;

   printf("\n(Child process #%ld) Searching indexes %d through %d ...\n",
          getpid(), startingIndex, endingIndex );

   maxInteger = list[startingIndex];

   for (i = startingIndex; i <= endingIndex; i++)
   {
      if (list[i] > maxInteger)
         maxInteger = list[i];
   } // End for

   return maxInteger;
} // End findMaxInteger