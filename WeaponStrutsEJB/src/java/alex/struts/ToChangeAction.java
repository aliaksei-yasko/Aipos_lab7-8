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
public class ToChangeAction extends org.apache.struts.action.Action {
    
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
        changeForm.setName("");
        try {
            Performer performer = new Performer();
            Weapon weapon = performer.getWeaponByName(request.getParameter("name"));

            if (weapon == null) {
                changeForm.setMessage("Нет данных для изменения.");
                return mapping.findForward(SUCCESS);
            }
            changeForm.setName(weapon.getName());
            changeForm.setOldName(weapon.getName());
            changeForm.setType(weapon.getType());
            changeForm.setWeight(weapon.getWeight());
            changeForm.setLength(weapon.getLength());
            changeForm.setCaliber(weapon.getCaliber());
            changeForm.setSpeadOfTheBullet(weapon.getSpeadOfTheBullet());

            changeForm.setMessage("Данные для изменения.");
            return mapping.findForward(SUCCESS);

        } catch (Exception ex) {
            changeForm.setMessage("Нет данных для изменения.");
            return mapping.findForward(SUCCESS);
        }
    }
}
