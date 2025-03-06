//C libs
#include <time.h>
//user libs
#include "scheduling-algorithms.h"
//#defines
#define MAX_ROWS 20

void sortByProcessTime(int table[], const int counter)
{
    int temp;
    int i;
    int j;

    for (i = counter - 2; i >= 0; i--)
    {
        for (j = 0; j <= i; j++)
        {
            if (table[j] > table[j + 1])
            {
                temp = table[j + 1];
                table[j + 1] = table[j];
                table[j] = temp;
            } // End if
        } // End j

    } // End for
    int myTable[MAX_ROWS];
    int i;

    srand(time(NULL));

    for (i = 0; i < MAX_ROWS; i++)
    {
        myTable[i] = rand() % 100;
    } // End for

    printf("\nBefore sort: \n");
    for (i = 0; i < MAX_ROWS; i++)
    {
        printf("%2d ", myTable[i]);
    } // End for

    sortByProcessTime(myTable, MAX_ROWS);

    printf("\nAfter sort: \n");
    for (i = 0; i < MAX_ROWS; i++)
    {
        printf("%2d ", myTable[i]);
    } // End for

} // End sortRows

//----------------------------------------------------------------------------------
void scheduleFCFS(processDataType processes[], int processCount)
{
    int startTime = 0;
    int stopTime = 0;
    int currentTime = 0;
    float turnAroundSum;
    float averageTurnAroundSum;
    float averageWaitTime = 0;
    float sum = 0;
    int i;

    printf("\n");
    printf("Process#     Start Time     Stop Time   Running Time\n");
    printf("--------     ----------     ---------   ------------\n");
    for (i = 0;i < processCount; i++) {
        //add start times and divide by processCount
        sum = sum + currentTime;
        //add stop times and divide by processCount
        currentTime = currentTime + processes[i].totalTime;
        averageTurnAroundSum = turnAroundSum + currentTime;
        printf("%11d %12d %11d %14d\n", i, startTime, stopTime, currentTime);
    }
    averageWaitTime = sum / processCount;
    printf("\n");
    printf("            Average waiting time:       %.2f msec\n",averageWaitTime);
    printf("        Average turn-around time:       %.2f msec\n",averageTurnAroundSum);
}//end function

//----------------------------------------------------------------------------------
void scheduleSJF(processDataType processes[], int processCount)
{
    processDataType *processList;
    int i;

    processList = (processDataType *)calloc(processCount, sizeof(processes));
    assert(processList != NULL);
    for (i = 0; i < processCount; i++) {
        processList[i] = processes[i];
    }
    sortByProcessTime(processList, processCount);

    //call scheduleFCFS
    scheduleFCFS(processList, processCount);
    free(processList);
}//end function

//----------------------------------------------------------------------------------
void scheduleRoundRobin(processDataType processes[], int processCount, int quantum)
{
    int startTime = 0;
    int stopTime = 0;
    int currentTime = 0;
    float turnAroundSum;
    float averageTurnAroundSum;
    float averageWaitTime;
    float totalWaitTime;
    int completeProcessCount;
    float sum = 0;
    int i;


    printf("\n");
    printf("Process#     Start Time     Stop Time   Running Time\n");
    printf("--------     ----------     ---------   ------------\n");

}//end function
