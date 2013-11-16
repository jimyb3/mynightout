/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.model;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.Date;

/**
 * Μια απλή κλάση που αναπαριστά μια κράτηση.
 *
 * @author Dimitris
 */
public class Reservation {

    private String userName;
    private String storeName;
    private Date reservationDate;
    private int seatNumber;
    private int reservationId;
    private boolean successCreate;
    private boolean cancelSuccessful;
    private String customerName;
    private int numOfPeople;
    private String reservationDate1;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }

    public String getReservationDate1() {
        return reservationDate1;
    }

    public void setReservationDate1(String reservationDate1) {
        this.reservationDate1 = reservationDate1;
    }
    
    public Reservation(String customerName, int reservationId) {
        this.userName = customerName;
        this.reservationId = reservationId;
    }

    public Reservation(String customerName,
         Date reservationDate, int seatNumber, String storeName) {
        this.userName = customerName;
        this.reservationDate = reservationDate;
        this.storeName = storeName;
        this.seatNumber = seatNumber;

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
        
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public boolean isSuccessCreate() {
        return successCreate;
    }

    public void setSuccessCreate(boolean successCreate) {
        this.successCreate = successCreate;
    }

    public boolean isCancelSuccessful() {
        return cancelSuccessful;
    }

    public void setCancelSuccessful(boolean cancelSuccessful) {
        this.cancelSuccessful = cancelSuccessful;
    }
   
   public Reservation(String customerName,
   String reservationDate1, int numberOfPeople, String storeName) {
   this.customerName = customerName;
   this.reservationDate1 = reservationDate1;
   this.storeName = storeName;
   this.numOfPeople = numberOfPeople;
} 
   public Reservation(int reservationId)
   {
          this.reservationId=reservationId;
   }
}
