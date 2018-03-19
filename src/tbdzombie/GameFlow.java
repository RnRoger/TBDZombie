/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbdzombie;

/**
 *
 * @author rogie
 */
public class GameFlow {

    public static void main() {
        GameLogic.LoadDefaultDeck();
        GameLogic.ReadEvent();
        GameLogic.ReadCard(0);
    }

    public static void main2() {

    }

    public static void main3() {
        GameLogic.currentEvent.remove(0);
        if (GameLogic.currentEvent.isEmpty()) {
            GameLogic.playDeck.remove(GameLogic.currentEvent);
            if (GameLogic.playDeck.isEmpty()){
                System.out.println("GG");
            } else {
                GameLogic.ReadEvent();
                GameLogic.ReadCard(0);
            }
        } else {
            GameLogic.ReadCard(0);

        }
    }
}
