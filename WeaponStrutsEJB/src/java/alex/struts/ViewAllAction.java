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
public class ViewAllAction extends org.apache.struts.action.Action {
    
    /* forward name="success" path="" */
    private static final String SUCCESS = "viewAll";
    private static final String FAIL = "errorPage";
    
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
        
        ViewAllForm viewForm = (ViewAllForm) form;

        try {
            Performer performer = new Performer();
            Weapon[] weapons = null;
            weapons = performer.getAllWeapon();

            if (weapons == null ) {
                viewForm.setErrorMessage("Записи из базы данных не получены.");
                return mapping.findForward(FAIL);
            }

            viewForm.setWeapons(weapons);
            return mapping.findForward(SUCCESS);

        } catch (Exception ex) {
            ex.printStackTrace();
            viewForm.setErrorMessage("Записи из базы данных не получены.");
            return mapping.findForward(FAIL);
        }
    }
}
