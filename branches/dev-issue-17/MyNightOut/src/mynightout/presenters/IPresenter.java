/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.presenters;

import mynightout.ui.IContactAdminForm;

/**
 *
 * @author panos
 */
public interface IPresenter {
    public void sendHelp(IContactAdminForm form, String msgtosend);
    
}
