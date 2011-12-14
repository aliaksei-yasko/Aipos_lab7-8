/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package alex.ejbbeans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alexei Yasko
 */
@Stateless
public class WeaponsFacade extends AbstractFacade<Weapons> implements WeaponsFacadeLocal {
    @PersistenceContext(unitName = "WeaponEJBPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public WeaponsFacade() {
        super(Weapons.class);
    }

}
