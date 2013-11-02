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
    private int successCancel;
    
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
    
    public int getSuccessCancel(){
        return successCancel;
    }
    public void setSuccessCancel(int successCancel){
        this.successCancel=successCancel;
    }
    
}
