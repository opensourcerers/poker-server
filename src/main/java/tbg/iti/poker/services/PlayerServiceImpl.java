/**
 * 
 */
package tbg.iti.poker.services;

import org.springframework.stereotype.Service;

import tbg.iti.poker.daos.PlayerDAO;
import tbg.iti.poker.models.Player;

/**
 * @author dossj
 *
 */
@Service
public class PlayerServiceImpl extends ServiceImpl<Player, Integer> implements PlayerService {

	public PlayerServiceImpl(PlayerDAO dao) {
		super(dao);
		// TODO Auto-generated constructor stub
	}
}
