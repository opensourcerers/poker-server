package tbg.iti.poker.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

/*Establishes a player and an entity. Attributes hands and points to each player.
 * 
 */
@Entity
@Table(name = "PLAYERS")
public class Player extends Model {
	private Hand hand;
	private Integer id;
	private String name;
	private Integer points;

	/**
	 * @return the hand
	 */
	@Transient
	public Hand getHand() {
		return hand;
	}

	/**
	 * @param hand the hand to set
	 */
	public void setHand(Hand hand) {
		this.hand = hand;
	}

	/**
	 * @return the id
	 */
	@Id
	@Column(columnDefinition="int", name="ID")
	@GeneratedValue(generator="generator")
	@GenericGenerator(name="generator", strategy="identity")
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
	 * @return the name
	 */
	@Column
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the points
	 */
	@Column
	public Integer getPoints() {
		return points;
	}

	/**
	 * @param points the points to set
	 */
	public void setPoints(Integer points) {
		this.points = points;
	}
	

}
