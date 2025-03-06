#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <time.h>
#include <sys/types.h>

#define MIN_INTEGERS 2
#define MAX_INTEGERS 10
#define MAX_VALUE 99
#define MAX_CHILDREN 2

// Function Prototypes
int parseCommandLine(int argc, char* argv[]);
void fillTable(int list[], int nbrOfEntries);
void generateChildrenProcesses(int list[], int nbrOfEntries);
void displayTableForward(pid_t processID, int list[], int nbrOfEntries);
void displayTableReverse(pid_t processID, int list[], int nbrOfEntries);


// -----------------------------------------------------
int main(int argc, char* argv[])
{
int table[MAX_INTEGERS];
int nbrOfIntegers;

nbrOfIntegers = parseCommandLine(argc, argv);

fillTable(table, nbrOfIntegers);

generateChildrenProcesses(table, nbrOfIntegers);

return 0;
} // End main


// -------------------------------------------
int parseCommandLine(int argc, char* argv[])
{
int userEntry;
int integerCount;

if (argc == 2)
   {
   userEntry = atoi(argv[1]);
   if (userEntry >= MIN_INTEGERS && userEntry <= MAX_INTEGERS)
      integerCount = userEntry;
   else
      {
      integerCount = MAX_INTEGERS;
      printf("Message: Entry for number of integers is out of range "
             "(%d .. %d),\n", MIN_INTEGERS, MAX_INTEGERS);
      printf("         using %d instead\n", MAX_INTEGERS);
      } // End else
   } // End if
else
   {
   integerCount = MAX_INTEGERS;
   printf("Usage: a.exe <number of integers in the range of %d..%d>\n",
          MIN_INTEGERS, MAX_INTEGERS);
   printf("Message: Incorrect numbers of entries on the command line...\n");
   printf("         using %d as the number of integers\n", MAX_INTEGERS);
   } // End else

return integerCount;
} // End parseCommandLine


// -------------------------------------------------
void fillTable(int list[], int nbrOfEntries)
{
srand(time(0)); // Seed the random number generator

for (int i = 0; i < nbrOfEntries; i ++){
   list[i] = rand() % (MAX_VALUE + 1);
   }//end for
} // End fillTable


// -------------------------------------------------
void generateChildrenProcesses(int list[], int nbrOfEntries) {
   pid_t childPID;

   childPID = fork();
   for (int i = 0; i < 2; i++){
      if (childPID == -1)
         {
            perror("Fork failed");
            exit(1);
         } //end if
      else if (childPID == 0) { // This is the child
         if (i == 0){
            displayTableForward(getpid(), list, nbrOfEntries);
         } else {
            displayTableReverse(getpid(), list, nbrOfEntries);
         } //end else if
      }//end for

}//end for

} // End generateChildrenProcesses


// -------------------------------------------------
void displayTableForward(pid_t processID, int list[], int nbrOfEntries)
{
   printf("(PID: %d) Forward: ",processID);

   for (int i = 0; i < nbrOfEntries; i ++) {
      printf("%4d ", list[i]);
   }//end for
   printf("\n");
} // End displayTableForward


// -------------------------------------------------
void displayTableReverse(pid_t processID, int list[], int nbrOfEntries)
{
   printf("(PID: %d) Reverse: ",processID);

   for (int i = nbrOfEntries - 1; i >= 0; i --) {
      printf("%4d ", list[i]);
   }//end for
   printf("\n");
} // End displayTableBackward