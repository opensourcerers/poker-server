package tbg.iti.poker.controllers;

import java.util.concurrent.atomic.AtomicLong;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tbg.iti.poker.models.Game;
import tbg.iti.poker.models.Greeting;

@RestController
public class GameController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	Game game;

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "Class") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	@GetMapping("/game/start")
	public Game start() {
		return game;
	}
	@GetMapping("/game/:id/state")
	public Game state(@PathVariable("id")Integer id) {
		return null;
	}
	@PostMapping("/game/:id/wager")
	public Game wager(@PathVariable("id")Integer id) {
		return null;
	}
	
	@PostConstruct
	public void initialize() {
		game = new Game();
	}
}
