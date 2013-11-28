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

    
    public String getclubs() {
        NightClubDao getstores = new NightClubDao();
     
        List allNightClubs = getstores.getAllNightClubs();
        
        
        
        
        int i=0;
        for (Object o : allNightClubs){
         
                Nightclub nightclub = (Nightclub) o;
                String table[i]=nightclub.getStoreName();
                i++;
            
        }
        
        
        
        
        
       // List Clubs = NightClubDao.getAllNightClubs();

        //for(Object o : resultList) {
        //Actor actor = (Actor)o;
        // Vector<Object> oneRow = new Vector<Object>();
        //oneRow.add(actor.getActorId());
        // oneRow.add(actor.getFirstName());
        //oneRow.add(actor.getLastName());
        // oneRow.add(actor.getLastUpdate());
        // tableData.add(oneRow);
        // }
        return null;
    }
    

  //  public static String mainMenuCodes[] = {"fix", "stages", "sales", "BEVE", "FOOD", "BEVE"};
   // public static String mainMenuDesc[] = {"FOOD", "BEVERAGES", "FOOD", "BEVERAGES", "FOOD", "BEVERAGES"};
  //  private static ArrayList list;

    public static ArrayList getSubMenu(String mainMenuCodes) {

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
    }
}
