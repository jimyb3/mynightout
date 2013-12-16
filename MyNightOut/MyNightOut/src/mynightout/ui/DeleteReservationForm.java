/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.ui;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mynightout.controllers.DeleteReservationController;
import mynightout.dao.NightClubDao;
import mynightout.dao.ReservationDao;
import mynightout.dao.UserDao;
import mynightout.entity.Reservation;
import mynightout.entity.ReservationPk;


/**
 *
 * @author Maria
 */
public class DeleteReservationForm extends javax.swing.JFrame {
//private Vector<Vector<String>> data;
//private Vector<String> header;
    
    private String currentClubName;
    /**
     * Creates new form DeleteReservationForm
     */
    public DeleteReservationForm() {
        initComponents();
    }
public DeleteReservationForm(String nightClubName) {
    currentClubName = nightClubName;
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

        Cancel = new javax.swing.JButton();
        OkButton = new javax.swing.JButton();
        showReservationButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        showReservationsTable = new javax.swing.JTable();
        GivenIdTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        OkButton.setText("OK");
        OkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButtonActionPerformed(evt);
            }
        });

        showReservationButton.setText("Εμφάνηση Κρατήσεων");
        showReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showReservationButtonActionPerformed(evt);
            }
        });

        showReservationsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Όνομα Χρήστη", "ID Κράτησης"
            }
        ));
        jScrollPane1.setViewportView(showReservationsTable);

        GivenIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GivenIdTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Δώσε το ID της κράτησης που θες να διαγράψεις");

        jLabel2.setText("Όνομα Χρήστη");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(GivenIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(OkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showReservationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showReservationButton)
                    .addComponent(jLabel2)
                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(OkButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(Cancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GivenIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
       JFrame mainNightClubFrame=new NightclubMainForm(currentClubName);
            this.dispose();
            mainNightClubFrame.setLocationRelativeTo(this);
            mainNightClubFrame.setVisible(true);
    }//GEN-LAST:event_CancelActionPerformed

    private void OkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButtonActionPerformed
              DeleteReservationController controller=new DeleteReservationController(/*new ReservationDaoDelete()*/);
        try{
            int reservationId=Integer.parseInt(GivenIdTextField.getText());
           //int clubName=Integer.parseInt(givenClubName.getText());
          //  ReservationPk deleteReservation=controller.deleteReservation( givenClubName.getText(),reservationId);
            JOptionPane.showMessageDialog(null,"Το Id της διεγραμένης κράτησης ειναι :" +GivenIdTextField.getText(),
                "Success",JOptionPane.INFORMATION_MESSAGE);
            JFrame mainNightClubFrame=new NightclubMainForm(currentClubName);
            this.dispose();
            mainNightClubFrame.setLocationRelativeTo(this);
            mainNightClubFrame.setVisible(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage(),
                "Failure",JOptionPane.INFORMATION_MESSAGE);
        }
       
    }//GEN-LAST:event_OkButtonActionPerformed

    private void showReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showReservationButtonActionPerformed
       DeleteReservationController controller = new DeleteReservationController();
        int reservationId = Integer.parseInt(GivenIdTextField.getText());

        try {
            ReservationPk deleteReservation = controller.deleteReservation(userNameTextField.getText(), reservationId);
            JOptionPane.showMessageDialog(null, "Reservation deleted with id: " + reservationId, "Success", JOptionPane.INFORMATION_MESSAGE);
            DeleteReservationForm deleteReservationFrame = new DeleteReservationForm(GivenIdTextField.getText());
          //  deleteReservationFrame.userNameLabel.setText(userNameLabel.getText());
            this.dispose();
            ReservationDao reservation = new ReservationDao();
            List resultList = reservation.getUserReservations(userNameTextField.getText());
            Vector<String> tableHeaders = new Vector<String>();
            Vector tableData = new Vector();
            tableHeaders.add("Id κράτησης");
           // tableHeaders.add("Club Name");
           // tableHeaders.add("Reservation Date");
          //  tableHeaders.add("Τραπέζι");
          //  String DATE_FORMAT = "dd/MM/yyyy";
           // SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);

            for (Object o : resultList) {
                Reservation res = (Reservation) o;
                Vector<Object> oneRow = new Vector<Object>();
                String clubName = new NightClubDao().getNightClubDataByClubId(res.getId().getClubId()).getClubName();
                oneRow.add(res.getId().getReservationId());
                oneRow.add(clubName);
                //String reservationDate = sdf.format(res.getReservationDate());
               // oneRow.add(reservationDate);
                oneRow.add(res.getTrapezi());
                tableData.add(oneRow);
            }
             deleteReservationFrame.showReservationsTable.setModel(new DefaultTableModel(tableData, tableHeaders));
             deleteReservationFrame.setLocationRelativeTo(this);
             deleteReservationFrame.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Failure", JOptionPane.INFORMATION_MESSAGE);
        } 
		
        
      
      /*  
        Vector<String> tableHeaders = new Vector<String>();
        tableHeaders.add("Όνομα Χρήστη");
        tableHeaders.add("ID Κράτησης");
        Vector<String> firstRow=new Vector<String>();
        Vector<String> secondRow=new Vector<String>(); 
        Vector<String> thirdRow=new Vector<String>();
        Vector<Vector> tableData=new Vector<Vector>();
        firstRow.add("user1");
        firstRow.add("3");
        tableData.add(firstRow);
        secondRow.add("user2");
        secondRow.add("5");
        tableData.add(secondRow);
        thirdRow.add("user3");
        thirdRow.add("2");
        tableData.add(thirdRow);
        reservationsTable.setModel(new 
        DefaultTableModel(tableData,tableHeaders));// TODO add your handling code here:*/
    }//GEN-LAST:event_showReservationButtonActionPerformed

    private void GivenIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GivenIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GivenIdTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteReservationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JTextField GivenIdTextField;
    private javax.swing.JButton OkButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton showReservationButton;
    private javax.swing.JTable showReservationsTable;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}
