/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package alex.struts;

import alex.classes.Performer;
import alex.classes.Weapon;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Alexei Yasko
 */
public class ChangeWeaponAction extends org.apache.struts.action.Action {
    
    /* forward name="success" path="" */
    private static final String SUCCESS = "changeWeapon";
    
    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        ChangeWeaponForm changeForm = (ChangeWeaponForm)form;

        try {
            Weapon weapon = new Weapon();
            weapon.setName(changeForm.getName());
            weapon.setType(changeForm.getType());
            weapon.setWeight(changeForm.getWeight());
            weapon.setLength(changeForm.getLength());
            weapon.setCaliber(changeForm.getCaliber());
            weapon.setSpeadOfTheBullet(changeForm.getSpeadOfTheBullet());

            Performer performer = new Performer();
            boolean cheeck = performer.changeWeapon(weapon, changeForm.getOldName());

            if (cheeck) {
                changeForm.setMessage("Оружие успешно обновлено.");
                return mapping.findForward(SUCCESS);
            } else {
                changeForm.setMessage("Оружие не было обновлено.");
                return mapping.findForward(SUCCESS);
            }
        } catch (Exception e) {
            changeForm.setMessage("Оружие не было обновлено.");
            return mapping.findForward(SUCCESS);
        }
    }
}
