/**
 * LeetCode 200 - Number of Islands (Medium)
 * Topic: Graphs / Depth-First Search & Breadth-First Search
 *
 * Problem: Given an m x n 2D binary grid which represents a map of '1's (land) and '0's (water),
 * return the number of islands. An island is surrounded by water and is formed by connecting
 * adjacent lands horizontally or vertically.
 *
 * Time Complexity: O(m * n) - Where m is rows and n is columns. We visit every cell at most twice.
 * Space Complexity: O(m * n) - Worst-case recursion stack space when the entire grid is filled with land '1'.
 */
public class NumberOfIslands {

    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int numIslands = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == '1') {
                    numIslands++;
                    dfs(grid, r, c); // Sink the connected island
                }
            }
        }

        return numIslands;
    }

    private static void dfs(char[][] grid, int r, int c) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Base cases: out of bounds or water ('0')
        if (r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] == '0') {
            return;
        }

        // Mark current cell as visited/water ('0') so we don't count it again
        grid[r][c] = '0';

        // Explore all 4 orthogonal directions (up, down, left, right)
        dfs(grid, r - 1, c); // Up
        dfs(grid, r + 1, c); // Down
        dfs(grid, r, c - 1); // Left
        dfs(grid, r, c + 1); // Right
    }

    public static void main(String[] args) {
        System.out.println("--- LeetCode 200: Number of Islands ---");

        char[][] grid1 = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };

        char[][] grid2 = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };

        // Note: we clone or pass fresh copies since dfs mutates the grid by sinking '1's to '0's
        System.out.println("Grid 1 Island Count: " + numIslands(grid1)); // Expected: 1
        System.out.println("Grid 2 Island Count: " + numIslands(grid2)); // Expected: 3
    }
}
