package mynightout.entity;
// Generated 4 DEC 2013 5:28:19 AM by Hibernate Tools 3.6.0



/**
 * SupplyId generated by hbm2java
 */
public class SupplyId  implements java.io.Serializable {


     private int supplierId;
     private int clubId;

    public SupplyId() {
    }

    public SupplyId(int supplierId, int clubId) {
       this.supplierId = supplierId;
       this.clubId = clubId;
    }
   
    public int getSupplierId() {
        return this.supplierId;
    }
    
    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }
    public int getClubId() {
        return this.clubId;
    }
    
    public void setClubId(int clubId) {
        this.clubId = clubId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SupplyId) ) return false;
		 SupplyId castOther = ( SupplyId ) other; 
         
		 return (this.getSupplierId()==castOther.getSupplierId())
 && (this.getClubId()==castOther.getClubId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getSupplierId();
         result = 37 * result + this.getClubId();
         return result;
   }   


}

