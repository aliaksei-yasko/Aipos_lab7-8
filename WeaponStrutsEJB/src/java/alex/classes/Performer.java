/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package alex.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author Admin
 */
public class Performer {
    Connection connection = null;

    public Performer() {
        
    }

    public boolean changeWeapon (Weapon updateWeapon, String oldName) throws SQLException {
       return true;
    }

    public Weapon getWeaponByName(String nameWeapon) {
        try {
            WeaponServiceService service = new WeaponServiceService();
            WeaponService port = service.getWeaponServicePort();
            WeaponXML result = port.getWeaponByName(nameWeapon);
            Weapon weapon = new Weapon();
            weapon.XmlToWeapon(result);

            return weapon;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public boolean addWeapon(Weapon newWeapon) {
        try {
            WeaponXML xmlWeapon = new WeaponXML();

            xmlWeapon.setName(newWeapon.getName());
            xmlWeapon.setType(newWeapon.getType());
            xmlWeapon.setWeight(newWeapon.getWeight());
            xmlWeapon.setLength(newWeapon.getLength());
            xmlWeapon.setCaliber(newWeapon.getCaliber());
            xmlWeapon.setSpead(newWeapon.getSpeadOfTheBullet());

            WeaponServiceService service = new WeaponServiceService();
            WeaponService port = service.getWeaponServicePort();
            boolean result = port.addWeapon(xmlWeapon);
            return result;
            
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean deleteWeapon(String weaponName){
        try {
            WeaponServiceService service = new WeaponServiceService();
            WeaponService port = service.getWeaponServicePort();
            boolean result = port.deleteWeapon(weaponName);
            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public Weapon[] getAllWeapon(){

        try {
            WeaponServiceService service = new WeaponServiceService();
            WeaponService port = service.getWeaponServicePort();
            WeaponsList result = port.getWeapons();
            Weapon[] weapons = new Weapon[result.getList().size()];

            int i = 0;

            for (WeaponXML xmlWeapon : result.getList()) {
                Weapon weapon = new Weapon();
                weapon.XmlToWeapon(xmlWeapon);
                weapons[i] = weapon;
                i++;
            }

            return weapons;

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
