/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.model;

/**
 *
 * @author Maria
 */
public class Cellar {
  String NameOfBottle;
  String NumOfBottles;
private boolean showCellarSuccessful;

    public Cellar(String NameOfBottle, String NumOfBottles) {
        this.NameOfBottle =NameOfBottle;
        this.NumOfBottles =NumOfBottles;
    }

    public String getNameOfBottle() {
        return NameOfBottle;
    }

    public void setNameOfBottle(String NameOfBottle) {
        this.NameOfBottle = NameOfBottle;
    }

    public String getNumOfBottles() {
        return NumOfBottles;
    }

    public void setNumOfBottles(String NumOfBottles) {
        this.NumOfBottles = NumOfBottles;
    }

    public void setShowCellarSuccessful(boolean cancelSuccessful) {
         this.showCellarSuccessful= cancelSuccessful;
    }

  
  
  
}
