package application;

import java.util.HashMap;
import java.util.Map;

/**
 * Creates a player, not totally sure where this is used/useful for other than adding a player to the database
 * This will probably need some refurbishing when you go to finalize the product.
 * 
 * @author SPAnalytics Phase 1
 *
 */
public class Player {
	public int jerseyNo;
	public String name;
	public String height;
	public String weight;
	public String birthDate;
	public String homeTown;
	public Map<String, PlayerStats> stats= new HashMap<>();
	public Map<String, Clip> clips= new HashMap<>();


	/**
	 * Generate player with no fields
	 */
	public Player() {}

	/**
	 * Creates a player with all of the variables filled with data
	 * @param jerseyNo
	 * @param name
	 * @param height
	 * @param weight
	 * @param birthDate
	 * @param homeTown
	 * @param stats
	 */
	public Player(int jerseyNo, String name, String height, String weight, String birthDate,
			String homeTown, Map<String, PlayerStats> stats) {
		this.jerseyNo = jerseyNo;
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.birthDate = birthDate;
		this.homeTown = homeTown;
		this.stats = stats;

	}


	//create a new player: called when adding a player to the database
	public Player(int jerseyNo, String name, String height, String weight, String birthDate,
			String homeTown) {
		this.jerseyNo = jerseyNo;
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.birthDate = birthDate;
		this.homeTown = homeTown;	
	}

	//remove player from database
	public Player(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}





}
