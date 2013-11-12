/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.model;

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
}
