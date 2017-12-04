package homework;

public class Cooker extends Person  implements UserInter {

	public Cooker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cooker(String name, String username, String password, String job) {
		super(name, username, password, job);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onLine() {
		System.out.println("厨师开始干活了");
		topSpoon();
	}

	@Override
	public void offLine() {
		System.out.println("厨师觉得太累了想休息");
	}
	
	public void topSpoon(){
		System.out.println("颠勺其实挺累的");
	}

}