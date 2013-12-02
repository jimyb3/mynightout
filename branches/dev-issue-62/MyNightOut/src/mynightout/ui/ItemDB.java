package mynightout.ui;


import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import mynightout.dao.NightClubDao;
import mynightout.entity.Nightclub;

/**
 *
 * @author Mustaine
 */
class ItemDB {
   
    public static String mainMenuCodes[]= ItemDB.getclubs();
   // String[] mainMenuCodes= this.getclubs();
   //  mainMenuCodes[]=getclubs();
    
    
    
    
    public static String[] getclubs() {
        NightClubDao getstores = new NightClubDao();
     
        List allNightClubs = getstores.getAllNightClubs();
        
        
        
        
        int i=0;
        String[] table=new String[allNightClubs.size()];
        for (Object o : allNightClubs){
                  Nightclub nightclub = (Nightclub) o;
                  table[i]= nightclub.getStoreName();
                  i++;
         }
        //StoresForm test = new StoresForm();
       // test.
        return table;
    }
    

    
    
    
    
    
    
  //  public String mainMenuCodes[] = getclubs();
  
   // public static String mainMenuCodes[] = {"fix", "stages", "sales", "BEVE", "FOOD", "BEVE"};
   // public static String mainMenuDesc[] = {"FOOD", "BEVERAGES", "FOOD", "BEVERAGES", "FOOD", "BEVERAGES"};
  //  private static ArrayList list;

  /*  public ArrayList getSubMenu(String mainMenuCodes) {

        list = new ArrayList();
        if (mainMenuCodes.equals("FOOD")) {
            String subCode[] = {"P", "B"};
            String subDesc[] = {"PIZZA", "BURGER"};

            list.add(subCode);
            list.add(subDesc);

        } else if (mainMenuCodes.equals("BEVE")) {
            String subCode[] = {"FJ", "HB"};
            String subDesc[] = {"Fruit Juice", "Hot Beverages"};

            list.add(subCode);
            list.add(subDesc);
        }
        return list;
    }*/
}
