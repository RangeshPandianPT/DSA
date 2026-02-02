# 📚 Math Basics - Concept Guide

## Essential Math for DSA

### 1. Check Prime
```java
boolean isPrime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) return false;
    }
    return true;
}
```

### 2. GCD (Euclidean Algorithm)
```java
int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
}

int lcm(int a, int b) {
    return (a * b) / gcd(a, b);
}
```

### 3. Factorial & Fibonacci
```java
// Factorial (iterative)
long factorial(int n) {
    long result = 1;
    for (int i = 2; i <= n; i++) result *= i;
    return result;
}

// Fibonacci (iterative - O(n))
int fibonacci(int n) {
    if (n <= 1) return n;
    int a = 0, b = 1;
    for (int i = 2; i <= n; i++) {
        int temp = a + b;
        a = b;
        b = temp;
    }
    return b;
}
```

### 4. Power
```java
// O(log n) - Binary Exponentiation
long power(long base, long exp) {
    long result = 1;
    while (exp > 0) {
        if ((exp & 1) == 1) result *= base;
        base *= base;
        exp >>= 1;
    }
    return result;
}
```

## Important Formulas
- Sum of first n: `n * (n + 1) / 2`
- Sum of squares: `n * (n + 1) * (2n + 1) / 6`
- Arithmetic Progression: `a + (n-1) * d`
- Geometric Progression: `a * r^(n-1)`

## Problems in This Section
| Day | Problems |
|-----|----------|
| Day 7 | Check Prime, GCD/LCM |
| Day 8 | Factorial, Fibonacci |
| Day 9 | Power Function, Count Digits |
| Day 10 | Palindrome Number, Armstrong Number |
