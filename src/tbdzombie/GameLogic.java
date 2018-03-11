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

/**
 *
 * @author Rogier
 */
public class GameLogic {

    public static ArrayList<Card[]> playDeck = new ArrayList<>();

    public static void LoadDefaultDeck() {
        playDeck.add(readDeck("defaultDeck"));
    }

    private static Card[] readDeck(String deckName) {
        String line = null;
        String deckContent = "";
        ArrayList<Card[]> newDeck = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("src/Cards/"+deckName+".txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                deckContent += line;
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
            for(String eventRaw : event.split("~~~")){
                String[] cardRaw = eventRaw.split("\n");
                new Card(cardRaw[0],cardRaw[1],cardRaw[2],cardRaw[3],cardRaw[4].split(","),cardRaw[4].split(","));
            }
            newDeck.add(e)
        }
    }

}
