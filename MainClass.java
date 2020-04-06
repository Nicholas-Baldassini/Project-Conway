//this is a comment. i wrote it
package ProjectConway;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        JButton playButton = new JButton("Play"); //create button
        playButton.setBounds(100, 50, 200, 30); //button size
        screen.add(playButton); //put button on screen
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                //action of button
                screen.getContentPane().setBackground(Color.RED);
            }
        }
        
        );
        
        
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
