package application;

/**
 * Class created by phase 1, no idea what this is used in or useful for. (from phase 2)
 * 
 * @author SPAnalytics Phase 1
 *
 */
public class Goalie {
	private int win;
	private int losses;
	private int ties;
	private int goalsAgainst;
	private int goalsAgainstAverage;
	private int shotsFaced;
	private int shotsSaved;
	private int savePercent;
	private int shootOut;

	public Goalie(){}
	public Goalie(int shotsFaced, int shotsSaved, int savePercent) {
		this.shotsFaced = shotsFaced;
		this.shotsSaved = shotsSaved;
		this.savePercent = savePercent;

	}
	public Goalie(int win, int losses, int ties, int goalsAgainst, int goalsAgainstAverage, 
			int shotsFaced, int shotsSaved, int savePercent, int shootOut) {
		super();
		this.win = win;
		this.losses = losses;
		this.ties = ties;
		this.goalsAgainst = goalsAgainst;
		this.goalsAgainstAverage = goalsAgainstAverage;
		this.shotsFaced = shotsFaced;
		this.shotsSaved = shotsSaved;
		this.savePercent = savePercent;
		this.shootOut = shootOut;
	}


}
