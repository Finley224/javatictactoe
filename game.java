import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class tictactoe {
    public static void printGrid(Dictionary<Integer, String> gameGrid) {
        System.out.println(" " + gameGrid.get(1) + " | " + gameGrid.get(2) + " | " + gameGrid.get(3) + " \n---+---+---\n " + gameGrid.get(4) + " | " + gameGrid.get(5) + " | " + gameGrid.get(6) + " \n---+---+---\n " + gameGrid.get(7) + " | " + gameGrid.get(8) + " | " + gameGrid.get(9) + " ");
    }
    public static void main(String[] args) {
        Dictionary<Integer, String> gameGrid = new Hashtable<>();
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
        printGrid(numGrid);
        System.out.println("Pick where to make a move, enter the number of the spot you want to move to.");

    }
}
