package homework;

public class BOSS extends Person implements UserInter {

	
	public BOSS() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BOSS(String name, String username, String password, String job) {
		super(name, username, password, job);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onLine() {
		System.out.println("老板开始干活了");
		
		this.addMoney();
	}

	@Override
	public void offLine() {
		System.out.println("老板觉得太累了想休息");
	}
	
	public void addMoney(){
		System.out.println("涨工资？老板说你想多了");
	}

	
	
	
	
	
	
	
	
	
}