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
public class levelSelect extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public levelSelect() {
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

        levelselect = new java.awt.Label();
        backbutton = new java.awt.Button();
        level1 = new java.awt.Button();
        level2 = new java.awt.Button();
        level3 = new java.awt.Button();
        level4 = new java.awt.Button();
        level5 = new java.awt.Button();
        level6 = new java.awt.Button();
        level7 = new java.awt.Button();
        level8 = new java.awt.Button();
        level9 = new java.awt.Button();
        level10 = new java.awt.Button();
        level11 = new java.awt.Button();
        level12 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        levelselect.setFont(new java.awt.Font("Copperplate", 0, 48)); // NOI18N
        levelselect.setForeground(new java.awt.Color(0, 0, 0));
        levelselect.setText("LEVEL SELECT");
        getContentPane().add(levelselect);
        levelselect.setBounds(70, 20, 360, 150);

        backbutton.setActionCommand("QUIT");
        backbutton.setLabel("BACK");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(backbutton);
        backbutton.setBounds(140, 410, 200, 40);

        level1.setLabel("1");
        level1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level1ActionPerformed(evt);
            }
        });
        getContentPane().add(level1);
        level1.setBounds(130, 170, 40, 40);

        level2.setLabel("2");
        level2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level2ActionPerformed(evt);
            }
        });
        getContentPane().add(level2);
        level2.setBounds(190, 170, 40, 40);

        level3.setLabel("3");
        level3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level3ActionPerformed(evt);
            }
        });
        getContentPane().add(level3);
        level3.setBounds(250, 170, 40, 40);

        level4.setLabel("4");
        level4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level4ActionPerformed(evt);
            }
        });
        getContentPane().add(level4);
        level4.setBounds(310, 170, 40, 40);

        level5.setLabel("5");
        level5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level5ActionPerformed(evt);
            }
        });
        getContentPane().add(level5);
        level5.setBounds(130, 240, 40, 40);

        level6.setLabel("6");
        level6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level6ActionPerformed(evt);
            }
        });
        getContentPane().add(level6);
        level6.setBounds(190, 240, 40, 40);

        level7.setLabel("7");
        level7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level7ActionPerformed(evt);
            }
        });
        getContentPane().add(level7);
        level7.setBounds(250, 240, 40, 40);

        level8.setLabel("8");
        level8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level8ActionPerformed(evt);
            }
        });
        getContentPane().add(level8);
        level8.setBounds(310, 240, 40, 40);

        level9.setLabel("9");
        level9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level9ActionPerformed(evt);
            }
        });
        getContentPane().add(level9);
        level9.setBounds(130, 310, 40, 40);

        level10.setLabel("10");
        level10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level10ActionPerformed(evt);
            }
        });
        getContentPane().add(level10);
        level10.setBounds(190, 310, 40, 40);

        level11.setLabel("11");
        level11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level11ActionPerformed(evt);
            }
        });
        getContentPane().add(level11);
        level11.setBounds(250, 310, 40, 40);

        level12.setLabel("12");
        level12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level12ActionPerformed(evt);
            }
        });
        getContentPane().add(level12);
        level12.setBounds(310, 310, 40, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void level11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_level11ActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
        mainMenu mnMnu = new mainMenu();
        mnMnu.setVisible(true);
    }//GEN-LAST:event_backbuttonActionPerformed

    private void level1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_level1ActionPerformed

    private void level2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_level2ActionPerformed

    private void level3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_level3ActionPerformed

    private void level4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_level4ActionPerformed

    private void level5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_level5ActionPerformed

    private void level6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_level6ActionPerformed

    private void level7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_level7ActionPerformed

    private void level8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_level8ActionPerformed

    private void level9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_level9ActionPerformed

    private void level10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_level10ActionPerformed

    private void level12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_level12ActionPerformed

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
            java.util.logging.Logger.getLogger(levelSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(levelSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(levelSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(levelSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new levelSelect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button backbutton;
    private java.awt.Button level1;
    private java.awt.Button level10;
    private java.awt.Button level11;
    private java.awt.Button level12;
    private java.awt.Button level2;
    private java.awt.Button level3;
    private java.awt.Button level4;
    private java.awt.Button level5;
    private java.awt.Button level6;
    private java.awt.Button level7;
    private java.awt.Button level8;
    private java.awt.Button level9;
    private java.awt.Label levelselect;
    // End of variables declaration//GEN-END:variables
}
