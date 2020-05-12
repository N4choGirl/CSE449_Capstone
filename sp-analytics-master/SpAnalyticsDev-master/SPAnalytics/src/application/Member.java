package application;

import java.util.ArrayList;

/**
 * Class created by phase 1, no idea what this is used in or useful for. (from phase 2)
 * 
 * @author SPAnalytics Phase 1
 *
 */
public class Member {

	private int goals;
	private int assists;
	private int points;
	private int winsOrLosses;
	private int shotsOnGoal;
	private int percent;
	private int powerPlayGoals;
	private int powerPlayAssists;
	private int shortHandedGoals;
	private int gameWinningGoals;
	private int gameTyingGoals;
	private int TOIG; // Not sure what this is/does, Ask Jackson to clarify and then change so it's easier to understand
	private int productionValue;


	public Member() {}


	public Member(int g, int a, int pTS, int winsOrLosses, int sOG, int percent, int pPG, int pPA, int sHG,
			int gWG, int gTG, int tOIG, int pROD) {
		super();
		goals = g;
		assists = a;
		points = pTS;
		this.winsOrLosses = winsOrLosses;
		shotsOnGoal = sOG;
		this.percent = percent;
		powerPlayGoals = pPG;
		powerPlayAssists = pPA;
		shortHandedGoals = sHG;
		gameWinningGoals = gWG;
		gameTyingGoals = gTG;
		TOIG = tOIG;
		productionValue = pROD;
	}
}
