package application;

import javafx.beans.property.SimpleStringProperty;

/**
 * This is a helper class that is used in the controller to populate the table on the possession diagram
 * page. The variables are period, time, team, and player. Period is the period during the hockey game (1-3),
 * time is the current time on the clock, team is the team that has possession, and player is the player 
 * number that has possession at that time.
 * 
 * @author Colin Evans
 *
 */
public class PossTable {

	// Instance variables
	private final SimpleStringProperty period;	
	private final SimpleStringProperty time;
	private final SimpleStringProperty team;
	private final SimpleStringProperty player;

	/**
	 * Constructor for the PossTable class. Takes in the variables as a String and casts as a 
	 * SimpleStringMethod for the table to use. Variables are described above.
	 * 
	 * @param period
	 * @param time
	 * @param team
	 * @param player
	 */
	public PossTable(String period, String time, String team, String player) {
		super();
		this.period = new SimpleStringProperty(period);
		this.time = new SimpleStringProperty(time);
		this.team = new SimpleStringProperty(team);
		this.player = new SimpleStringProperty(player);
	}

	// Getters for the variables so that the table can grab the values that it needs
	public String getPeriod() {
		return period.get();
	}

	public String getTime() {
		return time.get();
	}

	public String getTeam() {
		return team.get();
	}

	public String getPlayer() {
		return player.get();
	}

	// Override of the toString method so that it could be tested
	@Override
	public String toString() {
		return "TableData [period=" + period + ", timestamp=" + time + ", team=" + team + ", num=" + player + "]";
	}
}
