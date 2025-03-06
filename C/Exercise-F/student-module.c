///////////////////////////////////////////////////////////////////
// Programmer's name:  Ryan Snell
// File name:  student-module.c
// Purpose: To create and register signal handlers
// Assumptions:  None known
// Limitations: None known
// 
// Development Computer:   MacOS Sonoma 14.5
// Operating System:  MacOS
// Integrated Development Environment (IDE):  CLion 2024.1.2
// Compiler: gcc
///////////////////////////////////////////////////////////////////

#include "signal-handlers.h"  // *** Uncomment this #include to 
                              // incorporate the signal handlers

// Function prototypes
void handleSIGABRT(int signalnbr);
void handleSIGALRM(int signalnbr);
void handleSIGCHLD(int signalnbr);
void handleSIGFPE(int signalnbr);
void handleSIGINT(int signalnbr);
void handleSIGSEGV(int signalnbr);
void handleSIGTERM(int signalnbr);


// -----------------------------------------
void registerSignalHandlers(void)
{
int status;
struct sigaction signalAction;

// SIGABRT
signalAction.sa_handler = handleSIGABRT;
signalAction.sa_flags = 0;
status = sigemptyset(&signalAction.sa_mask);
if (status == -1)
   {
   perror("Failed to initialize SIGABRT signal set");
   exit(1);
   } // End if

status = sigaction(SIGABRT, &signalAction, NULL);
if (status == -1)
   {
   perror("Failed to initialize SIGABRT signal action");
   exit(1);
   } // End if


// SIGABRT
signalAction.sa_handler = handleSIGABRT;
signalAction.sa_flags = 0;
status = sigemptyset(&signalAction.sa_mask);
if (status == -1)
   {
   perror("Failed to initialize SIGABRT signal set");
   exit(1);
   } // End if

status = sigaction(SIGABRT, &signalAction, NULL);
if (status == -1)
   {
   perror("Failed to initialize SIGABRT signal action");
   exit(1);
   } // End if
} // End registerSignalHandlers

// -----------------------------------------
void handleSIGABRT(int signalnbr)
{
char message[] = "(SIGABRT) An assertion has failed and the program will now end\n";

write(STDERR_FILENO, message, strlen(message) );
exit(0);

} // End handleSIGABRT

// -- Complete the signal handlers below based on the example above
// -- for the SIGABRT signal handler.  You can start by just copy/pasting
// -- the source code and then modifying it to fit the specific signal


// -----------------------------------------
void handleSIGALRM(int signalnbr)
{
char message[] = "(SIGALRM) The allowable time has expired and the program will now end\n";

write(STDERR_FILENO, message, strlen(message) );
exit(0);

} // End handleSIGALRM


// -----------------------------------------
void handleSIGCHLD(int signalnbr)
{
const int MAX_SIZE = 200;
char message[MAX_SIZE];
pid_t childPID;

childPID = wait(NULL);

snprintf(message, MAX_SIZE, "\n(SIGCHLD) Received wait call for child #%d \n", childPID);

write(STDERR_FILENO, message, strlen(message) );
return;
} // End handleSIGCHLD


// -----------------------------------------
void handleSIGFPE(int signalnbr)
{

} // End handleSIGFPE


// -----------------------------------------
void handleSIGINT(int signalnbr)
{

} // End handleSIGINT


// -----------------------------------------
void handleSIGSEGV(int signalnbr)
{

} // End handleSIGSEGV


// -----------------------------------------
void handleSIGTERM(int signalnbr)
{

} // End handleSIGTERM
