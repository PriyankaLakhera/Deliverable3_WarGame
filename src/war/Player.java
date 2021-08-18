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
public class Player {

    Player(String n) {
        name = n;
        playPile = new Pile();
        wonPile = new Pile();
    }

    Card playCard() {
        if (playPile.getSize() == 0) {
            useWonPile();
        }
        if (playPile.getSize() > 0) {
            return playPile.nextCard();
        }
        return null;
    }

    String getName() {
        return name;
    }

    void collectCard(Card c) {
        wonPile.addCard(c);
    }

    void collectCards(Pile p) {
        wonPile.addCards(p);
    }

    void useWonPile() {
        playPile.clear(); // reset front and end to 0
        playPile.addCards(wonPile);
        wonPile.clear(); // reset front and end to 0
    }

    int numCards() {
        return playPile.getSize() + wonPile.getSize();
    }
    private Pile playPile, wonPile;
    private String name;

}
