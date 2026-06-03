# 📂 Advanced Topics

These are challenging but essential for technical interviews!

## Topics

| # | Topic | Key Concepts |
|---|-------|--------------|
| 16 | Dynamic Programming | Memoization, Tabulation, State |
| 17 | Backtracking | Permutations, Combinations, N-Queens |
| 18 | Greedy | Activity Selection, Huffman |
| 19 | Divide & Conquer | Merge Sort, Binary Search |
| 20 | Bit Manipulation | AND, OR, XOR, Shifting |

## DP Framework
```
1. Define state: dp[i] represents...
2. Base case: dp[0] = ...
3. Transition: dp[i] = f(dp[i-1], ...)
4. Answer: dp[n] or max(dp)
```

## Backtracking Template
```java
void backtrack(result, current, start) {
    if (isComplete(current)) {
        result.add(current);
        return;
    }
    for (choice : choices) {
        if (isValid(choice)) {
            make(choice);
            backtrack(result, current, next);
            undo(choice);
        }
    }
}
```

⚠️ Master Basics, Data Structures, and Algorithms first!
