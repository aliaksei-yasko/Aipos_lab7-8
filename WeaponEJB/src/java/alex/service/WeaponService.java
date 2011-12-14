/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package alex.service;

import alex.ejbbeans.Weapons;
import java.util.List;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alexei Yasko
 * Web service class
 */
@WebService()
@Stateless()
public class WeaponService {
    @PersistenceContext
    private EntityManager em;

    /**
     * Method that get all weapons
     * @return found weapons
     */
    @WebMethod(operationName = "getWeapons")
    public WeaponsList getWeapons() {
        List<Weapons> list = em.createNamedQuery("Weapons.findAll").getResultList();
        WeaponsList result = new WeaponsList(list);
        return result;
    }

    /**
     * Method that get weapons by name
     * @param name weapon name
     * @return found weapon
     */
    @WebMethod(operationName = "getWeaponByName")
    public WeaponXML getWeaponByName(@WebParam(name = "name") String name) {
        Weapons weapon = em.find(Weapons.class, name);
        WeaponXML xmlWeapon = new WeaponXML(weapon);
        return xmlWeapon;
    }

    /**
     * Method that delete weapon
     * @param name weapon name
     * @return logical result
     */
    @WebMethod(operationName = "deleteWeapon")
    public boolean deleteWeapon(@WebParam(name = "name") String name) {
        Object entity = null;
        entity = em.find(Weapons.class, name);
        if (entity == null) {
            return false;
        } else {
            em.remove(entity);
            return true;
        }
    }

    /**
     * Method that added weapon
     * @param xmlWeapon xml presentation of weapon
     * @return logical result
     */
    @WebMethod(operationName = "addWeapon")
    public boolean addWeapon(@WebParam(name = "xmlWeapon") WeaponXML xmlWeapon) {
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

    /**
     * Method that change weapon
     * @param xmlWeapon xml presentation of weapon
     * @param oldName name of changing weapon
     * @return logical result
     */
    @WebMethod(operationName = "changeWeapon")
    public boolean changeWeapon(@WebParam(name = "xmlWeapon") WeaponXML xmlWeapon,
            @WebParam(name = "oldName") String oldName) {

        Weapons weapon = null;
        weapon = em.find(Weapons.class, oldName);
        if (weapon != null) {

            weapon.setNameweapon(xmlWeapon.name);
            weapon.setTypeweapon(xmlWeapon.type);
            weapon.setWeightweapon(xmlWeapon.weight);
            weapon.setLengthweapon(xmlWeapon.length);
            weapon.setCaliberweapon(xmlWeapon.caliber);
            weapon.setSpeadweapon(xmlWeapon.spead);

            em.persist(weapon);
            return true;

        } else {
            return false;
        }
    }
}    
