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
public class ViewWeaponAction extends org.apache.struts.action.Action {
    
    /* forward name="success" path="" */
    private static final String SUCCESS = "viewWeapon";
    
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

        ViewWeaponForm viewForm = (ViewWeaponForm)form;
        String name = request.getParameter("name");

        try {
            Performer performer = new Performer();
            Weapon viewWeapon = performer.getWeaponByName(name);

            if (viewWeapon != null) {
                viewForm.setName(viewWeapon.getName());
                viewForm.setType(viewWeapon.getType());
                viewForm.setWeight(viewWeapon.getWeight());
                viewForm.setLength(viewWeapon.getLength());
                viewForm.setCaliber(viewWeapon.getCaliber());
                viewForm.setSpeadOfTheBullet(viewWeapon.getSpeadOfTheBullet());

                viewForm.setMessage("Оружие было найдено.");
                return mapping.findForward(SUCCESS);
            } else {
                viewForm.setMessage("Оружие не было найдено.");
                return mapping.findForward(SUCCESS);
            }

        } catch (Exception ex) {
            viewForm.setMessage("Оружие не было найдено. Ошибка при работе с базой.");
            return mapping.findForward(SUCCESS);
        }
    }
}
