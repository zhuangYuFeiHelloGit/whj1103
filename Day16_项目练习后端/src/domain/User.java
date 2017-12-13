package domain;

/**
 * Created by zyf on 2017/12/13.
 */
public class User {
	private String nickName;
	private int score;

	@Override
	public String toString() {
		return "User{" +
				"nickName='" + nickName + '\'' +
				", score=" + score +
				'}';
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
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
