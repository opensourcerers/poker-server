/**
 * 
 */
package tbg.iti.poker.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import tbg.iti.poker.models.Player;
import tbg.iti.poker.services.PlayerService;

/**
 * @author dossj
 *
 */
@Controller
public class PlayerController {
	PlayerService service;
	
	public PlayerController(PlayerService service) {
		this.service = service;
	}
	
	@RequestMapping(path="/players", method=RequestMethod.GET)
	public @ResponseBody List<Player> getPlayers() {
		return service.listAll();
	}
	
	@RequestMapping(path="/players", method=RequestMethod.POST)
	public @ResponseBody Player createPlayer(@RequestBody Player Player) {
		service.create(Player);
		return Player;
	}
	
	@RequestMapping(path="/players/{id}", method=RequestMethod.GET)
	public @ResponseBody Player getPlayer(@PathVariable Integer id) {
		return service.getOne(id);
	}

	@RequestMapping(path="/players/{id}", method=RequestMethod.PUT)
	public @ResponseBody Player updatePlayer(@PathVariable Integer id, @RequestBody Player Player) {
		service.update(id, Player);
		return Player;
	}

	@RequestMapping(path="/player/{id}", method=RequestMethod.DELETE)
	public @ResponseBody Player deletePlayer(@PathVariable Integer id) {
		service.delete(id);
		return null;
	}
}
