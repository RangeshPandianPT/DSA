# 📚 Arrays - Concept Guide

## What is an Array?
An array is a **contiguous block of memory** storing elements of the same data type.

```java
// Declaration
int[] numbers = new int[5];        // Fixed size
int[] values = {1, 2, 3, 4, 5};    // With initialization
```

## Key Operations & Complexity

| Operation | Time | Space |
|-----------|------|-------|
| Access by index | O(1) | O(1) |
| Search (unsorted) | O(n) | O(1) |
| Search (sorted) | O(log n) | O(1) |
| Insert at end | O(1) | O(1) |
| Insert at position | O(n) | O(1) |
| Delete | O(n) | O(1) |

## Common Patterns

### 1. Linear Traversal
```java
for (int i = 0; i < arr.length; i++) {
    // Process arr[i]
}
```

### 2. Two Pointers
```java
int left = 0, right = arr.length - 1;
while (left < right) {
    // Compare/swap arr[left] and arr[right]
}
```

### 3. Sliding Window
```java
int windowSum = 0;
for (int i = 0; i < k; i++) windowSum += arr[i];
for (int i = k; i < arr.length; i++) {
    windowSum += arr[i] - arr[i-k];
}
```

## Problems in This Section

| Day | Problems |
|-----|----------|
| Day 1 | Find Max, Find Min |
| Day 2 | Reverse Array, Rotate Array |
| Day 3 | Find Duplicates, Remove Duplicates |

## Tips
- Always check for **empty/null arrays**
- Consider **edge cases**: single element, all same elements
- Think about **in-place** vs **extra space** solutions
