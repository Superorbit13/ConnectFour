import java.util.*;
public class Main {
    public static void main(String[] args) {
        ConnectFour c4 = new ConnectFour();
        c4.getBoard();
        Scanner sc = new Scanner(System.in);
        String input;
        int turnNum = 1;
        int activePlayer = 1;
        System.out.println("Board initialized");
        while (!c4.hasWon()) {
            activePlayer = 2 - turnNum % 2;
            System.out.println("Player " + activePlayer + " turn:");
            input = sc.nextLine();
            if (turnNum % 2 == 1) {
                boolean temp = c4.playerOneMove(input);
                while (temp) {
                    input = sc.nextLine();
                    temp = c4.playerOneMove(input);
                }
            }
            else {
                boolean temp = c4.playerTwoMove(input);
                while (temp) {
                    input = sc.nextLine();
                    temp = c4.playerTwoMove(input);
                }
            }
            c4.getBoard();
            turnNum++;
        }
    }
}
