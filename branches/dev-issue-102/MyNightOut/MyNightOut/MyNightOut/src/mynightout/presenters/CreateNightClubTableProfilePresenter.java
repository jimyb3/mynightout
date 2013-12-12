/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.presenters;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import mynightout.dao.TablesDao;
import mynightout.ui.TableProfileForm;

/**
 *
 * @author Dimitris
 */
public class CreateNightClubTableProfilePresenter {

    public void createNightClubTableProfile(TableProfileForm form, int row1,
            int row2, int row3, int row4, int row5, int row6, String nightClubName) {

        int max = Collections.max(Arrays.asList(row1, row2, row3, row4, row5, row6));
        JPanel[] p = new JPanel[7];
        form.jLabel2.setText(Integer.toString(row1));
        form.jLabel3.setText(Integer.toString(row2));
        form.jLabel4.setText(Integer.toString(row3));
        form.jLabel5.setText(Integer.toString(row4));
        form.jLabel6.setText(Integer.toString(row5));
        form.jLabel7.setText(Integer.toString(row6));
        form.jLabel8.setText(nightClubName);
        String rows = "" + row1 + "," + row2 + "," + row3 + "," + row4 + "," + row5 + "," + row6;
        String[] rowsArray = rows.split(",");
        String letterTable = "Α,Β,Γ,Δ,Ε,Ζ";
        String[] letterTableArray = letterTable.split(",");
        Container pane = form.getContentPane();
        int tableNumber = row1 + row2 + row3 + row4 + row5 + row6 + 1;
        JButton[] table = new JButton[tableNumber];
        String tablesImage = "/images/freeTable.png";
        URL url = getClass().getResource(tablesImage);

        ImageIcon icon = new ImageIcon(url);

        int x = 100;
        int count = 1;
        for (int j = 0; j < rowsArray.length; j++) {
            p[j] = new JPanel();
            for (int i = 1; i <= Integer.parseInt(rowsArray[j]); i++) {
                table[count] = new JButton(letterTableArray[j] + i);
                table[count].setSize(120, 20);
                table[count].setIcon(icon);
                table[count].setOpaque(false);
                table[count].setBorderPainted(false);
                table[count].setContentAreaFilled(false);
                table[count].setFocusPainted(false);
                p[j].add(table[count]);
                count = count + 1;
            }
            p[j].setSize(110 * max, 120);
            p[j].setLocation(0, x);
            x = x + 120;
            pane.add(p[j]);
        }
        form.setSize(max * 115, 8 * 120);
        form.setVisible(true);
    }
}
