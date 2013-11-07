

//package deleteReservationPackage;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria
 */
public class DeleteReservation {
    //TODO add code
 public static ArrayList<String> DeleteFromList(ArrayList<String> temp, int line)
      {
       ArrayList<String> finalList = new ArrayList<>(); 
       for(int i =0; i<temp.size(); i++)
       {
        if(i == line)
         finalList.clear();
        else
         finalList.add(temp.get(i));
       
                 }
                 return finalList;
             }




}
