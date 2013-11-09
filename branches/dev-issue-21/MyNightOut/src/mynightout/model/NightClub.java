/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.model;

/**
 *
 * @author panos
 */
public class NightClub {
    private String storeName;
    private boolean StoreFull;

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public boolean isStoreFull() {
        return StoreFull;
    }

    public void setStoreFull(boolean StoreFull) {
        this.StoreFull = StoreFull;
    }
}
