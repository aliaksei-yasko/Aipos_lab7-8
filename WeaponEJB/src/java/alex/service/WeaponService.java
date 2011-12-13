/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package alex.service;

import alex.ejbbeans.Weapons;
import java.io.UnsupportedEncodingException;
import java.util.List;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Admin
 */
@WebService()
@Stateless()
public class WeaponService {
    @PersistenceContext
    private EntityManager em;

    @WebMethod(operationName = "getWeapons")
    public WeaponsList getWeapons() {
        List<Weapons> list = em.createNamedQuery("Weapons.findAll").getResultList();
        WeaponsList result = new WeaponsList(list);
        return result;
    }

    @WebMethod(operationName = "getWeaponByName")
    public WeaponXML getWeaponByName(@WebParam(name="name") String name) {
        Weapons weapon = em.find(Weapons.class, name);
        WeaponXML xmlWeapon = new WeaponXML(weapon);
        return xmlWeapon;
    }

    @WebMethod(operationName = "deleteWeapon")
    public boolean deleteWeapon(@WebParam(name="name") String name) {
        Object entity = null;
        entity = em.find(Weapons.class, name);
        if (entity == null) {
            return false;
        } else {
            em.remove(entity);
            return true;
        }
    }

    @WebMethod(operationName = "addWeapon")
    public boolean addWeapon(@WebParam(name="xmlWeapon") WeaponXML xmlWeapon) {
        Weapons weapon = new Weapons();

        weapon.setNameweapon(xmlWeapon.name);
        weapon.setTypeweapon(xmlWeapon.type);
        weapon.setWeightweapon(xmlWeapon.weight);
        weapon.setLengthweapon(xmlWeapon.length);
        weapon.setCaliberweapon(xmlWeapon.caliber);
        weapon.setSpeadweapon(xmlWeapon.spead);

        em.persist(weapon);

        return true;
    }
}    
