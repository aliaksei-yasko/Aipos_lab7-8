/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package alex.service;

import alex.ejbbeans.Weapons;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@XmlRootElement
public class WeaponXML {
    @XmlElement
    public String name;
    @XmlElement
    public String type;
    @XmlElement
    public double weight;
    @XmlElement
    public double length;
    @XmlElement
    public double caliber;
    @XmlElement
    public double spead;

    public WeaponXML() { }

    public WeaponXML(Weapons weapon) {
        this.name = weapon.getNameweapon();
        this.type = weapon.getTypeweapon();
        this.weight = weapon.getWeightweapon();
        this.length = weapon.getLengthweapon();
        this.caliber = weapon.getCaliberweapon();
        this.spead = weapon.getSpeadweapon();
    }
}
