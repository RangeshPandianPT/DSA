#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    int arr[n];  // array of size n

    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    for (int i = n - 1; i >= 0; i--) {
        printf("%d", arr[i]);
        if (i > 0) printf(" "); // print space except after last element
    }

    return 0;
}
