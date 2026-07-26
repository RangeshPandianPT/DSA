# 📂 14 - Two Pointers

The **Two Pointers** technique involves using two reference indices to traverse a data structure (usually an array, string, or linked list) in tandem, reducing time complexity from $O(n^2)$ brute force to $O(n)$ linear time.

## Key Patterns
1. **Opposite Direction (Collision):** One pointer starts at the beginning (`left = 0`) and one at the end (`right = n - 1`). They move toward each other until they meet.
   - *Use cases:* Sorted array pair search (Two Sum II), Palindrome verification, Reversing arrays, Container With Most Water.
2. **Same Direction (Fast & Slow):** Both pointers start from the beginning but move at different speeds or conditions.
   - *Use cases:* Removing duplicates in-place, Linked List cycle detection, Finding middle of linked list.
3. **Two Arrays/Lists Merging:** One pointer per list.
   - *Use cases:* Merging two sorted arrays or linked lists, Intersection of two arrays.

## Complexity
- **Time Complexity:** $O(n)$ in most cases since each pointer traverses the array at most once.
- **Space Complexity:** $O(1)$ auxiliary space.
