//this is a comment. i wrote it
package ProjectConway;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainClass extends JFrame{
    public static void main(String[] args){
        mainScreen();
    }
    
    
    public static void mainScreen(){
        //creating the screen
        JFrame screen = new JFrame("Conway Game"); // creates the screen variable, sets the title to what is in the brackets
        screen.setSize(400, 500); // sets the size of the screen
        screen.setVisible(true); // displays the screen
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // tells the program to stop running when you click x
        //setting the color
        Color customColor = new Color(0, 0, 0);
        screen.getContentPane().setBackground(Color.GRAY);
        
        //title
        JLabel title = new JLabel("Conway");
        title.setBounds(180, 30, 70, 30);
        title.setBackground(Color.BLACK);
        title.setForeground(Color.BLACK);
        screen.add(title);
        
        //play button
        JButton playButton = new JButton("Play"); //create button
        playButton.setBounds(100, 80, 200, 30); //button size
        screen.add(playButton); //put button on screen
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                //action of button
                playScreen();
            }
        }
        ); //end button function
    }
    
    public static void playScreen(){
        //creating the screen
        JFrame screen = new JFrame("Conway Main Menue"); // creates the screen variable, sets the title to what is in the brackets
        screen.setSize(400, 500); // sets the size of the screen
        screen.setVisible(true); // displays the screen
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // tells the program to stop running when you click x
        screen.getContentPane().setBackground(Color.GRAY);
        
        //title
        JLabel title = new JLabel("Select Level");
        title.setBounds(170, 30, 90, 30);
        title.setBackground(Color.BLACK);
        title.setForeground(Color.BLACK);
        screen.add(title);
        
        //back button
        JButton backButton = new JButton("Back"); //create button
        backButton.setBounds(100, 80, 200, 30); //button size
        screen.add(backButton); //put button on screen
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                //action of button
                mainScreen();
            }
        }
        ); //end button function
    }
    
}
