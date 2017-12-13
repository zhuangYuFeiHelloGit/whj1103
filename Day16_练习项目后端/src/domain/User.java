package domain;

/**
 * Created by zyf on 2017/12/13.
 */
public class User {
	private String username;
	private int score;

	@Override
	public String toString() {
		return "User{" +
				"username='" + username + '\'' +
				", score=" + score +
				'}';
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public User() {

	}
}
