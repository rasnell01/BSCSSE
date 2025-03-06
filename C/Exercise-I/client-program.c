///////////////////////////////////////////////////////////////////
// Student name: Ryan Snell
// Course: COSC3503
// Assignment: #12 - Client-Server FIFOs
// File name: client-program.c
// Purpose: Implements the client software that will send a request
//          to the server via a server FIFO and read the answer sent
//          back by the server via a FIFO set up by the client
// Limitations: See the #define constants
// Assumptions: The server program uses the FIFO communication protocol that is
//              expected by this client program
// Development Computer: 2023 14" MacBook Pro (M3 Pro)
// Operating System: MacOS
// Integrated Development Environment (IDE): CLion
// Compiler: gcc
// Operational Status:
///////////////////////////////////////////////////////////////////


#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <errno.h>
#include <string.h>

#define BUFFER_SIZE  512
#define NAME_SIZE    100
#define SERVER_FIFO_NAME "server.fifo"
#define SHUTDOWN_PHRASE "SHUTDOWN"
#define MAX_OPTION_SIZE 3
#define FALSE 0
#define TRUE 1

// Prototypes
void performClientDuties(char *clientFifoName, int shutdownRequested);


// *******************************************************
int main(int argc, char *argv[])
{

    return 0;
} // End main


// ********************************************************************
void performClientDuties(char *clientFifoName, int shutdownRequested)
{

} // End performClientDuties
