import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class game {
    public static void printGrid(Dictionary<Integer, String> gameGrid) {
        System.out.println(
            " " + gameGrid.get(1) + " | " + gameGrid.get(2) + " | " + gameGrid.get(3)
                + " \n---+---+---\n " + gameGrid.get(4) + " | " + gameGrid.get(5) + " | " + gameGrid.get(6)
                + " \n---+---+---\n " + gameGrid.get(7) + " | " + gameGrid.get(8) + " | " + gameGrid.get(9) + " ");
    }

    public static String checkWin(Dictionary<Integer, String> gameGrid) {
        // Placeholder Code
        return "";
    }

    public static void printPlayGrid(Dictionary<Integer, String> numGrid, Dictionary<Integer, String> gameGrid, String player) {
        System.out.println(
            " " + numGrid.get(1) + " | " + numGrid.get(2) + " | " +numGrid.get(3) + "  ||  " + gameGrid.get(1) + " | " + gameGrid.get(2) + " | " + gameGrid.get(3)
                + " \n---+---+--- || ---+---+---\n " + numGrid.get(4) + " | " + numGrid.get(5) + " | " + numGrid.get(6) + "  ||  " + gameGrid.get(4) + " | " + gameGrid.get(5) + " | " + gameGrid.get(6)
                + " \n---+---+--- || ---+---+---\n " + numGrid.get(7) + " | " + numGrid.get(8) + " | " + numGrid.get(9) + "  ||  " + gameGrid.get(7) + " | " + gameGrid.get(8) + " | " + gameGrid.get(9));
        System.out.println("Current player is: " + player);
        System.out.println("Pick where to make a move, enter the number of the spot you want to move to (0 to quit game): ");
}

    public static void main(String[] args) {
        Dictionary<Integer, String> gameGrid = new Hashtable<>();

        String currentPlayer = "O";
        String player1Name;
        String player2Name;
        String winner = "none";

        // Setup the gamegrid for the new game
        gameGrid.put(1, " ");
        gameGrid.put(2, " ");
        gameGrid.put(3, " ");
        gameGrid.put(4, " ");
        gameGrid.put(5, " ");
        gameGrid.put(6, " ");
        gameGrid.put(7, " ");
        gameGrid.put(8, " ");
        gameGrid.put(9, " ");

        Dictionary<Integer, String> numGrid = new Hashtable<>();
        // Setup the numberGrid for the new game
        numGrid.put(1, "1");
        numGrid.put(2, "2");
        numGrid.put(3, "3");
        numGrid.put(4, "4");
        numGrid.put(5, "5");
        numGrid.put(6, "6");
        numGrid.put(7, "7");
        numGrid.put(8, "8");
        numGrid.put(9, "9");

        Scanner getMove = new Scanner(System.in);

        while (winner == "none") {
            printPlayGrid(numGrid, gameGrid, currentPlayer);
            int moveLoc = getMove.nextInt();
            getMove.nextLine();
            if (checkWin(gameGrid) == "X") {
                winner = "X";
            } else if (checkWin(gameGrid) == "O") {
                winner = "O";
            } else if (gameGrid.get(moveLoc) == " ") {
                gameGrid.put(moveLoc, currentPlayer);

                if (currentPlayer == "O") {
                    currentPlayer = "X";
                } else {
                    currentPlayer = "O";
                }
            } else if (moveLoc == 0) {
                winner = "Program Quit";
            } else {
                System.out.println("Invalid Move Location");
            }
        }
        getMove.close();
    }
}
