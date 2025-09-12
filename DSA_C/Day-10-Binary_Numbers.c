#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    int maxCount = 0, currentCount = 0;

    while (n > 0) {
        if (n % 2 == 1) { 
        
            currentCount++;
            if (currentCount > maxCount) {
                maxCount = currentCount;
            }
        } else {
           
            currentCount = 0;
        }
        n = n / 2; 
    }

    printf("%d\n", maxCount);
    return 0;
}
