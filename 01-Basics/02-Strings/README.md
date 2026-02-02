# 📚 Strings - Concept Guide

## Strings in Java
Strings are **immutable** sequences of characters. Use `StringBuilder` for modifications.

```java
String str = "Hello";
StringBuilder sb = new StringBuilder("Hello");
char[] chars = str.toCharArray();
```

## Key Methods

| Method | Description | Time |
|--------|-------------|------|
| `charAt(i)` | Get character at index | O(1) |
| `length()` | Get string length | O(1) |
| `substring(i, j)` | Extract substring | O(n) |
| `equals()` | Compare strings | O(n) |
| `toCharArray()` | Convert to char array | O(n) |

## Common Patterns

### 1. Character Frequency
```java
int[] freq = new int[26];
for (char c : str.toCharArray()) {
    freq[c - 'a']++;
}
```

### 2. Two Pointers (Palindrome)
```java
int left = 0, right = str.length() - 1;
while (left < right) {
    if (str.charAt(left) != str.charAt(right)) return false;
    left++; right--;
}
```

### 3. StringBuilder
```java
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.reverse();
String result = sb.toString();
```

## Problems in This Section
| Day | Problems |
|-----|----------|
| Day 4 | Reverse String, Check Palindrome |
| Day 5 | Valid Anagram, First Unique Char |
| Day 6 | Longest Common Prefix, String Compression |
