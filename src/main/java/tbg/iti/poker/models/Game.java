package tbg.iti.poker.models;

import java.util.ArrayList;
import java.util.HashSet;

/*
 * 
 */
public class Game {
	ArrayList <Player> players;
	Integer bank;
	HashSet <Card> deck;
	Round round;
	Integer id;
	Rules rules;
	/**
	 * @return the players
	 */
	public ArrayList<Player> getPlayers() {
		return players;
	}
	/**
	 * @param players the players to set
	 */
	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
	/**
	 * @return the bank
	 */
	public Integer getBank() {
		return bank;
	}
	/**
	 * @param bank the bank to set
	 */
	public void setBank(Integer bank) {
		this.bank = bank;
	}
	/**
	 * @return the deck
	 */
	public HashSet<Card> getDeck() {
		return deck;
	}
	/**
	 * @param deck the deck to set
	 */
	public void setDeck(HashSet<Card> deck) {
		this.deck = deck;
	}
	/**
	 * @return the round
	 */
	public Round getRound() {
		return round;
	}
	/**
	 * @param round the round to set
	 */
	public void setRound(Round round) {
		this.round = round;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the rules
	 */
	public Rules getRules() {
		return rules;
	}
	/**
	 * @param rules the rules to set
	 */
	public void setRules(Rules rules) {
		this.rules = rules;
	}
	

}
