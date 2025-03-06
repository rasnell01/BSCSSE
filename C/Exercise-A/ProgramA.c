//
// Created by Ryan A Snell on 6/6/24.
//
#include <stdio.h>

#define MIN_SCORES 2
#define MAX_SCORES 10

//func prototypes
int parseCommandLine(int argc, char *argv[]);
void readScores(int table[], int scoreCount);
void displayScoreTable(int table[], int scoreCount);
int findMinimumScore(int table[], int scoreCount);
int findMaximumScore(int table[], int scoreCount);
float calculateAverageScore(int table[], int scoreCount);
void displayStatisticsReport(int minScore, int maxScore, float avgScore);

int main(int argc, char *argv[]) {
    int scoreTable[MAX_SCORES];
    int userResponse;
    int nbrOfScores = 0;
    int minimumScore;
    int maximumScore;
    float averageScore;

    if (argc == 2)
       nbrOfScores = parseCommandLine(argc, argv);
else
   {
   printf("How many scores %d - %d): \n", MIN_SCORES, MAX_SCORES);
   scanf("%d", &nbrOfScores);
   } // End else

if (nbrOfScores < MIN_SCORES || nbrOfScores > MAX_SCORES)
   {
   printf("ERROR: The number of scores must be between %d and %d\n", MIN_SCORES, MAX_SCORES);     
   } // End if
else
   {
   readScores(scoreTable, nbrOfScores);
   displayScoreTable(scoreTable, nbrOfScores);

   minimumScore = findMinimumScore(scoreTable, nbrOfScores);
   maximumScore = findMaximumScore(scoreTable, nbrOfScores);
   averageScore = calculateAverageScore(scoreTable, nbrOfScores);

   displayStatisticsReport(minimumScore, maximumScore, averageScore);   
   } // End else      

} // End main

// --------------------------------------------------
int parseCommandLine(int argc, char *argv[])
{
   int number;
   
   sscanf(argv[1], "%d", &number);
   return number;
} // End method

// --------------------------------------------------
void readScores(int table[], int scoreCount)
{
   int number;
   for (int i = 0; i < scoreCount; i++)
      {
      scanf("%d",&number);
      table[i] = number;
      } // End for 
} // End method

// --------------------------------------------------
void displayScoreTable(int table[], int scoreCount)
{
   printf("\n");
   printf("Contents of the score table:\n");

   for (int i = 0; i < scoreCount; i++)
      {
      printf("  %d" + table[i]);
      } // End for 
   printf("\n");
} // End method

// --------------------------------------------------
int findMinimumScore(int table[], int scoreCount)
{
   int minimumScore = table[0];

   for (int i = 1; i < scoreCount; i++)
      {
      if (table[i] < minimumScore)
         minimumScore = table[i];
      } // End for

   return minimumScore;
} // End method

// --------------------------------------------------
int findMaximumScore(int table[], int scoreCount)
{
   int maximumScore = table[0];

   for (int i = 1; i < scoreCount; i++)
      {
      if (table[i] > maximumScore)
         maximumScore = table[i];
      } // End for
   
   return maximumScore;
} // End method

// --------------------------------------------------
float calculateAverageScore(int table[], int scoreCount)
{
   float sum = 0;
   float average = 0;

   for (int i = 0; i < scoreCount; i++)
      {
      sum = sum + table[i];
      } // End for

   average = sum / scoreCount;

   return average;
} // End method

// --------------------------------------------------
 void displayStatisticsReport(int minScore, int maxScore, float avgScore) {
   printf("\n");
   printf("*** Statistics Report ***\n");
   printf("\n");
   printf("Maximum  Minimum  Average\n");
   printf(" Score    Score    Score\n");
   printf("-------  -------  -------\n");
   printf("\n");
   printf("%7d  %7d  %7.1f\n", minScore, maxScore, avgScore);
}//end function