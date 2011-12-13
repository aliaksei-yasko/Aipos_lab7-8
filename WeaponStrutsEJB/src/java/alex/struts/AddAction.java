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
 * @author Admin
 */
public class AddAction extends org.apache.struts.action.Action {
    
    /* forward name="success" path="" */
    private static final String SUCCESS = "add";
    
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

        response.setContentType ("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

        AddForm aForm = (AddForm)form;
        try {
            Weapon weapon = new Weapon();
            weapon.setName(aForm.getName());
            weapon.setType(aForm.getType());
            weapon.setWeight(aForm.getWeight());
            weapon.setLength(aForm.getLength());
            weapon.setCaliber(aForm.getCaliber());
            weapon.setSpeadOfTheBullet(aForm.getSpeadOfTheBullet());

            Performer performer = new Performer();
            boolean cheeck = performer.addWeapon(weapon);
            if (cheeck) {
               aForm.setMessage("Оружие успешно добавлено.");
               return mapping.findForward(SUCCESS);
            } else {
                aForm.setMessage("Оружие не было добавлено.");
                return mapping.findForward(SUCCESS);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            aForm.setMessage("Оружие не было добавлено.");
            return mapping.findForward(SUCCESS);
        }
    }
}
