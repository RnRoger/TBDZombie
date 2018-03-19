/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbdzombie;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Rogier
 */
public class GameLogic {

    public static ArrayList<ArrayList<Card>> playDeck = new ArrayList<>();
    static ArrayList<Card> currentEvent;
    static Card currentCard;
    static Random rand;
    
    
    public static void LoadDefaultDeck() {
        playDeck.addAll(readDeck("defaultDeck"));
        System.out.println("PLAYDECK:\n"+playDeck);
        for (ArrayList<Card> c : playDeck){
            System.out.println("EVENT");
            for (Card card: c){
                System.out.println(card);
            }
        }
    }

    private static ArrayList<ArrayList<Card>> readDeck(String deckName) {
        String line = null;
        String deckContent = "";
        ArrayList<ArrayList<Card>> newDeck = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("src/Cards/"+deckName+".txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                deckContent += line+"\n";
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + deckName + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + deckName + "'");
        }
        System.out.println("DECK:\n"+deckContent);
        String[] events = deckContent.split("@@@");
        for (String event : events){
            ArrayList<Card> cardList = new ArrayList<>();
            for (String cardRaw : event.split("~~~")){
                cardList.add(new Card(cardRaw));
            }
            newDeck.add(cardList);
        }
        return newDeck;
    }
    
    public static void ReadEvent(){
        rand = new Random();
        System.out.println(">"+rand.nextInt());
        currentEvent = playDeck.get(rand.nextInt(playDeck.size()));
    }
    
    public static void ReadCard(int cardNr){
        currentCard = currentEvent.get(cardNr);
        TBDZGame.putCard(currentCard);
        System.out.println("card read: "+ currentCard.getCharachterName());
    }
}
