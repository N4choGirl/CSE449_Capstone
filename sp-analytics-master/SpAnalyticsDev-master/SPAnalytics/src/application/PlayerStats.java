package application;

/**
 * Phase 1 made this, no idea what the fuck this is, other than sit here and do nothing. If this is used
 * somewhere no idea how or if it even works properly.
 * 
 * @author SPAnalytics Phase 1
 *
 */
public class PlayerStats {
	public String season;
	public int GP;
	public Position position;

	public PlayerStats() {}

	public PlayerStats(String season, int gP, Position position) {
		super();
		this.season = season;
		GP = gP;
		this.position = position;
	}
}