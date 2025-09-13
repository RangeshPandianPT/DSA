#include <stdio.h>
#include <limits.h>

int main() {
    int arr[6][6];
    
    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 6; j++) {
            scanf("%d", &arr[i][j]);
        }
    }

    int maxSum = INT_MIN; // initialize with very small value

    for (int i = 0; i <= 3; i++) {
        for (int j = 0; j <= 3; j++) {
            int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                                + arr[i+1][j+1]
                    + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
            
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
    }

    printf("%d\n", maxSum);

    return 0;
}
