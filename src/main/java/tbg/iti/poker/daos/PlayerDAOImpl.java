/**
 * 
 */
package tbg.iti.poker.daos;

import org.springframework.stereotype.Repository;

import tbg.iti.poker.models.Player;

/**
 * @author dossj
 *
 */
@Repository
public class PlayerDAOImpl extends DAOImpl<Player, Integer> implements PlayerDAO {
}
