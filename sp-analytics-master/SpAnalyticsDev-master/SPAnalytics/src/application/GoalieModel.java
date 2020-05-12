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
public class GoalieModel {
	private SimpleObjectProperty season = new SimpleObjectProperty();
	private SimpleObjectProperty gamesPlayed = new SimpleObjectProperty();
	private SimpleObjectProperty wins = new SimpleObjectProperty();
	private SimpleObjectProperty losses = new SimpleObjectProperty();
	private SimpleObjectProperty ties = new SimpleObjectProperty();
	private SimpleObjectProperty goalsAgainst = new SimpleObjectProperty();
	private SimpleObjectProperty goalsAgainstAverage = new SimpleObjectProperty();
	private SimpleObjectProperty shotsAgainst = new SimpleObjectProperty();
	private SimpleObjectProperty saves = new SimpleObjectProperty();
	private SimpleObjectProperty savePercent = new SimpleObjectProperty();
	private SimpleObjectProperty shootOut = new SimpleObjectProperty();

	public GoalieModel() {}


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

	public Object getW() {
		return wins.get();
	}

	public void setW(Object W) {
		this.wins = new SimpleObjectProperty(W);
	}

	public Object getL() {
		return losses.get();
	}

	public void setL(Object L) {
		this.losses = new SimpleObjectProperty(L);
	}

	public Object getT() {
		return ties.get();
	}

	public void setT(Object T) {
		this.ties = new SimpleObjectProperty(T);
	}
	public Object getGA() {
		return goalsAgainst.get();
	}

	public void setGA(Object GA) {
		this.goalsAgainst = new SimpleObjectProperty(GA);
	}
	public Object getGAA() {
		return goalsAgainstAverage.get();
	}

	public void setGAA(Object GAA) {
		this.goalsAgainstAverage = new SimpleObjectProperty(GAA);
	}
	public Object getSA() {
		return shotsAgainst.get();
	}

	public void setSA(Object SA) {
		this.shotsAgainst = new SimpleObjectProperty(SA);
	}
	public Object getSV() {
		return saves.get();
	}

	public void setSV(Object SV) {
		this.saves = new SimpleObjectProperty(SV);
	}
	public Object getSVpercent() {
		return savePercent.get();
	}

	public void setSVpercent(Object SVpercent) {
		this.savePercent = new SimpleObjectProperty(SVpercent);
	}
	public Object getSO() {
		return shootOut.get();
	}

	public void setSO(Object SO) {
		this.shootOut = new SimpleObjectProperty(SO);
	}
}
