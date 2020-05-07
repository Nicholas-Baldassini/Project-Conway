/*
 * this is the gameboard
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProjectConway;
import static ProjectConway.levelSelect.levelSel;
import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.SwingUtilities;

public class GameBoard extends javax.swing.JFrame {
    
    final int width = 200, height = 100;
    Boid[] stuff = {};
    Rule[] rules = {};
    
    boolean play;
    Image offScrImg;
    Graphics offScrGraph;
    
    static int levelSel;
    int tilesLeft;
    
    private void startup(int level){
        for (int y = 0; y < height; y++){
            for (int x = 0; x < width; x++){
                stuff = EOU.add(stuff, new Boid(x, y));
                if (level == 1) {
                    stuff[stuff.length - 1].territory = 1;
                } else {
                    if ((x > (width*0.75)) && ((level == 6) || ((level >= 8) && (level <= 12)))){
                        stuff[stuff.length - 1].territory = 2;
                    } else if (x < (width*0.25)){
                        stuff[stuff.length - 1].territory = 1;
                    }
                }
            }
        }
        
    }
    
    private void setup(int level){
        startup(level);
        //To add a new type of boid just copy pasta and change the needed fields
        int[] p = {2, 3};
        int[] q = {3};
        rules = EOU.add(rules, new Rule(1, p, q));
        
        rules = EOU.add(rules, new Rule(2, p, q));
        
        p = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8};
        q = new int[] {};
        rules = EOU.add(rules, new Rule(3, p, q));
        
        q = new int[] {1, 2, 4};
        rules = EOU.add(rules, new Rule(4, p, q));
    }
    
    public GameBoard(int level) {
        setup(level);
        
        levelSel = level;
        initComponents();
        offScrImg = createImage(jPanel1.getWidth(), jPanel1.getHeight());
        offScrGraph = offScrImg.getGraphics();
        Timer time = new Timer();
        TimerTask task = new TimerTask(){
            public void run(){
                if (play){
                    for(Boid boid:stuff){
                        boid.update(stuff, rules);
                    }
                    for(Boid boid:stuff){
                        boid.fix();
                    }
                    repain();
                }
            }
        };
        time.scheduleAtFixedRate(task, 0, 100);
        repain();
    }
    
    private void repain(){
        //color the background
        offScrGraph.setColor(jPanel1.getBackground());
        offScrGraph.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
        
        //set the colors of the boxes
        for (Boid thing : stuff) {
            if (thing.state == 0){
                if (thing.territory == 1){
                    offScrGraph.setColor(Color.CYAN);
                    int y = thing.y * jPanel1.getHeight() / height;
                    int x = thing.x * jPanel1.getWidth() / width;
                    offScrGraph.fillRect(x, y, jPanel1.getWidth()/width, jPanel1.getHeight()/height);
                }else if (thing.territory == 2){
                    offScrGraph.setColor(Color.PINK);
                    int y = thing.y * jPanel1.getHeight() / height;
                    int x = thing.x * jPanel1.getWidth() / width;
                    offScrGraph.fillRect(x, y, jPanel1.getWidth()/width, jPanel1.getHeight()/height);
                }
            }else if (thing.state == 1) {
                offScrGraph.setColor(Color.BLUE);
                int y = thing.y * jPanel1.getHeight() / height;
                int x = thing.x * jPanel1.getWidth() / width;
                offScrGraph.fillRect(x, y, jPanel1.getWidth()/width, jPanel1.getHeight()/height);
            }else if (thing.state == 2) {
                offScrGraph.setColor(Color.RED);
                int y = thing.y * jPanel1.getHeight() / height;
                int x = thing.x * jPanel1.getWidth() / width;
                offScrGraph.fillRect(x, y, jPanel1.getWidth()/width, jPanel1.getHeight()/height);
            }else if (thing.state == 3){
                offScrGraph.setColor(Color.BLACK);
                int y = thing.y * jPanel1.getHeight() / height;
                int x = thing.x * jPanel1.getWidth() / width;
                offScrGraph.fillRect(x, y, jPanel1.getWidth()/width, jPanel1.getHeight()/height);
            }else if (thing.state == 4){
                offScrGraph.setColor(Color.PINK);
                int y = thing.y * jPanel1.getHeight() / height;
                int x = thing.x * jPanel1.getWidth() / width;
                offScrGraph.fillRect(x, y, jPanel1.getWidth()/width, jPanel1.getHeight()/height);
            }
        }
        
        //set the color of the lines to black
        offScrGraph.setColor(Color.BLACK);
        for (int i = 1; i < height; i++){
            int y = i*jPanel1.getHeight()/height;
            offScrGraph.drawLine(0, y, jPanel1.getWidth(), y);
        }
        for (int j = 1; j < width; j++){
            int x = j*jPanel1.getWidth()/width;
            offScrGraph.drawLine(x, 0, x, jPanel1.getHeight());
        }
        
        //draw everything
        jPanel1.getGraphics().drawImage(offScrImg, 0, 0, jPanel1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PlayButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        MenuButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentResized(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
        );

        PlayButton.setText("Play");
        PlayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayButtonActionPerformed(evt);
            }
        });

        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        MenuButton.setText("Menu");
        MenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("number of tiles");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PlayButton)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(MenuButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BackButton)
                        .addGap(18, 18, 18)
                        .addComponent(ResetButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PlayButton)
                    .addComponent(ResetButton)
                    .addComponent(BackButton)
                    .addComponent(MenuButton)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayButtonActionPerformed
        play = !play; //switch play variable on and off uppon click
        
        //shange the text of the play button
        if (play) PlayButton.setText("Pause"); 
        else PlayButton.setText("Play");
        //jLabel1.setText("Level" + Integer.toString(levelSel()));
        repain(); //update the squares
    }//GEN-LAST:event_PlayButtonActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        //get the square that was clicked
        int j = width * evt.getX()/jPanel1.getWidth();
        int i = height * evt.getY()/jPanel1.getHeight();

        //update the square
        for (Boid boid: stuff){
            if (boid.x == j && boid.y == i){
                if ((boid.state == 0) && (boid.territory == 1)){
                    boid.newstate = boid.territory;
                    boid.state = boid.territory;
                }else{
                    boid.newstate = 0;
                    boid.state = 0;
                }
            }
        }
        repain();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentResized
        //draw the graph relative to the size of the screen
        offScrImg = createImage(jPanel1.getWidth(), jPanel1.getHeight());
        offScrGraph = offScrImg.getGraphics();
        repain();
        jLabel1.setText("tiles left");
    }//GEN-LAST:event_jPanel1ComponentResized

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        //reset all the squares
        for (Boid boid:stuff){
            boid.state = 0;
            boid.newstate = 0;
            boid.territory = 0;
        }
        startup(levelSel);
        repain();
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        /*
        int j = width * evt.getX()/jPanel1.getWidth();
        int i = height * evt.getY()/jPanel1.getHeight();
        if (SwingUtilities.isLeftMouseButton(evt)){
            currentMove[i][j] = true;
        } else currentMove[i][j] = true;
        repain();
        */
    }//GEN-LAST:event_jPanel1MouseDragged

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        //go back to the level select screen
        levelSelect lvlSel = new levelSelect();
        lvlSel.setVisible(true);
        dispose(); // closes current frame
    }//GEN-LAST:event_BackButtonActionPerformed

    private void MenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuButtonActionPerformed
        // go to main menu screen
        mainMenu mnMnu = new mainMenu();
        mnMnu.setVisible(true);
        dispose(); // closes current frame
    }//GEN-LAST:event_MenuButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameBoard(levelSel).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton MenuButton;
    private javax.swing.JButton PlayButton;
    private javax.swing.JButton ResetButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
