#include <stdio.h>

int factorial(int n) {
    if (n <= 1) {
        return 1;  
    } else {
        return n * factorial(n - 1);  // Recursive call
    }
}

int main() {
    int n;
    scanf("%d", &n);  

    int result = factorial(n);  
    printf("%d\n", result);     

    return 0;
}
