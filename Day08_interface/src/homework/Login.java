package homework;

public class Login {
	public UserInter login(String username,String password){
		for(int i=0;i<UserData.users.length;i++){

			String name = UserData.users[i][0];
			String us = UserData.users[i][1];
			String pw = UserData.users[i][2];
			String job = UserData.users[i][3];
			if(username.equals(us) 
					&& password.equals(pw)){
				System.out.println("登录成功了，需要返回一个对应的对象");
				
				
				switch(job){
				case "Worker":
					
					return new Worker(name,us,pw,job);
				case "Cooker":
					return new Cooker(name,us,pw,job);
				case "Doctor":
					return new Doctor(name,us,pw,job);
				case "BOSS":
					return new BOSS(name,us,pw,job);
				}
			}
		}
		System.out.println("登录失败，用户名密码不匹配");
		return null;
	}
}
