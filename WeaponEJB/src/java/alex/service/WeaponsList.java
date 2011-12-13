/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package alex.service;

import alex.ejbbeans.Weapons;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */

@XmlRootElement
public class WeaponsList {

    @XmlElement(type=WeaponXML.class)
    public List<WeaponXML> list = new ArrayList<WeaponXML>();

    public WeaponsList() { }

    public WeaponsList(List<Weapons> list) {
        for (Weapons weapon : list) {
            this.list.add(new WeaponXML(weapon));
        }
    }
}
