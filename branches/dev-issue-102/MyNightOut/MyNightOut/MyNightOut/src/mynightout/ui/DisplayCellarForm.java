/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.ui;

import javax.swing.JFrame;

/**
 *
 * @author Dimitris
 */
public class DisplayCellarForm extends javax.swing.JFrame {

    private String clubName;

    /**
     * Creates new form DisplayCellarForm
     */
    public DisplayCellarForm() {
        initComponents();
    }

    public DisplayCellarForm(String nightClubName) {
        clubName = nightClubName;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        cellarTable = new javax.swing.JTable();
        updateCellarButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        secretClubNameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cellarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Vodka", null},
                {"Whiskey", null},
                {"Wine", null},
                {"Liqeuer", null},
                {"Rum", null},
                {"Tequila", null},
                {"Beer", null}
            },
            new String [] {
                "Ποτά", "Ποσότητα"
            }
        ));
        jScrollPane1.setViewportView(cellarTable);

        updateCellarButton.setText("OK");
        updateCellarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCellarButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Άκυρο");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Πατώντας πάνω στις τιμές μπορείτε να τις επεξεργαστείτε.");

        secretClubNameLabel.setText("jLabel2");
        secretClubNameLabel.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(secretClubNameLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(updateCellarButton)
                        .addGap(161, 161, 161)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelButton)
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(secretClubNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateCellarButton)
                    .addComponent(cancelButton))
                .addGap(74, 74, 74))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        JFrame mainNightClubFrame = new NightclubMainFrame(clubName);
        this.dispose();
        mainNightClubFrame.setLocationRelativeTo(this);
        mainNightClubFrame.setVisible(true);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void updateCellarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCellarButtonActionPerformed
        // TODO add your handling code here:
        ConfirmUpdateCellarForm cucf = new ConfirmUpdateCellarForm(clubName);
        cucf.vodkaValueLabel.setText(cellarTable.getValueAt(0, 1).toString());
        cucf.whiskeyValueLabel.setText(cellarTable.getValueAt(1, 1).toString());
        cucf.wineValueLabel.setText(cellarTable.getValueAt(2, 1).toString());
        cucf.liqueurValueLabel.setText(cellarTable.getValueAt(3, 1).toString());
        cucf.rumValueLabel.setText(cellarTable.getValueAt(4, 1).toString());
        cucf.tequilaValueLabel.setText(cellarTable.getValueAt(5, 1).toString());
        cucf.beerValueLabel.setText(cellarTable.getValueAt(6, 1).toString());
        cucf.nightClubNameLabel.setText(secretClubNameLabel.getText());
        this.dispose();
        cucf.setLocationRelativeTo(this);
        cucf.setVisible(true);
    }//GEN-LAST:event_updateCellarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DisplayCellarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayCellarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayCellarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayCellarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayCellarForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    public javax.swing.JTable cellarTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel secretClubNameLabel;
    private javax.swing.JButton updateCellarButton;
    // End of variables declaration//GEN-END:variables
}
