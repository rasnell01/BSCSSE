#ifndef SIGNAL_HANDLERS_HEADER
#define SIGNAL_HANDLERS_HEADER

#include <stdio.h>
#include <stdlib.h>
#include <signal.h>
#include <unistd.h>
#include <string.h>
#include <sys/wait.h>

// Function Prototypes
void registerSignalHandlers(void);

#endif

