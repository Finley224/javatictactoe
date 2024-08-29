import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class game {
    public static void printGrid(Dictionary<Integer, String> gameGrid) {
        System.out.println(
                " " + gameGrid.get(1) + " | " + gameGrid.get(2) + " | " + gameGrid.get(3)
                        + " \n---+---+---\n " + gameGrid.get(4) + " | " + gameGrid.get(5) + " | " + gameGrid.get(6)
                        + " \n---+---+---\n " + gameGrid.get(7) + " | " + gameGrid.get(8) + " | " + gameGrid.get(9)
                        + " ");
    }

    public static String checkWin(Dictionary<Integer, String> gameGrid) {
        String output = "none";
        // Check if player 1 wins
        // Check if player 1 occupies space 1,2,3
        if (gameGrid.get(1) == "X" && gameGrid.get(2) == "X" && gameGrid.get(3) == "X") {
            output = "X";
        }
        // Check if player 1 occupies space 4,5,6
        if (gameGrid.get(4) == "X" && gameGrid.get(5) == "X" && gameGrid.get(6) == "X") {
            output = "X";
        }
        // Check if player 1 occupies space 7,8,9
        if (gameGrid.get(7) == "X" && gameGrid.get(8) == "X" && gameGrid.get(9) == "X") {
            output = "X";
        }
        // Check if player 1 occupies space 1,4,7
        if (gameGrid.get(1) == "X" && gameGrid.get(4) == "X" && gameGrid.get(7) == "X") {
            output = "X";
        }
        // Check if player 1 occupies space 2,5,8
        if (gameGrid.get(2) == "X" && gameGrid.get(5) == "X" && gameGrid.get(8) == "X") {
            output = "X";
        }
        // Check if player 1 occupies space 3,6,9
        if (gameGrid.get(3) == "X" && gameGrid.get(6) == "X" && gameGrid.get(9) == "X") {
            output = "X";
        }
        // Check if player 1 occupies space 1,5,9
        if (gameGrid.get(1) == "X" && gameGrid.get(5) == "X" && gameGrid.get(9) == "X") {
            output = "X";
        }
        // Check if player 1 occupies space 3,5,7
        if (gameGrid.get(3) == "X" && gameGrid.get(5) == "X" && gameGrid.get(7) == "X") {
            output = "X";
        }

        // Check if player 2 wins
        // Check if player 2 occupies space 1,2,3
        if (gameGrid.get(1) == "O" && gameGrid.get(2) == "O" && gameGrid.get(3) == "O") {
            output = "O";
        }
        // Check if player 2 occupies space 4,5,6
        if (gameGrid.get(4) == "O" && gameGrid.get(5) == "O" && gameGrid.get(6) == "O") {
            output = "O";
        }
        // Check if player 2 occupies space 7,8,9
        if (gameGrid.get(7) == "O" && gameGrid.get(8) == "O" && gameGrid.get(9) == "O") {
            output = "O";
        }
        // Check if player 2 occupies space 1,4,7
        if (gameGrid.get(1) == "O" && gameGrid.get(4) == "O" && gameGrid.get(7) == "O") {
            output = "O";
        }
        // Check if player 2 occupies space 2,5,8
        if (gameGrid.get(2) == "O" && gameGrid.get(5) == "O" && gameGrid.get(8) == "O") {
            output = "O";
        }
        // Check if player 2 occupies space 3,6,9
        if (gameGrid.get(3) == "O" && gameGrid.get(6) == "O" && gameGrid.get(9) == "O") {
            output = "O";
        }
        // Check if player 2 occupies space 1,5,9
        if (gameGrid.get(1) == "O" && gameGrid.get(5) == "O" && gameGrid.get(9) == "O") {
            output = "O";
        }
        // Check if player 2 occupies space 3,5,7
        if (gameGrid.get(3) == "O" && gameGrid.get(5) == "O" && gameGrid.get(7) == "O") {
            output = "O";
        }

        // Check for a tie
        if (gameGrid.get(1) != " " && gameGrid.get(2) != " " && gameGrid.get(3) != " " && gameGrid.get(4) != " " && gameGrid.get(5) != " " && gameGrid.get(6) != " " && gameGrid.get(7) != " " && gameGrid.get(8) != " " && gameGrid.get(9) != " ") {
            output = "Tie";
        }
        return output;
    }

    public static void printPlayGrid(Dictionary<Integer, String> numGrid, Dictionary<Integer, String> gameGrid,
            String player) {
        System.out.println(
                " " + numGrid.get(1) + " | " + numGrid.get(2) + " | " + numGrid.get(3) + "  ||  " + gameGrid.get(1)
                        + " | " + gameGrid.get(2) + " | " + gameGrid.get(3)
                        + " \n---+---+--- || ---+---+---\n " + numGrid.get(4) + " | " + numGrid.get(5) + " | "
                        + numGrid.get(6) + "  ||  " + gameGrid.get(4) + " | " + gameGrid.get(5) + " | "
                        + gameGrid.get(6)
                        + " \n---+---+--- || ---+---+---\n " + numGrid.get(7) + " | " + numGrid.get(8) + " | "
                        + numGrid.get(9) + "  ||  " + gameGrid.get(7) + " | " + gameGrid.get(8) + " | "
                        + gameGrid.get(9));
        System.out.println("Current player is: " + player);
        System.out.println(
                "Pick where to make a move, enter the number of the spot you want to move to (0 to quit game): ");
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

        // Main loop
        while (winner == "none") {
            if (checkWin(gameGrid) == "X") {
                System.out.println("Player X wins the game");
                winner = "X";
            } else if (checkWin(gameGrid) == "O") {
                System.out.println("Player O wins the game");
                winner = "O";
            } else if (checkWin(gameGrid) == "Tie") {
                System.out.println("The game is tied");
                winner = "Tie";
            } else {
                printPlayGrid(numGrid, gameGrid, currentPlayer);
                int moveLoc = getMove.nextInt();
                getMove.nextLine();
                // Move the player
                if (gameGrid.get(moveLoc) == " ") {
                    gameGrid.put(moveLoc, currentPlayer);
                    // Change the current player
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
        }
        getMove.close();
    }
}
