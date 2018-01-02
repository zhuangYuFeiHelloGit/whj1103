/**
 * Created by zyf on 2017/12/29.
 */
public class T {

	private Class s = T.class;


	public void t(){
		//void 表示：无返回值
		//也就是当我调用t的时候，不需要返回值

		//只需要t执行完毕就可以了
		//UserDao#insertUser();
	}


	public boolean t2(){
		//
		return true;
	}


	public User t3(){
		//如果要得到的结果是User

		//当我调用t3，希望t3给我一个User的结果

		return new User();
	}

	//public 共有的，全部哪儿都能找到

	public void t4(){

	}

	//protected 同包或子类可以找到
	protected void t5(){

	}

	//私有的，只有本类可以使用
	private void t6(){

	}


	public void t7(){
//		this，指的是本类对象
	}



}
