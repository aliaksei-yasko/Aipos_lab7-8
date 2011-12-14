/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package alex.struts;

import alex.classes.Performer;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Alexei Yasko
 */
public class DeleteAction extends org.apache.struts.action.Action {
    
    /* forward name="success" path="" */
    private static final String SUCCESS = "deletePage";
    private static final String FAIL = "deletePage";
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

        SelectForm sForm = (SelectForm) form;
        String[] weaponNames = sForm.getSelected();

        try {
            Performer performer = new Performer();

            boolean cheeck = true;
            for(String name : weaponNames) {
                cheeck = performer.deleteWeapon(name);
                if (cheeck == false) {
                    sForm.setMessage("Ошибка в удалении оружия: " + name);
                    return mapping.findForward(FAIL);
                }
            }

            sForm.setMessage("Оружие успешно удалено.");
            return mapping.findForward(SUCCESS);
        } catch (Exception ex) {
            ex.printStackTrace();
            sForm.setMessage("Ошибка в работе с базой.");
            return mapping.findForward(FAIL);
        }
    }
}
