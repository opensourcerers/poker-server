/**
 * 
 */
package tbg.iti.poker.models;

/**
 * @author dossj
 *
 */
class Card {
    Integer rank;
    Suit    suit;
    
    public Card(Integer rank, Suit suit) {
      this.rank = rank;
      this.suit = suit;
    }
    
    @Override
    public String toString() {
      String rankName;
      switch(this.rank) {
        case 1:
          rankName = "Ace";
          break;
        case 11:
          rankName = "Jack";
          break;
        case 12:
          rankName = "Queen";
          break;
        case 13:
          rankName = "King";
          break;
        default:
          rankName = this.rank.toString();
      }
      return rankName + " of " + this.suit.toString();
    }
  }
