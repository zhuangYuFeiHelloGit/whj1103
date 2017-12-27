/**
 * Created by zyf on 2017/12/27.
 */
public class Student {

	private String name;
	private String gender;

	public String getGender() {
		return gender;
	}

	public Student setGender(String gender) {
		this.gender = gender;
		return this;

	}

	public String getName() {
		return name;
	}

	public Student setName(String name) {
		this.name = name;
		return this;
	}

	public Student study(){
		System.out.println(this.name+"去学习了");
		return this;
	}

	public Student play(){
		System.out.println(this.name+"去玩耍了");
		return this;
	}


}
