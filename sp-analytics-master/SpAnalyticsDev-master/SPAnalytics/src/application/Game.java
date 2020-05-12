package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * This creates a game that is then added to the database. NOTE: This is the firebase database, if the transition
 * to the SQL database is truly done and done well, I believe that this class will become obsolete and will not be 
 * necessary. Not totally sure though. Because of that, I'm not totally sure I understand everything that this
 * class was supposed to be useful for. 
 * 
 * @author SPAnalytics Phase 1
 *
 */
public class Game {
	public String gameName;
	//game has multiple timestamp, each timestamp can have multiple players (no url)
	//game will have one url (string)
	//timestamp will have the clip (String), name (String)
	//players will have multiple timestamps
	//for every game, has net chart image and scoring chance image
	//offense scoring chance image and defense scoring chance image
	public TeamScore offense;
	public TeamScore defense;
	public String finalScore;
	public String url;


	public Game() {}

	public Game(String gameName, TeamScore offense, TeamScore defense, String finalScore) {
		this.gameName = gameName;
		this.offense = offense;
		this.defense = defense;
		this.finalScore = finalScore;

	}

	public Game(String gameName) {
		this.gameName = gameName;
	}

	public String getGameName() {
		return gameName;
	}

	public TeamScore getOffense() {
		return offense;
	}

	public TeamScore getDefense() {
		return defense;
	}

	public String getFinalScore() {
		return finalScore;
	}

	public String getUrl() {
		return url;
	}
}
