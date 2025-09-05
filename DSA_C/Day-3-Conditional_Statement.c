#include <stdio.h>

int main() {
    int N;
    scanf("%d", &N);

    if (N % 2 != 0) {
        printf("Weird\n");
    } else {
        if (N >= 2 && N <= 5) {
            printf("Not Weird\n");
        } else if (N >= 6 && N <= 20) {
            printf("Weird\n");
        } else {
            printf("Not Weird\n");
        }
    }

    return 0;
}
