package SAMPLE;

import java.util.Scanner;

public class IslandCounter {

    public int numIslands(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int rows = grid.length;
        int cols = grid[0].length;
        int islandCount = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] == 1) {
                    dfs(grid, row, col);
                    islandCount++;
                }
            }
        }
        return islandCount;
    }

    private void dfs(int[][] grid, int row, int col) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == 0) {
            return;
        }

        grid[row][col] = 0;

        dfs(grid, row - 1, col); // Up
        dfs(grid, row + 1, col); // Down
        dfs(grid, row, col - 1); // Left
        dfs(grid, row, col + 1); // Right
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        int[][] grid = new int[rows][cols];
        System.out.println("Enter the grid values row by row (0 for water, 1 for land): ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        IslandCounter counter = new IslandCounter();
        int result = counter.numIslands(grid);
        System.out.println("Number of islands: " + result);

        scanner.close();
    }
}
