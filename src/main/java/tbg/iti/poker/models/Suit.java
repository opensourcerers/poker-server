package tbg.iti.poker.models;

/**
 * 
 * @author dossj
 *
 */
enum Suit {
HEARTS, DIAMONDS, CLUBS, SPADES;

	/**
	 * 
	 */
	@Override
	public String toString() {
		return name().substring(0, 1) + name().substring(1).toLowerCase();
	}
}
