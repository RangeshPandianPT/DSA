/* Task
Complete the code in the editor below. The variables , , and  are already declared and initialized for you. You must:

Declare  variables: one of type int, one of type double, and one of type String.
Read  lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your  variables.
Use the  operator to perform the following operations:
Print the sum of  plus your int variable on a new line.
Print the sum of  plus your double variable to a scale of one decimal place on a new line.
Concatenate  with the string you read as input and print the result on a new line.
*/

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int i = 4;
    double d = 4.0;
    char s[] = "HackerRank ";


    int i2;
    double d2;
    char s2[1000];

    scanf("%d", &i2);

    scanf("%lf", &d2);

    getchar();

    fgets(s2, sizeof(s2), stdin);

    size_t len = strlen(s2);
    if (len > 0 && s2[len - 1] == '\n') {
        s2[len - 1] = '\0';
    }

    printf("%d\n", i + i2);
    printf("%.1f\n", d + d2);
    printf("%s%s\n", s, s2);

    
   
    return 0;
}