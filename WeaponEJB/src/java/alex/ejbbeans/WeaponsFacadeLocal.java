/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package alex.ejbbeans;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alexei Yasko
 */
@Local
public interface WeaponsFacadeLocal {

    void create(Weapons weapons);

    void edit(Weapons weapons);

    void remove(Weapons weapons);

    Weapons find(Object id);

    List<Weapons> findAll();

    List<Weapons> findRange(int[] range);

    int count();

}
