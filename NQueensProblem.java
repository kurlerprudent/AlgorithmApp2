import java.util.Scanner;

public class NQueensProblem {
    private int n;
    private int[][] board;

    public NQueensProblem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of queens: ");
        n = scanner.nextInt();
        board = new int[n][n];
        
    }

    public boolean isSafe(int row, int col) {
        // Check this row on the left side
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }
        // Check upper diagonal on the left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        // Check lower diagonal on the left side
        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    public boolean solveNQueens(int col) {
        if (col == n) {
            printBoard();
            return true;
        }
        boolean result = false;
        for (int i = 0; i < n; i++) {
            if (isSafe(i, col)) {
                board[i][col] = 1;
                result = solveNQueens(col + 1) || result;
                board[i][col] = 0;
            }
        }
        return result;
    }

    public void printBoard() {
        System.out.println("Solution:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}