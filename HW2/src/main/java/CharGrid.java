// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.
package src.main.java;

public class CharGrid {
    private char[][] grid;

    public CharGrid(char[][] grid) {
        this.grid = grid;
    }

    public int charArea(char ch) {
        int rows = grid.length;
        int cols = grid[0].length;
        int minRow = rows, maxRow = -1;
        int minCol = cols, maxCol = -1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == ch) {
                    if (i < minRow) minRow = i;
                    if (i > maxRow) maxRow = i;
                    if (j < minCol) minCol = j;
                    if (j > maxCol) maxCol = j;
                }
            }
        }
        if (maxRow == -1) {
            return 0;
        }
        return (maxRow - minRow + 1) * (maxCol - minCol + 1);
    }

    public int countPlus() {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                char ch = grid[i][j];
                if (ch == ' ') continue;
                int up = armLength(i, j, -1, 0, ch);
                int down = armLength(i, j, 1, 0, ch);
                int left = armLength(i, j, 0, -1, ch);
                int right = armLength(i, j, 0, 1, ch);
                int min = Math.min(Math.min(up, down), Math.min(left, right));
                if (min >= 1) {
                    count++;
                }
            }
        }
        return count;
    }

    private int armLength(int row, int col, int dRow, int dCol, char ch) {
        int length = 0;
        int r = row + dRow;
        int c = col + dCol;
        while (r >= 0 && r < grid.length && c >= 0 && c < grid[0].length
                && grid[r][c] == ch) {
            length++;
            r += dRow;
            c += dCol;
        }
        return length;
    }
}

