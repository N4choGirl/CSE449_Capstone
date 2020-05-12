package application;

import javafx.beans.property.SimpleStringProperty;

/**
 * This is a helper class that is used in the controller to populate the table on the passing diagram
 * page. The variables are period, time, playType, status, team, and player. Period is the period during 
 * the hockey game (1-3), time is the current time on the clock, playType is what kind of transition 
 * the puck is going through, whether a pass, clear, or hit. Status is whether it was successful or not.
 * team is the team that has possession, and player is the player number that has possession at that time.
 * 
 * @author Matthew Murch/Colin Evans
 *
 */
public class PassingTable {

	// Instance variables
	private final SimpleStringProperty period;	
	private final SimpleStringProperty time;
	private final SimpleStringProperty playType;
	private final SimpleStringProperty status;
	private final SimpleStringProperty team;
	private final SimpleStringProperty player;

	/**
	 * Constructor for the PassingTable class. Takes in the variables as a String and casts as a 
	 * SimpleStringMethod for the table to use. Variables are described above.
	 * 
	 * @param period
	 * @param time
	 * @param playType
	 * @param status
	 * @param teamMember
	 * @param player
	 */
	public PassingTable(String period, String time, String playType, String status, String teamMember, String player) {
		super();
		this.period = new SimpleStringProperty(period);
		this.time = new SimpleStringProperty(time);
		this.playType = new SimpleStringProperty(playType);
		this.status = new SimpleStringProperty(status);
		this.team = new SimpleStringProperty(teamMember);
		this.player = new SimpleStringProperty(player);
	}

	// Getters for the variables so that the table can grab the values that it needs
	public String getPeriod() {
		return period.get();
	}

	public String getTime() {
		return time.get();
	}

	public String getPlayType() {
		return playType.get();
	}

	public String getStatus() {
		return status.get();
	}

	public String getTeam() {
		return team.get();
	}

	public String getPlayer() {
		return player.get();
	}
}
