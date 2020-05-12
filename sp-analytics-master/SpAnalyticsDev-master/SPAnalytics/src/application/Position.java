package application;

/**
 * Created by phase 1, not really sure what this is useful for or does
 * 
 * @author SPAnalytics Phase 1
 *
 */
public class Position {
	public Goalie goalie;
	public Member member;
	public String namePosition;

	public Position() {}
	public Position(String namePosition) {
		this.namePosition = namePosition;
	}
	public Goalie goalie(Goalie goalie) {

		this.goalie = goalie;
		return this.goalie;
	}
	public Member member(Member member) {

		this.member = member;
		return this.member;
	}


}
