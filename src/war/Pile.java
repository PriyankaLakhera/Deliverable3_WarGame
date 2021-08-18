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
public class Pile {

    Pile() {
        pile = new Card[52];
        front = 0;
        end = 0;
    }

    int getSize() {
        return end - front;
    }

    void clear() {
        front = 0;
        end = 0;
    }

    void addCard(Card c) {
        pile[end] = c;
        end++;
    }

    void addCards(Pile p) {
        while (p.getSize() > 0) {
            addCard(p.nextCard());
        }
    }

    Card nextCard() {
        if (front == end) {
            return null; // should not happen
        }
        Card c = pile[front];
        front++;
        return c;
    }
    private Card[] pile;
    private int front, end;

}
