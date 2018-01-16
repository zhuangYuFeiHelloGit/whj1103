package bean;

/**
 * Created by zyf on 2018/1/16.
 */
public class Student {
	private String username;
	private int age;

	@Override
	public String toString() {
		return "Student{" +
				"username='" + username + '\'' +
				", age='" + age + '\'' +
				'}';
	}

	public Student() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
