//this is a comment. i wrote it
package ProjectConway;

import javax.swing.*;
import java.awt.*;

public class MainClass extends JFrame{
    public static void main(String[] args){
        
        //creating the screen
        JFrame screen = new JFrame("Conway Main Menue"); // creates the screen variable, sets the title to what is in the brackets
        screen.setSize(400, 500); // sets the size of the screen
        screen.setVisible(true); // displays the screen
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // tells the program to stop running when you click x
        //setting the color
        Color customColor = new Color(0, 0, 0);
        screen.getContentPane().setBackground(Color.GRAY);
        
        //play button
        
        
        /*
        for(int i =0; i<11; i++){
            EOU.println(i);
        }
        
        boolean swingworks = false;
        while (swingworks) {
            EOU.print("oeuf ");
        }
*/
    }
}
