/* Task
To complete this challenge, you must save a line of input from stdin to a variable, print Hello, World. on a single line, and finally print the value of your variable on a second line.
*/

#include <stdio.h>

int main() {
    char inputString[1000];   // buffer to hold input text

    // read a full line of input (including spaces)
    fgets(inputString, sizeof(inputString), stdin);

    // print "Hello, World." on the first line
    printf("Hello, World.\n");

    // print the input string on the second line
    printf("%s", inputString);

    return 0;
}
