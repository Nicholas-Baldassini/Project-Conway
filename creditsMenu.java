/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectConway;

/**
 *
 * @author nathanhansen
 */
public class creditsMenu extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public creditsMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alex = new java.awt.Label();
        backbutton = new java.awt.Button();
        credits = new java.awt.Label();
        owen = new java.awt.Label();
        nick = new java.awt.Label();
        nate = new java.awt.Label();
        sal = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        alex.setFont(new java.awt.Font("Courier", 0, 24)); // NOI18N
        alex.setForeground(new java.awt.Color(0, 0, 0));
        alex.setText("Alex Wong");
        getContentPane().add(alex);
        alex.setBounds(140, 330, 290, 50);

        backbutton.setActionCommand("QUIT");
        backbutton.setLabel("BACK");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(backbutton);
        backbutton.setBounds(145, 400, 210, 40);

        credits.setFont(new java.awt.Font("Copperplate", 0, 48)); // NOI18N
        credits.setForeground(new java.awt.Color(0, 0, 0));
        credits.setText("CREDITS");
        getContentPane().add(credits);
        credits.setBounds(141, 0, 220, 130);

        owen.setFont(new java.awt.Font("Courier", 0, 24)); // NOI18N
        owen.setForeground(new java.awt.Color(0, 0, 0));
        owen.setText("Owen Jory");
        getContentPane().add(owen);
        owen.setBounds(140, 130, 220, 50);

        nick.setFont(new java.awt.Font("Courier", 0, 24)); // NOI18N
        nick.setForeground(new java.awt.Color(0, 0, 0));
        nick.setText("Nicholas Baldassini");
        getContentPane().add(nick);
        nick.setBounds(140, 180, 290, 50);

        nate.setFont(new java.awt.Font("Courier", 0, 24)); // NOI18N
        nate.setForeground(new java.awt.Color(0, 0, 0));
        nate.setText("Nathan Hansen");
        getContentPane().add(nate);
        nate.setBounds(140, 230, 290, 50);

        sal.setFont(new java.awt.Font("Courier", 0, 24)); // NOI18N
        sal.setForeground(new java.awt.Color(0, 0, 0));
        sal.setText("Sal Papia");
        getContentPane().add(sal);
        sal.setBounds(140, 280, 290, 50);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
        mainMenu mnMnu = new mainMenu();
        mnMnu.setVisible(true);
        dispose(); // closes current frame
    }//GEN-LAST:event_backbuttonActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(creditsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new creditsMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label alex;
    private java.awt.Button backbutton;
    private java.awt.Label credits;
    private java.awt.Label nate;
    private java.awt.Label nick;
    private java.awt.Label owen;
    private java.awt.Label sal;
    // End of variables declaration//GEN-END:variables
}
