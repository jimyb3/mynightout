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
    private int reservationId;
    private int successCancel;
    private Date reservationDate;
    private int seatNumber;//πληθος ατομων
    private String storeName;
    private boolean successCreate;

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isSuccessCreate() {
        return successCreate;
    }

    public void setSuccessCreate(boolean successCreate) {
        this.successCreate = successCreate;
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

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public int getSuccessCancel() {
        return successCancel;
    }

    public void setSuccessCancel(int successCancel) {
        this.successCancel = successCancel;
    }

}
