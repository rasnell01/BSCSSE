#ifndef SCHEDULING_HEADER
#define SCHEDULING_HEADER

#include <stdlib.h>
#include <stdio.h>
#include <assert.h>

#define MAX_PROCESSES 100
#define FALSE 0
#define TRUE  1


typedef struct
   {
   int processNbr;    // The specific process number (i.e., 1) for a process
   int totalTime;     // Total time that the process needs to run
   int remainingTime; // Remaining time that the process needs to run
   int stopTime;      // Most recent time when the process stopped running
   int waitSum;       // Sum of the time that the process has waited to run
   int isFinished;    // Indicates if the process has completely finished running yet
   } processDataType;

// Function Prototypes
void scheduleFCFS(processDataType processes[], int processCount);
void scheduleSJF(processDataType processes[], int processCount);
void scheduleRoundRobin(processDataType processes[], int processCount, int quantum);

#endif
