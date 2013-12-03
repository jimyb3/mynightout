/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.entity;

/**
 *
 * @author ioanna
 */
public class Supply  implements java.io.Serializable {
    private int supplierId;
    private int clubId;

    public int getSupplierId() {
        return supplierId;
    }

    public int getClubId() {
        return clubId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public void setClubId(int clubId) {
        this.clubId = clubId;
    }
    
    
}
