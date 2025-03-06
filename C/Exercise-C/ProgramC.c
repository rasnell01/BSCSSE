#include <stdio.h>
#include <string.h>
#include <stdlib.h>

   //
   //Created by Ryan A Snell on 6/11/24.
   //

#define MAX_SIZE 100
#define MAX_SIZE_OF_2 2

extern char **environ;

void getEnv(void);
void displayEnvironContents(void);
void showLabel(void);

int main(int argc, char *argv[])
{
   char *variablePtr;
   char *buffer[MAX_SIZE];

   if (argc > 2) {
      printf("Usage:\n");
      printf("a.exe\n");
      printf("a.exe  <environment_variable_name>\n");
      printf("a.exe  -a\n");
      return 0;

   } else if (argc == 1) {
      printf("Enter the name of an environment variable: \n");
      fgets(buffer, MAX_SIZE - 1, stdin);
      buffer[strlen(buffer) - 1] = '\0';
      variablePtr = (char *) getenv(buffer);

      if (variablePtr == NULL)
         printf("No path environment variable was found\n");
      else
         printf("%s : %s\n", argv[1], variablePtr);

   }else if (strncmp(argv[1],"-a",MAX_SIZE_OF_2) == 0) {
      for (int i = 0; environ[i] != NULL; i++)
      printf("%s\n", environ[i]);

   } else { //handles argc == 2
      variablePtr = (char *) getenv(argv [1]);
      if (variablePtr == NULL)
         printf("%p is not an existing environment variable name\n", buffer);
      else
         printf("%s : %s\n", argv[1], variablePtr);
   }//end else if

   int status = 0; //boolean flag
   status = atexit(showLabel);
   if (status != 0)
   {
      fprintf(stderr, "Error: Failed to install exit handler\n");
      exit(1);
   } // end if
   return 0;
} //end main

void showLabel(void) {

   printf("\n* * * * * * * * * * * * * * * * * * * * * * * * * *\n");
   printf("Environment Variable Display Program (by Ryan Snell)\n");
}//end function

void displayEnvironContents(void) {
   for (int i = 0; environ[i] != NULL; i++)
      printf("%s\n", environ[i]);
}//end function
