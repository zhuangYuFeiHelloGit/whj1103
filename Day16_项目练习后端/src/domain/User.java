package domain;

/**
 * Created by zyf on 2017/12/13.
 */
public class User {
	private String nickname;
	private int score;

	@Override
	public String toString() {
		return "User{" +
				"nickname='" + nickname + '\'' +
				", score=" + score +
				'}';
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
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
