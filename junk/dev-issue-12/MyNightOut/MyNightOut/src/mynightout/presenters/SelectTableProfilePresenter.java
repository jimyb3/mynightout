/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.presenters;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import mynightout.dao.NightClubDao;
import mynightout.dao.ReservationDao;
import mynightout.dao.UserDao;
import mynightout.entity.User;
import mynightout.ui.ConfirmReservationInfoForm;
import mynightout.ui.SelectTableProfileForm;

/**
 *
 * @author Dimitris
 */
public class SelectTableProfilePresenter {

    public void showSelectTableProfile(final SelectTableProfileForm form, int row1, int row2, int row3, int row4,
            int row5, int row6, int clubId, final Date reservationDate, final String userName) throws ParseException {
        
        final String clubName= new NightClubDao().getNightClubDataByClubId(clubId).getClubName();
        int x = 100;
        int max = Collections.max(Arrays.asList(row1, row2, row3, row4, row5, row6));
        JPanel[] p = new JPanel[7];
        ReservationDao rDao = new ReservationDao();
        
        String rows = "" + row1 + "," + row2 + "," + row3 + "," + row4 + "," + row5 + "," + row6;
        String[] rowsArray = rows.split(",");
        String letterTable = "Α,Β,Γ,Δ,Ε,Ζ";
        String[] letterTableArray = letterTable.split(",");
        List reservedTables = rDao.listWithReservationTablesByDate(clubId, reservationDate);
        Container pane = form.getContentPane();
        int tableNumber = row1 + row2 + row3 + row4 + row5 + row6 + 1;
        JButton[] table = new JButton[tableNumber];
        String freeTableImage = "/images/freeTable.png";
        String noFreeTableImage = "/images/NoFreeTable.png";
        URL url = getClass().getResource(freeTableImage);

        ImageIcon icon = new ImageIcon(url);
        /**
         * hack Να αντικατασταθεί ο κωδικας από τα κουμπιά με κώδικα που θα
         * επιτρέπει την αλλαγή των θέσεων.
         */
        int count = 1;
        for (int k = 0; k < rowsArray.length; k++) {
            p[k] = new JPanel();
            for (int i = 1; i <= Integer.parseInt(rowsArray[k]); i++) {
                table[count] = new JButton(letterTableArray[k] + i);
                String tab = letterTableArray[k] + i;
                table[count].setSize(120, 20);
                table[count].setOpaque(false);
                table[count].setBorderPainted(false);
                table[count].setContentAreaFilled(false);
                table[count].setActionCommand(table[count].getText());//Δίνουμε στο Action το text που θέλουμε.
                boolean find = false;
                int j = 0;
                while (j < reservedTables.size() && !find) {
                    if ((tab).equals(reservedTables.get(j))) {
                        find = true;
                    }
                    j++;
                }
                if (find) {
                    url = getClass().getResource(noFreeTableImage);
                    icon = new ImageIcon(url);
                } else {
                    url = getClass().getResource(freeTableImage);
                    icon = new ImageIcon(url);
                    table[count].addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            String table = evt.getActionCommand();//Παίρνουμε πίσω το text που δώσαμε.
                            ConfirmReservationInfoForm crif = new ConfirmReservationInfoForm(userName);
                            User currentUser=new UserDao().getUserDataByUsername(userName);
                            crif.reservationTableLabel.setText(table);
                            crif.customerLastNameLabel.setText(currentUser.getCustomerLastname());
                            crif.customerNameLabel.setText(currentUser.getCustomerName());
                            crif.nightClubNameLabel.setText(clubName);
                            String DATE_FORMAT = "dd/MM/yyyy";
                            SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
                            crif.reservationDateLabel.setText(sdf.format(reservationDate));
                            crif.setVisible(true);
                            form.dispose();
                        }
                    });
                }
                table[count].setIcon(icon);
                p[k].add(table[count]);
                count = count + 1;
            }
            p[k].setSize(110 * max, 120);
            p[k].setLocation(0, x);
            x = x + 120;
            pane.add(p[k]);
        }
        form.setSize(max * 115, 8 * 120);
        form.setVisible(true);
    }
}
