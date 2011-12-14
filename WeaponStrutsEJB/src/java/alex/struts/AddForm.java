/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package alex.struts;

import java.io.UnsupportedEncodingException;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Alexei Yasko
 */
public class AddForm extends org.apache.struts.action.ActionForm {
   
   private String name;
   private String type;
   private double weight;
   private double length;
   private double caliber;
   private double speadOfTheBullet;
   private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getCaliber() {
        return caliber;
    }

    public void setCaliber(double caliber) {
        this.caliber = caliber;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws UnsupportedEncodingException {
        this.name = name;
    }

    public double getSpeadOfTheBullet() {
        return speadOfTheBullet;
    }

    public void setSpeadOfTheBullet(double speadOfTheBullet) {
        this.speadOfTheBullet = speadOfTheBullet;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) throws UnsupportedEncodingException {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }



    /**
     *
     */
    public AddForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        
        return errors;
    }
}
