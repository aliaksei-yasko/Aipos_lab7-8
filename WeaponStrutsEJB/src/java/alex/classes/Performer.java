/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package alex.classes;

/**
 *
 * @author Alexei Yasko
 * Class that perform all basic function whith weapon service
 */
public class Performer {

    public Performer() {
        
    }

    /**
     *
     * Function that change information about weapon
     * @param updateWeapon new information about weapon
     * @param oldName old name of changing weapon
     * @return logical result of operation
     */
    public boolean changeWeapon (Weapon updateWeapon, String oldName) {
        try {
            /* Create xml that will be present information about weapon */
            WeaponXML xmlWeapon = new WeaponXML();

            xmlWeapon.setName(updateWeapon.getName());
            xmlWeapon.setType(updateWeapon.getType());
            xmlWeapon.setWeight(updateWeapon.getWeight());
            xmlWeapon.setLength(updateWeapon.getLength());
            xmlWeapon.setCaliber(updateWeapon.getCaliber());
            xmlWeapon.setSpead(updateWeapon.getSpeadOfTheBullet());

            /* Execute service method */
            WeaponServiceService service = new WeaponServiceService();
            WeaponService port = service.getWeaponServicePort();
            boolean result = port.changeWeapon(xmlWeapon, oldName);

            return result;

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    /**
     * Function that getting information about weapon
     * whith some name
     * @param nameWeapon - name of the weapon
     * @return weapons found
     */
    public Weapon getWeaponByName(String nameWeapon) {
        try {
            /* Execute service method */
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

    /**
     * Function that added weapon on the service
     * @param newWeapon weapon that we added
     * @return logical result of operation
     */
    public boolean addWeapon(Weapon newWeapon) {
        try {
            /* Create xml that will be present information about weapon */
            WeaponXML xmlWeapon = new WeaponXML();

            xmlWeapon.setName(newWeapon.getName());
            xmlWeapon.setType(newWeapon.getType());
            xmlWeapon.setWeight(newWeapon.getWeight());
            xmlWeapon.setLength(newWeapon.getLength());
            xmlWeapon.setCaliber(newWeapon.getCaliber());
            xmlWeapon.setSpead(newWeapon.getSpeadOfTheBullet());

            /* Execute service method */
            WeaponServiceService service = new WeaponServiceService();
            WeaponService port = service.getWeaponServicePort();
            boolean result = port.addWeapon(xmlWeapon);
            return result;
            
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    /**
     * Function that delete weapon from service
     * @param weaponName deleted weapon name
     * @return logical result of operation
     */
    public boolean deleteWeapon(String weaponName){
        try {
            /* Execute service method */
            WeaponServiceService service = new WeaponServiceService();
            WeaponService port = service.getWeaponServicePort();
            boolean result = port.deleteWeapon(weaponName);
            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    /**
     * Function that getting all weapon of service
     * @return all found weapon
     */
    public Weapon[] getAllWeapon(){

        try {
            /* Execute service method */
            WeaponServiceService service = new WeaponServiceService();
            WeaponService port = service.getWeaponServicePort();
            WeaponsList result = port.getWeapons();
            Weapon[] weapons = new Weapon[result.getList().size()];

            int i = 0;

            /* Convert to our weapon class */
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
