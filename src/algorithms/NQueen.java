package algorithms;

public class NQueen {
    final int N = 4;

    void printSolution(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j]
                        + " ");
            System.out.println();
        }
    }

    boolean isSafe(int[][] board, int row, int column) {
        int i, j;

        for (i = 0; i < column; i++)
            if (board[row][i] == 1)
                return false;

        for (i = row, j = column; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        for (i = row, j = column; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    boolean solveNQ(int[][] board, int column) {
        if (column >= N)
            return true;

        for (int i = 0; i < N; i++) {
            if (isSafe(board, i, column)) {
                board[i][column] = 1;

                if (solveNQ(board, column + 1))
                    return true;

                board[i][column] = 0;
            }
        }

        return false;
    }

    void solveNQ() {
        int[][] board = { { 0, 0, 0, 0 },
                          { 0, 0, 0, 0 },
                          { 0, 0, 0, 0 },
                          { 0, 0, 0, 0 } };

        if (!solveNQ(board, 0)) {
            System.out.print("Solution does not exist");
            return;
        }

        printSolution(board);
    }

    public void init() {
        NQueen Queen = new NQueen();
        Queen.solveNQ();
    }
}
