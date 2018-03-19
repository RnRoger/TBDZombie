/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbdzombie;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Rogier
 */
public class Card {

    private ImageIcon character;
    private String characterName;
    private String cardStory;
    private String rightOption = "yes";
    private String leftOption = "no";
    private int[] rightResources;
    private int[] leftResources;

    //String imageName, String cardStory, String rightOption, String leftOption, String[] rightResources, String[] leftResources
    Card(String cardRaw) {
        String[] cardRawArray = cardRaw.trim().split("\n");
        this.characterName = cardRawArray[0];
        try {
            System.out.println(cardRaw);
            File pathToFile;
            System.out.println("CARDARACA");
            //pathToFile = new File(String.format(getClass().getResource("/Characters/%s.png").toString(),cardRawArray[0]));
            this.character= new ImageIcon(String.format("./src/Characters/%s.png",cardRawArray[0]));
        } catch (NullPointerException ex){
            System.out.println("rekt");
        }
        this.cardStory = cardRawArray[1];
        this.rightOption = cardRawArray[2];
        this.leftOption = cardRawArray[3];
        
        String[] rightResourcesString = cardRawArray[4].split(",");
        int[] rightResourcesInt = new int[rightResourcesString.length];
        for (int i = 0; i < rightResourcesString.length; i++){
            rightResourcesInt[i] = Integer.parseInt(rightResourcesString[i]);
        }
        this.rightResources = rightResourcesInt;
        
        String[] leftResourcesString = cardRawArray[4].split(",");
        int[] leftResourcesInt = new int[leftResourcesString.length];
        for (int i = 0; i < leftResourcesString.length; i++){
            leftResourcesInt[i] = Integer.parseInt(leftResourcesString[i]);
        }
        this.leftResources = leftResourcesInt;
    }

    public ImageIcon getCharacter() {
        return character;
    }
    
    public String getCharachterName() {
        return characterName;
    }

    public String getCardStory() {
        return cardStory;
    }

    public String getRightOption() {
        return rightOption;
    }

    public String getLeftOption() {
        return leftOption;
    }

    public int[] getRightResources() {
        return rightResources;
    }

    public int[] getLeftResources() {
        return leftResources;
    }
    
    
}
