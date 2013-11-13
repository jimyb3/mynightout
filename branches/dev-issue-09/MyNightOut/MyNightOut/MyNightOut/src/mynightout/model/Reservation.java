/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.model;

import java.util.Date;

/**
 * Μια απλή κλάση που αναπαριστά μια κράτηση.
 * @author Dimitris
 */
public class Reservation {
    private String customerName;
    private int reservationId;
    private boolean cancelSuccessful;
    private String userName;
    private String reservationDate;
    private String storeName;
    private int numOfPeople;
    
    public String getCustomerName(){
        return customerName;
    }
    
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    
    public int getReservationId(){
        return reservationId;
    }
    
    public void setReservationId(int reservationId){
        this.reservationId=reservationId;
    }

    public boolean isCancelSuccessful() {
        return cancelSuccessful;
    }

    public void setCancelSuccessful(boolean cancelSuccessful) {
        this.cancelSuccessful = cancelSuccessful;
    }

 public Reservation(String customerName, int reservationId) {
        this.customerName = customerName;
        this.reservationId = reservationId;
    }
 public Reservation(String customerName,
 String reservationDate, int numberOfPeople, String storeName) {
 this.customerName = customerName;
 this.reservationDate = reservationDate;
 this.storeName = storeName;
 this.numOfPeople = numberOfPeople;

 }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public String setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
        return reservationDate;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }
    public Reservation(String ID){
      this.reservationId=Integer.parseInt(ID);
    }

  
   
}  
 
    
    

