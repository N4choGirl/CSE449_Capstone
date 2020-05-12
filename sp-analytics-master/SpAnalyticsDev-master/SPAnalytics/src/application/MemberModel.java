package application;

import javafx.beans.property.SimpleObjectProperty;

/**
 * This is used for setting the table on the player page. (See PossTable.java for a better example if you need
 * to create a table)
 * 
 * @author SPAnalytics Phase 1
 *
 */
//used for modifying the table
public class MemberModel {
	private SimpleObjectProperty season = new SimpleObjectProperty();
	private SimpleObjectProperty gamesPlayed = new SimpleObjectProperty();
	private SimpleObjectProperty goals = new SimpleObjectProperty();
	private SimpleObjectProperty assists = new SimpleObjectProperty();
	private SimpleObjectProperty points = new SimpleObjectProperty();
	private SimpleObjectProperty plusMinus = new SimpleObjectProperty();
	private SimpleObjectProperty shotOnGoal = new SimpleObjectProperty();
	private SimpleObjectProperty percent = new SimpleObjectProperty();
	private SimpleObjectProperty powerPlayGoals = new SimpleObjectProperty();
	private SimpleObjectProperty powerPlayAssists = new SimpleObjectProperty();
	private SimpleObjectProperty shortHandedGoals = new SimpleObjectProperty();
	private SimpleObjectProperty gameWinningGoals = new SimpleObjectProperty();
	private SimpleObjectProperty gameTyingGoals = new SimpleObjectProperty();
	private SimpleObjectProperty timeOnIce = new SimpleObjectProperty();
	private SimpleObjectProperty productionValue = new SimpleObjectProperty();

	public MemberModel() {};

	public Object getSeason() {
		return season.get();
	}

	public void setSeason(Object season) {
		this.season = new SimpleObjectProperty(season);
	}

	public Object getGP() {
		return gamesPlayed.get();
	}

	public void setGP(Object GP) {
		this.gamesPlayed = new SimpleObjectProperty(GP);
	}

	public Object getG() {
		return goals.get();
	}

	public void setG(Object G) {
		this.goals = new SimpleObjectProperty(G);
	}

	public Object getA() {
		return assists.get();
	}

	public void setA(Object A) {
		this.assists = new SimpleObjectProperty(A);
	}

	public Object getPTS() {
		return points.get();
	}

	public void setPTS(Object PTS) {
		this.points = new SimpleObjectProperty(PTS);
	}

	public Object getPlusMinus() {
		return plusMinus.get();
	}

	public void setPlusMinus(Object plusMinus) {
		this.plusMinus = new SimpleObjectProperty(plusMinus);
	}

	public Object getSOG() {
		return shotOnGoal.get();
	}

	public void setSOG(Object SOG) {
		this.shotOnGoal = new SimpleObjectProperty(SOG);
	}

	public Object getPercent() {
		return percent.get();
	}

	public void setPercent(Object percent) {
		this.percent = new SimpleObjectProperty(percent);
	}

	public Object getPPG() {
		return powerPlayGoals.get();
	}

	public void setPPG(Object PPG) {
		this.powerPlayGoals = new SimpleObjectProperty(PPG);
	}

	public Object getPPA() {
		return powerPlayAssists.get();
	}

	public void setPPA(Object PPA) {
		this.powerPlayAssists = new SimpleObjectProperty(PPA);
	}

	public Object getSHG() {
		return shortHandedGoals.get();
	}

	public void setSHG(Object SHG) {
		this.shortHandedGoals = new SimpleObjectProperty(SHG);
	}

	public Object getGWG() {
		return gameWinningGoals.get();
	}

	public void setGWG(Object GWG) {
		this.gameWinningGoals = new SimpleObjectProperty(GWG);
	}

	public Object getGTG() {
		return gameTyingGoals.get();
	}

	public void setGTG(Object GTG) {
		this.gameTyingGoals = new SimpleObjectProperty(GTG);
	}

	public Object getTOI() {
		return timeOnIce.get();
	}

	public void setTOI(Object TOI) {
		this.timeOnIce = new SimpleObjectProperty(TOI);
	}

	public Object getPROD() {
		return productionValue.get();
	}

	public void setPROD(Object PROD) {
		this.productionValue = new SimpleObjectProperty(PROD);
	}


}

