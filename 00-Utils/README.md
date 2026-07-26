# 🛠️ DSA Utilities

This directory contains lightweight utility and helper classes to streamline testing, benchmarking, and problem-solving across the entire repository.

## Files
- `TestRunner.java`: Standalone assertion and test runner utility that provides JUnit-like capabilities (`assertEquals`, `assertArrayEquals`, `assertTrue`), execution timing, and formatted pass/fail reporting without requiring external third-party libraries.

## How to Use TestRunner
Import or copy `TestRunner` methods into your solution code or run standalone verification suites:
```java
public static void main(String[] args) {
    TestRunner.startSuite("Two Sum Verification");
    TestRunner.assertArrayEquals("Example 1", new int[]{0, 1}, TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
    TestRunner.endSuite();
}
```
