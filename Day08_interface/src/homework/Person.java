package homework;

public class Person {
	
	private String name;
	private String username;

	private String password;

	private String job;

	
	
	public Person() {
		super();
	}

	public Person(String name, String username, String password, String job) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	
	
	
	
}
