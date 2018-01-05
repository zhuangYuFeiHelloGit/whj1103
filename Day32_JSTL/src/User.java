/**
 * Created by zyf on 2018/1/5.
 */
public class User {
	private String name;
	private String gender;

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", gender='" + gender + '\'' +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public User() {

	}
}
