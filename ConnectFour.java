public class ConnectFour {
    private final int[][] board;
    public ConnectFour() {
        board = new int[6][7];
    }

    public void getBoard() {
        System.out.println("    a b c d e f g");
        for (int i = 0; i < 6; i++) {
            System.out.print((i+1) + "  ");
            System.out.print("[");
            for (int j =0; j < 7; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("]");
        }
    }

    public boolean playerOneMove(String input) {
        try {
            char posOne = input.charAt(0);
            int tempOne = posOne - 96;
            System.out.println(tempOne);
            for (int i = 5; i >= 0; i--) {
                if ((this.board[i][tempOne-1] == 0)) {
                    this.board[i][tempOne-1] = 1;
                    return false;
                }
            }

            System.out.println("Column is full!");
            return true;
        }
        catch (Exception e) {
            System.out.println("Invalid input");
        }

        return true;
    }

    public boolean playerTwoMove(String input) {
        try {
            char posOne = input.charAt(0);
            int tempOne = posOne - 96;
            System.out.println(tempOne);
            for (int i = 5; i >= 0; i--) {
                if ((this.board[i][tempOne-1] == 0)) {
                    this.board[i][tempOne-1] = 2;
                    return false;
                }
            }

            System.out.println("Column is full!");
            return true;
        }
        catch (Exception e) {
            System.out.println("Invalid input");
        }

        return true;
    }

    public boolean hasWon() {
        for (int i = 0; i <= 5; i++) {
            int j = 0;
            int count = 0;
            while (j < 6) {
                if (board[i][j] != 0) {
                    if (board[i][j] == board[i][j + 1]) {
                        count++;
                    } else {
                        count = 0;
                    }

                    if (count == 4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
