# 📂 15 - Sliding Window

The **Sliding Window** technique is an optimization over nested loops for subarray or substring problems. Instead of re-evaluating overlapping elements from scratch, we maintain a "window" that shifts over the data structure.

## Key Patterns
1. **Fixed Size Window:** The window size $K$ remains constant throughout the traversal.
   - *How it works:* Add the new element at `right` and remove the old element at `left = right - K`.
   - *Use cases:* Maximum/Minimum sum subarray of size K, Average of all subarrays of size K, Anagram anagrams in string.
2. **Variable Size Window:** The window expands or contracts dynamically based on a constraint/condition.
   - *How it works:* Expand `right` until the condition is violated, then shrink `left` until the condition is valid again.
   - *Use cases:* Smallest subarray with sum $\ge S$, Longest substring without repeating characters, Longest repeating character replacement.

## Complexity
- **Time Complexity:** $O(n)$ because both the left and right pointers traverse the array at most once ($2n$ operations total).
- **Space Complexity:** $O(1)$ auxiliary space (or $O(k)$ if storing window frequency counts in a hash map).
