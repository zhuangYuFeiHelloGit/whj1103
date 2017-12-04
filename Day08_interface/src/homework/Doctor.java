package homework;

public class Doctor extends Person  implements UserInter {

	
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(String name, String username, String password, String job) {
		super(name, username, password, job);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onLine() {
		System.out.println("医生开始干活了");
		operation();
	}

	@Override
	public void offLine() {
		System.out.println("医生觉得太累了想休息");
	}
	
	
	public void operation(){
		System.out.println("不好意思剪错了");
	}

}