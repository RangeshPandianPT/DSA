import java.util.Scanner;

public class CountNegatives {

    public static int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;

        int i = m - 1;
        int j = 0;

        while (i >= 0 && j < n) {
            if (grid[i][j] < 0) {
                ans += n - j;
                i--;
            } else {
                j++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int m = sc.nextInt();

        System.out.println("Enter number of columns:");
        int n = sc.nextInt();

        int[][] grid = new int[m][n];

        System.out.println("Enter the matrix elements:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int result = countNegatives(grid);

        System.out.println("Number of negative numbers: " + result);

        sc.close();
    }
}