/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.model;

/**
 * Μια απλή κλάση που αναπαριστά μια κράτηση.
 * @author Dimitris
 */
public class Reservation {
    private String customerName;
    private int reservationId;

    public Reservation(String customerName, int reservationId) {
        this.customerName = customerName;
        this.reservationId = reservationId;
    }
    
    private boolean cancelSuccessful;
    
    public String getUserName(){
        return customerName;
    }
    
    public void setUserName(String customerName){
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

    
    
    
    
}
