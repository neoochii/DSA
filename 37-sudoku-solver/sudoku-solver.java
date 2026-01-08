                                                            class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;

        // Find the first empty cell
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if (!emptyLeft) break;
        }

        // If no empty cells left, Sudoku is solved
        if (emptyLeft) return true;

        // Backtrack: try numbers 1-9
        for (char number = '1'; number <= '9'; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (solve(board)) {
                    return true;
                } else {
                    // Backtrack: reset the cell
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }

    private boolean isSafe(char[][] board, int row, int col, char num) {
        // 1. Check the row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num) return false;
        }

        // 2. Check the column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == num) return false;
        }

        // 3. Check the 3x3 grid
        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num) return false;
            }
        }
        return true;
    }
}
