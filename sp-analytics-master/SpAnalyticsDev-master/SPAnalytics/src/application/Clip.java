package application;
import java.util.ArrayList;

/**
 * A clip class that is used within the Controller, This was created by phase 1 of the project and phase 2 wasn't
 * really able to figure out what it did/was used for. We didn't use it at all and just left be the code in which
 * does use it. 
 * 
 * @author Phase 1
 *
 */
public class Clip {

	private String driveUrl;
	private String time;
	private String game;
	private String title;
	private ArrayList<String> players;
	private ArrayList<DrawnObject> rinkDiagram; //list of string

	public Clip() {}

	public Clip(String time, String title) {
		this.time = time;
		this.title = title;

		players = new ArrayList<String>();
		rinkDiagram = new ArrayList<DrawnObject>();
	}
	public Clip(String time, String title, ArrayList<String> players, ArrayList<DrawnObject> rinkDiagram, String driveUrl, String game) {
		this.time=time;
		this.title=title;
		this.players=players;
		this.rinkDiagram=rinkDiagram;
		this.driveUrl=driveUrl;
		this.game=game;
	}

	public void addPlayer(String p) {
		players.add(p);
	}

	public void addPlayer(ArrayList<String> p) {
		players.addAll(p);
	}

	public ArrayList<DrawnObject> getRinkDiagram() {
		return rinkDiagram;
	}

	public void setRinkDiagram(ArrayList<DrawnObject> drawing) {
		rinkDiagram = drawing;
	}

	public ArrayList<String> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<String> players) {
		this.players=players;
	}
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getURL() {
		return driveUrl;
	}

	public void setURL(String driveUrl) {
		this.driveUrl = driveUrl;
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
}
