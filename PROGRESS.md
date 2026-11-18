# 📊 DSA Progress Tracker

## Current Status
- **Start Date:** February 2, 2026
- **Current Day:** Day 22 (Week 3 Completed ✅)
- **Problems Solved:** 34
- **Current Topic:** Dynamic Programming, Contest Simulation & Master Verification

---

## Daily Log

### Week 1-2: Arrays, Strings, Linked Lists, Stacks & Sorting

| Day | Date | Topic | Problem 1 | Problem 2 | Status |
|-----|------|-------|-----------|-----------|--------|
| 1 | Feb 02 | Arrays | Find Maximum | Find Minimum | ✅ |
| 2 | Feb 03 | Arrays | Sum of Array | Two Sum | ✅ |
| 3 | Feb 04 | Arrays | Max Profit | Max SubArray | ✅ |
| 4 | Feb 05 | Arrays | Product Except Self | Contains Duplicate | ✅ |
| 5 | Feb 06 | Strings | Valid Anagram | Check Palindrome | ✅ |
| 6 | Feb 07 | Linked List | Middle Node | Merge Two Nodes | ✅ |
| 7 | Feb 08 | Linked List | Linked List Cycle | Intersection List | ✅ |
| 8 | Feb 09 | Linked List | Add Two Numbers | Reverse Linked List | ✅ |
| 9 | Feb 10 | Linked List | Palindrome Linked List | Remove Nth Node From End | ✅ |
| 10 | Feb 11 | Stacks | Min Stack | Daily Temperatures | ✅ |
| 11 | Feb 12 | Two Pointers | Container With Most Water | Valid Parentheses | ✅ |
| 12 | Feb 13 | Sliding Window | Longest Substring Without Repeating | Subarray Sum Equals K | ✅ |
| 13 | Feb 14 | Searching | Binary Search | Search In Rotated Sorted Array | ✅ |
| 14 | Feb 15 | Sorting | Merge Sort | Cyclic Sort | ✅ |
| 15 | Feb 16 | Review & Prep | Complexity Analysis | System Specs | ✅ |

### Week 3: Trees, Graphs, Hash Tables & Dynamic Programming

| Day | Date | Topic | Problem 1 | Problem 2 | Status |
|-----|------|-------|-----------|-----------|--------|
| 16 | Feb 17 | Trees | Invert Binary Tree | Maximum Depth of Binary Tree | ✅ |
| 17 | Feb 18 | Graphs | Number of Islands | Graph DFS & BFS Review | ✅ |
| 18 | Feb 19 | Dynamic Programming | Climbing Stairs | Fibonacci Tabulation | ✅ |
| 19 | Feb 20 | Two Pointers | Two Sum II (Sorted) | Palindrome Check | ✅ |
| 20 | Feb 21 | Sliding Window | Max Sum Subarray of Size K | Min Subarray Len | ✅ |
| 21 | Feb 22 | Challenge Review | Coin Change (LeetCode 322) | Contest Simulation (Special Array) | ✅ |
| 22 | Feb 23 | Weekly Synthesis | House Robber (LeetCode 198) | Master Test Suite & Repo Optimization | ✅ |

### Week 4: Heaps, Advanced Graphs & Backtracking (Upcoming Preview)

| Day | Date | Topic | Problem 1 | Problem 2 | Status |
|-----|------|-------|-----------|-----------|--------|
| 23 | Feb 24 | Heaps / Priority Queue | Kth Largest Element | Merge K Sorted Lists | ⬜ |
| 24 | Feb 25 | Graph Algorithms | Dijkstra's Shortest Path | Disjoint Set Union (Union-Find) | ⬜ |
| 25 | Feb 26 | Topological Sort | Course Schedule I | Course Schedule II | ⬜ |
| 26 | Feb 27 | Backtracking | Subsets (Power Set) | Permutations | ⬜ |
| 27 | Feb 28 | Backtracking / DP | Combination Sum | Longest Common Subsequence | ⬜ |

**Legend:** ⬜ Pending | 🟡 In Progress | ✅ Completed

---

## Statistics

| Week | Problems Completed | Accuracy | Notes |
|------|-------------------|----------|-------|
| 1 | 10/14 | 100% | Arrays & Strings Basics completed |
| 2 | 10/14 | 100% | Linked Lists, Stacks, Searching & Sorting patterns |
| 3 | 14/14 | 100% | Trees, Graphs, Advanced DP (Coin Change, House Robber), Two Pointers & Contest Setup |
| **Total** | **34 Solved** | **100%** | **Comprehensive unit tests integrated in `RunAllTests.java`** |

---

## Notes & Learnings

### Monotonic Stack Pattern:
- Used in `DailyTemperatures.java` to solve next greater element problems in O(N) linear time.

### Fast & Slow Pointers:
- Used in `PalindromeLinkedList.java` to locate the mid-point of a singly linked list in O(N) time and O(1) space.

### Tree Inversion & Traversals:
- Recursive DFS swaps left and right child pointers at each node in O(N) time. Iterative level-order queue achieves the same in O(N) space.

### 1D Dynamic Programming:
- In `ClimbingStairs.java`, space complexity can be optimized from O(N) array tabulation to O(1) using just two state variables tracking the last two steps.
- In `HouseRobber.java` (LeetCode 198), recurrence `dp[i] = max(dp[i-1], dp[i-2] + nums[i])` is optimized to O(1) space using `prev1` and `prev2`.

### Unbounded Knapsack (Coin Change):
- In `CoinChange.java` (LeetCode 322), the state `dp[i]` represents minimum coins to form amount `i`. Inner coin loop builds solutions bottom-up in O(amount * n) time.

### Contest Counting / Suffix Array Pattern:
- In `WeeklyContest_SpecialArray.java` (LeetCode 1608), counting elements equal to or exceeding candidate `x` enables solving in O(N) linear time via suffix sums rather than brute force O(N^2).

---

> 💡 **Tip:** Update this file daily after completing your problems!
