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

    Card(String imageName, String cardStory, String rightOption, String leftOption, String[] rightResources, String[] leftResources) {
        TBDZGame.characterNamePane.setText(imageName);
        Image img = null;
        try {
            File pathToFile = new File(String.format(getClass().getResource("/Characters/%s.png").toString(),imageName));
            img = ImageIO.read(pathToFile);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        this.charachter = img;
        this.cardStory = cardStory;
        this.rightOption = rightOption;
        this.leftOption = leftOption;
        
        this.rightResources = rightResources;
        this.leftResources = leftResources;
    }
}
