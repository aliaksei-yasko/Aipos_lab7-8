/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package alex.ejbbeans;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Alexei Yasko
 * Entity class of weapons table
 */
@Entity
@Table(name = "WEAPONS")
@NamedQueries({
    @NamedQuery(name = "Weapons.findAll", query = "SELECT w FROM Weapons w"),
    @NamedQuery(name = "Weapons.findByTypeweapon", query = "SELECT w FROM Weapons w WHERE w.typeweapon = :typeweapon"),
    @NamedQuery(name = "Weapons.findByNameweapon", query = "SELECT w FROM Weapons w WHERE w.nameweapon = :nameweapon"),
    @NamedQuery(name = "Weapons.findByWeightweapon", query = "SELECT w FROM Weapons w WHERE w.weightweapon = :weightweapon"),
    @NamedQuery(name = "Weapons.findByLengthweapon", query = "SELECT w FROM Weapons w WHERE w.lengthweapon = :lengthweapon"),
    @NamedQuery(name = "Weapons.findByCaliberweapon", query = "SELECT w FROM Weapons w WHERE w.caliberweapon = :caliberweapon"),
    @NamedQuery(name = "Weapons.findBySpeadweapon", query = "SELECT w FROM Weapons w WHERE w.speadweapon = :speadweapon")})
public class Weapons implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "TYPEWEAPON")
    private String typeweapon;
    @Id
    @Basic(optional = false)
    @Column(name = "NAMEWEAPON")
    private String nameweapon;
    @Column(name = "WEIGHTWEAPON")
    private Double weightweapon;
    @Column(name = "LENGTHWEAPON")
    private Double lengthweapon;
    @Column(name = "CALIBERWEAPON")
    private Double caliberweapon;
    @Column(name = "SPEADWEAPON")
    private Double speadweapon;

    public Weapons() {
    }

    public Weapons(String nameweapon) {
        this.nameweapon = nameweapon;
    }

    public String getTypeweapon() {
        return typeweapon;
    }

    public void setTypeweapon(String typeweapon) {
        this.typeweapon = typeweapon;
    }

    public String getNameweapon() {
        return nameweapon;
    }

    public void setNameweapon(String nameweapon) {
        this.nameweapon = nameweapon;
    }

    public Double getWeightweapon() {
        return weightweapon;
    }

    public void setWeightweapon(Double weightweapon) {
        this.weightweapon = weightweapon;
    }

    public Double getLengthweapon() {
        return lengthweapon;
    }

    public void setLengthweapon(Double lengthweapon) {
        this.lengthweapon = lengthweapon;
    }

    public Double getCaliberweapon() {
        return caliberweapon;
    }

    public void setCaliberweapon(Double caliberweapon) {
        this.caliberweapon = caliberweapon;
    }

    public Double getSpeadweapon() {
        return speadweapon;
    }

    public void setSpeadweapon(Double speadweapon) {
        this.speadweapon = speadweapon;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nameweapon != null ? nameweapon.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Weapons)) {
            return false;
        }
        Weapons other = (Weapons) object;
        if ((this.nameweapon == null && other.nameweapon != null) || (this.nameweapon != null && !this.nameweapon.equals(other.nameweapon))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alex.ejbbeans.Weapons[nameweapon=" + nameweapon + "]";
    }

}
