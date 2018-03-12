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

/**
 *
 * @author Rogier
 */
public class Card {

    private Image charachter;
    private String cardStory;
    private String rightOption = "yes";
    private String leftOption = "no";
    private int[] rightResources;
    private int[] leftResources;

    //String imageName, String cardStory, String rightOption, String leftOption, String[] rightResources, String[] leftResources
    Card(String cardRaw) {
        String[] cardRawArray = cardRaw.trim().split("\n");
        TBDZGame.characterNamePane.setText(cardRawArray[0]);
        Image img = null;
        try {
            System.out.println("asdasdas"+cardRaw.replaceAll("\n", "koekenpan"));
            File pathToFile;
            pathToFile = new File(String.format(getClass().getResource("/Characters/%s.png").toString(),cardRawArray[0]));
            System.out.println("PATH:");
            System.out.println("PATH2 "+pathToFile);
            img = ImageIO.read(pathToFile);
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (NullPointerException ex){
            System.out.println("rekt");
        }
        this.charachter = img;
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
}
