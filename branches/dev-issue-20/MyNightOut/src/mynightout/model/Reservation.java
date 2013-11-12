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

    private String customerName;
    private int reservationId;
    private int successCancel;
    private Date reservationDate;
    private int numberParty;//πληθος ατομων
    private String storeName;
    private boolean successCreate;

    public boolean isSuccessCreate() {
        return successCreate;
    }

    public void setSuccessCreate(boolean successCreate) {
        this.successCreate = successCreate;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public int getNumberParty() {
        return numberParty;
    }

    public void setNumberParty(int numberParty) {
        this.numberParty = numberParty;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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
