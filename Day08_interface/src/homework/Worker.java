package homework;

public class Worker extends Person implements UserInter {
	
	
	

	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Worker(String name, String username, String password, String job) {
		super(name, username, password, job);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onLine() {
		System.out.println("工人开始干活了");
		strike();
	}

	@Override
	public void offLine() {
		System.out.println("工人觉得太累了想休息");
	}
	
	public void strike(){
		System.out.println("罢工！罢工！");
	}

}
