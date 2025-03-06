#include <unistd.h>
#include <stdio.h>
#include <sys/types.h>
#include <stdlib.h>
#include <assert.h>


int main(int argc, char *argv[]){
    int timeValue = atoi(argv[1]);
    printf("My PID is: %ld\n", getpid());
    printf("ALARM CLOCK\n");
    pause();
    assert(timeValue <= 30);
    alarm(timeValue);
    for ( ; ; );
    return 0;
} //end main