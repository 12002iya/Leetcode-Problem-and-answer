package SAMPLE;

public class FacilitySurveillance {

    public static boolean isFullyCovered(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] coverage = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 'C')
                {
                    coverage[i][j] = true;
                    if (i - 1 >= 0 && grid[i - 1][j] != 'X') {
                        coverage[i - 1][j] = true;
                    }
                    if (i + 1 < rows && grid[i + 1][j] != 'X') {
                        coverage[i + 1][j] = true;
                    }
                    if (j - 1 >= 0 && grid[i][j - 1] != 'X') {
                        coverage[i][j - 1] = true;
                    }
                    if (j + 1 < cols && grid[i][j + 1] != 'X') {
                        coverage[i][j + 1] = true;
                    }
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '.' && !coverage[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'C', 'X', '.', 'C'},
            {'.', 'X', '.', '.'},
            {'C', '.', 'X', 'C'}
        };

        boolean result = isFullyCovered(grid);

        System.out.println("Is the facility fully covered? " + result);
    }
}
