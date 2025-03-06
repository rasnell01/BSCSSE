#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <dirent.h>
#include <sys/stat.h>
#include <time.h>


// Constants
#define MAX_SIZE 500
#define MAX_PERMISSIONS 9



// Function Prototypes
void displayContents(void);
void displayEntryType(mode_t mode);
void displayEntryPermissions(mode_t mode);



// *******************************************************
int main(int argc, char *argv[])
{
   int status;

   if (argc == 2 ) {
      status = chdir(argv[1]);

      if (status == -1) {
         perror("Problem occurred in changing current working directory\n");
         return 1;
      }// end if
   } else if (argc != 1) {
      printf("\nUsage: a.out directory_path_name\n");
      return 1;
   }//end if else

   displayContents();

   return 0;
} // End main

void displayContents(void) {
   char *pathPtr;
   char buffer[MAX_SIZE];
   DIR *directoryPtr;
   struct dirent *entryPtr;
   struct stat statusBuffer;
   int status;
   char *timeBuffer;

   pathPtr = (char *) getcwd(buffer, MAX_SIZE);
   if (pathPtr == NULL) {
      perror("Problem obtaining current working directory");
      return;
   }//end if

   directoryPtr = opendir(buffer);

   if (directoryPtr == NULL)
   {
      perror ("Failed to open directory");
      return;
   } // End if

   printf("\nContents of: %s\n\n", buffer);
   printf("Type                     Size   Access      Status changed    Name\n");
   printf("----                     ----   ------      --------------    ----\n");

   entryPtr = readdir(directoryPtr);
   while (entryPtr != NULL) {

      status = stat(buffer, &statusBuffer);
      if (status == -1) {
         perror("Failed to get file status");
         return;
      }//end if

      displayEntryType(statusBuffer.st_mode);

      printf("%4d", statusBuffer.st_size);
      displayEntryPermissions(statusBuffer.st_mode);
      timeBuffer = ctime(&statusBuffer.st_atime);
      for (int i = 4; i <= 18; i++) {
         putchar(timeBuffer[i]);
      }//end for
      printf("   %s\n", entryPtr->d_name);
      entryPtr = readdir(directoryPtr);
   }//end while

}//end function

void  displayEntryType(mode_t mode) {
   if (S_ISBLK(mode))
      printf("%-25s", "Block special file");
   else if (S_ISCHR(mode))
      printf("%-25s", "Character special file");
   else if (S_ISDIR(mode))
      printf("%-25s", "Directory");
   else if (S_ISFIFO(mode))
      printf("%-25s", "Pipe or FIFO special file");
   else if (S_ISLNK(mode))
      printf("%-25s", "Symbolic link");
   else if (S_ISREG(mode))
      printf("%-25s", "Regular file");
   else if (S_ISSOCK(mode))
      printf("%-25s", "Socket");
   else
      printf("Unknown File");

}//end function

void displayEntryPermissions(mode_t mode) {
   char table[MAX_PERMISSIONS + 1] = "---------\0";
   if (S_IRUSR & mode) table [0] = 'r';
   if (S_IWUSR & mode) table [1] = 'w';
   if (S_IXUSR & mode) table [2] = 'x';
   if (S_IRUSR & mode) table [3] = 'r';
   if (S_IWUSR & mode) table [4] = 'w';
   if (S_IXUSR & mode) table [5] = 'x';
   if (S_IRUSR & mode) table [6] = 'r';
   if (S_IWUSR & mode) table [7] = 'w';
   if (S_IXUSR & mode) table [8] = 'x';

   //table[8] = (S_IXOTH) ? 'x':'-';
   printf("   %-12s", table);
}