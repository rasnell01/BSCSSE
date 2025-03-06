#include <stdio.h>
#include <assert.h>
#include <ctype.h>
#include <string.h>

#define LEFT_ANGLE_BRACKET '<'
#define RIGHT_ANGLE_BRACKET '>'
//function prototype 
int copyContents(void);

// #############################################################
int main(void)
{
	printf("*** START OF HTML TAGS ***\n");
	int lineCount = 0;
	fprintf(stderr, "Start of program\n");
	lineCount = copyContents();
	fprintf(stderr, "\n*** TOTAL NUMBER OF TAGS FOUND: %d ***\n", lineCount);
	return 0;
} // End main


// #############################################################
int copyContents(void)
{
	char symbol;
	int tagCounter = 0;
	symbol = getchar();

	while (!feof(stdin)) // Check for the end of the file
	{
		if (symbol == LEFT_ANGLE_BRACKET)
		{
   			tagCounter++;
			printf("%c", symbol);
			symbol = getchar();
			while (symbol != RIGHT_ANGLE_BRACKET)
			{
				printf("%c", symbol);
				symbol = getchar();
			}//end while
			printf("%c\n", symbol);
		}//end if
		symbol = getchar();
	} // End while
	return tagCounter;
} // End function
