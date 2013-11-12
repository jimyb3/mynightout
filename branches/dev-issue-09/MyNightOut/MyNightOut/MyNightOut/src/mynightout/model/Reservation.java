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
    private Date reservationDate;
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

    public void setReservationId(String Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 public Reservation(String customerName,
 Date reservationDate, int numberOfPeople, String storeName) {
 this.userName = customerName;
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

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
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
  }  
 
    
    

