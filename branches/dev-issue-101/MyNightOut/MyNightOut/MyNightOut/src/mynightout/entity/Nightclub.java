package mynightout.entity;
// Generated 4 DEC 2013 5:28:19 AM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Nightclub generated by hbm2java
 */
public class Nightclub  implements java.io.Serializable {


     private Integer clubId;
     private String clubName;
     private String clubPassword;
     private String address;
     private String email;
     private int seatNumber;
     private String telephoneNum;
     private String category;
     private String clubImage;
     private Date closedFrom;
     private Date closedThrough;
     private String daysClosed;
     //βοηθητικές μεταβλητές για τα test αυτά θα σταματήσουν να χρησιμοποιούνται
    //όταν γίνει η κανονική συνδεση με τη βαση.
        private String storeName;
        private boolean storeFull;
    
        

    public Nightclub() {
    }

    public Nightclub(String clubName, String clubPassword, String address, 
            String emailAddress, int seatNumber, String telephoneNum, String categoryId, String clubImage) {
       this.clubName = clubName;
       this.clubPassword = clubPassword;
       this.address = address;
       this.email = emailAddress;
       this.seatNumber = seatNumber;
       this.telephoneNum = telephoneNum;
       this.category = categoryId;
       this.clubImage = clubImage;
       
       
    }
    public Nightclub(String clubName,String clubPassword) {
        this.clubName = clubName;
        this.clubPassword = clubPassword;        
    }
    public Nightclub(Date closedFrom, Date closedThrough){
       this.closedFrom = closedFrom;
       this.closedThrough = closedThrough;
    }
    
    public Nightclub(String daysClosed){
        this.daysClosed = daysClosed;
    }
   
    public Integer getClubId() {
        return this.clubId;
    }
    
    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }
    public String getClubName() {
        return this.clubName;
    }
    
    public void setClubName(String clubName) {
        this.clubName = clubName;
    }
    public String getClubPassword() {
        return this.clubPassword;
    }
    
    public void setClubPassword(String clubPassword) {
        this.clubPassword = clubPassword;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public int getSeatNumber() {
        return this.seatNumber;
    }
    
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
    public String getTelephoneNum() {
        return this.telephoneNum;
    }
    
    public void setTelephoneNum(String telephoneNum) {
        this.telephoneNum = telephoneNum;
    }
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    public String getClubImage() {
        return this.clubImage;
    }
    
    public void setClubImage(String clubImage) {
        this.clubImage = clubImage;
    }
    public Date getClosedFrom() {
        return this.closedFrom;
    }
    
    public void setClosedFrom(Date closedFrom) {
        this.closedFrom = closedFrom;
    }
    public Date getClosedThrough() {
        return this.closedThrough;
    }
    
    public void setClosedThrough(Date closedThrough) {
        this.closedThrough = closedThrough;
    }
    public String getDaysClosed() {
        return this.daysClosed;
    }
    
    public void setDaysClosed(String daysClosed) {
        this.daysClosed = daysClosed;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public boolean isStoreFull() {
        return storeFull;
    }

    public void setStoreFull(boolean storeFull) {
        this.storeFull = storeFull;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nightclub other = (Nightclub) obj;
        if ((this.clubName == null) ? (other.clubName != null) : !this.clubName.equals(other.clubName)) {
            return false;
        }
        if ((this.clubPassword == null) ? (other.clubPassword != null) : !this.clubPassword.equals(other.clubPassword)) {
            return false;
        }
        return true;
    }


}


