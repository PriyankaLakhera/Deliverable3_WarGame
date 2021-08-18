/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package war;

/**
 * This class +++Insert Description Here+++
 *
 * @author Saravdeep Singh
 */
public class War {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game g = new Game();
        g.play();
        Player winner = g.getWinner();
        if (winner == null) {
            System.out.println("Tie game.");
        } else {
            System.out.println("\nWinner = "
                    + winner.getName());
        }
    }

}

