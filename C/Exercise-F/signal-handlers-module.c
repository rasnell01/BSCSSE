#include "signal-handlers.h"


// Function Prototypes
void floatingPointErrorSignalHandler(int signalNbr);
void segmentationFaultSignalHandler(int signalNbr);
void interruptSignalHandler(int signalNbr);
void terminateSignalHandler(int signalNbr);
void alarmSignalHandler(int signalNbr);
void abortSignalHandler(int signalNbr);
void childSignalHandler(int signalNbr);


// ********************************************************
void registerSignalHandlers(void)
{
int status;
struct sigaction signalAction;

// SIGFPE
signalAction.sa_handler = floatingPointErrorSignalHandler;
signalAction.sa_flags = 0;
status = sigemptyset(&signalAction.sa_mask);
if (status == -1)
   {
   perror("Failed to initialize SIGFPE signal set");
   exit(1);
   } // End if

status = sigaction(SIGFPE, &signalAction, NULL);
if (status == -1)
   {
   perror("Failed to initialize SIGFPE signal action");
   exit(1);
   } // End if

// SIGSEGV
signalAction.sa_handler = segmentationFaultSignalHandler;
signalAction.sa_flags = 0;
status = sigemptyset(&signalAction.sa_mask);
if (status == -1)
   {
   perror("Failed to initialize SIGSEGV signal set");
   exit(1);
   } // End if

status = sigaction(SIGSEGV, &signalAction, NULL);
if (status == -1)
   {
   perror("Failed to initialize SIGSEGV signal action");
   exit(1);
   } // End if

// SIGINT
signalAction.sa_handler = interruptSignalHandler;
signalAction.sa_flags = 0;
status = sigemptyset(&signalAction.sa_mask);
if (status == -1)
   {
   perror("Failed to initialize SIGINT signal set");
   exit(1);
   } // End if

status = sigaction(SIGINT, &signalAction, NULL);
if (status == -1)
   {
   perror("Failed to initialize SIGINT signal action");
   exit(1);
   } // End if

// SIGALRM
signalAction.sa_handler = alarmSignalHandler;
signalAction.sa_flags = 0;
status = sigemptyset(&signalAction.sa_mask);
if (status == -1)
   {
   perror("Failed to initialize SIGALRM signal set");
   exit(1);
   } // End if

status = sigaction(SIGALRM, &signalAction, NULL);
if (status == -1)
   {
   perror("Failed to initialize SIGALRM signal action");
   exit(1);
   } // End if

// SIGTERM
signalAction.sa_handler = terminateSignalHandler;
signalAction.sa_flags = 0;
status = sigemptyset(&signalAction.sa_mask);
if (status == -1)
   {
   perror("Failed to initialize SIGTERM signal set");
   exit(1);
   } // End if

status = sigaction(SIGTERM, &signalAction, NULL);
if (status == -1)
   {
   perror("Failed to initialize SIGTERM signal action");
   exit(1);
   } // End if

// SIGABRT
signalAction.sa_handler = abortSignalHandler;
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


// SIGCHILD
signalAction.sa_handler = childSignalHandler;
signalAction.sa_flags = 0;
status = sigemptyset(&signalAction.sa_mask);
if (status == -1)
   {
   perror("Failed to initialize SIGCHILD signal set");
   exit(1);
   } // End if

status = sigaction(SIGCHLD, &signalAction, NULL);
if (status == -1)
   {
   perror("Failed to initialize SIGCHILD signal action");
   exit(1);
   } // End if

} // End registerSignalHandlers


// ********************************************************
void floatingPointErrorSignalHandler(int signalNbr)
{
char message[] = "\n(SIGFPE) Arithmetic error has occurred\n";

write(STDERR_FILENO, message, strlen(message));
exit(1);
} // End floatingPointErrorSignalHandler


// ********************************************************
void segmentationFaultSignalHandler(int signalNbr)
{
char message[] = 
    "\n(SIGSEGV) A critical error has occurred, so the program is ending now\n";

write(STDERR_FILENO, message, strlen(message));
exit(1);
} // End segmentationFaultSignalHandler


// ********************************************************
void interruptSignalHandler(int signalNbr)
{
char message[] = "\n(SIGINT) Control C interrupt has occurred\n";

write(STDERR_FILENO, message, strlen(message));
} // End interruptSignalHandler


// ********************************************************
void terminateSignalHandler(int signalNbr)
{
char message[] = 
      "\n(SIGTERM) The program has received the terminate signal\n";

write(STDERR_FILENO, message, strlen(message));
exit(1);
} // End interruptSignalHandler


// ********************************************************
void alarmSignalHandler(int signalNbr)
{
char message[] = 
    "\n\n(SIGALRM) The time has expired for entry of your user ID\n";

write(STDERR_FILENO, message, strlen(message));
exit(1);
} // End alarmSignalHandler


// ********************************************************
void abortSignalHandler(int signalNbr)
{
char message[] = 
      "\n\n(SIGABRT) Because the assertion failed, this program will now end\n";

write(STDERR_FILENO, message, strlen(message));
exit(1);
} // End alarmSignalHandler



// ********************************************************
void childSignalHandler(int signalNbr)
{
const int MAX_SIZE = 200;
char message[MAX_SIZE];
pid_t childPID;

childPID = wait(NULL);

snprintf(message, MAX_SIZE, "\n(SIGCHLD) Received wait call for child #%d \n", childPID);

write(STDERR_FILENO, message, strlen(message));
} // End childSignalHandler



