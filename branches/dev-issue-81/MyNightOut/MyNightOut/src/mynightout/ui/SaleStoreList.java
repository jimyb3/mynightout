/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.ui;


import javax.swing.ImageIcon;

/**
 *
 * @author Mustaine
 */
public class SaleStoreList extends javax.swing.JFrame {

    /**
     * Creates new form SaleStoreList
     */
    public SaleStoreList() {
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

        jLabel1 = new javax.swing.JLabel();
        SaleStore1 = new javax.swing.JButton();
        SaleStore2 = new javax.swing.JButton();
        SaleStore3 = new javax.swing.JButton();
        SaleStore4 = new javax.swing.JButton();
        SaleStore5 = new javax.swing.JButton();
        SaleStore6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setText("Φοιτητικές Προσφορές");

        SaleStore1.setText("Πύλη Αξιού");
        SaleStore1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaleStore1ActionPerformed(evt);
            }
        });

        SaleStore2.setText("Κατάστημα2");
        SaleStore2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaleStore2ActionPerformed(evt);
            }
        });

        SaleStore3.setText("Κατάστημα3");
        SaleStore3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaleStore3ActionPerformed(evt);
            }
        });

        SaleStore4.setText("Κατάστημα4");
        SaleStore4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaleStore4ActionPerformed(evt);
            }
        });

        SaleStore5.setText("Κατάστημα5");
        SaleStore5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaleStore5ActionPerformed(evt);
            }
        });

        SaleStore6.setText("Κατάστημα6");
        SaleStore6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaleStore6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SaleStore4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SaleStore1, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SaleStore2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(SaleStore5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SaleStore3, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(SaleStore6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SaleStore3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SaleStore2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(SaleStore1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SaleStore4, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(SaleStore5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SaleStore6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaleStore1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaleStore1ActionPerformed
        // TODO add your handling code here:
        StoreView SV = new StoreView();
        SV.setVisible(true);
        SV.StoreDesc.setText("Περιγραφη μαγαζιου 1");

        SV.StorePic.setIcon(new ImageIcon(getClass().getResource("/mynightout.resources/aksiou.jpg")));
    }//GEN-LAST:event_SaleStore1ActionPerformed

    private void SaleStore2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaleStore2ActionPerformed
        // TODO add your handling code here:
        StoreView SV = new StoreView();
        SV.setVisible(true);
        SV.StoreDesc.setText("Περιγραφη μαγαζιου 2");
    }//GEN-LAST:event_SaleStore2ActionPerformed

    private void SaleStore3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaleStore3ActionPerformed
        // TODO add your handling code here:
        StoreView SV = new StoreView();
        SV.setVisible(true);
        SV.StoreDesc.setText("Περιγραφη μαγαζιου 3");
    }//GEN-LAST:event_SaleStore3ActionPerformed

    private void SaleStore4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaleStore4ActionPerformed
        // TODO add your handling code here:
        StoreView SV = new StoreView();
        SV.setVisible(true);
        SV.StoreDesc.setText("Περιγραφη μαγαζιου 4");
    }//GEN-LAST:event_SaleStore4ActionPerformed

    private void SaleStore5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaleStore5ActionPerformed
        // TODO add your handling code here:
        StoreView SV = new StoreView();
        SV.setVisible(true);
        SV.StoreDesc.setText("Περιγραφη μαγαζιου 5");
    }//GEN-LAST:event_SaleStore5ActionPerformed

    private void SaleStore6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaleStore6ActionPerformed
        // TODO add your handling code here:
        StoreView SV = new StoreView();
        SV.setVisible(true);
        SV.StoreDesc.setText("Περιγραφη μαγαζιου 6");
    }//GEN-LAST:event_SaleStore6ActionPerformed

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
            java.util.logging.Logger.getLogger(SaleStoreList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaleStoreList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaleStoreList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaleStoreList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaleStoreList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SaleStore1;
    private javax.swing.JButton SaleStore2;
    private javax.swing.JButton SaleStore3;
    private javax.swing.JButton SaleStore4;
    private javax.swing.JButton SaleStore5;
    private javax.swing.JButton SaleStore6;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
