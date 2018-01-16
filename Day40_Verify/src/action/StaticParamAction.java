package action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by zyf on 2018/1/16.
 */
public class StaticParamAction extends ActionSupport {

	private String username;
	private String password;


	@Override
	public String execute() throws Exception {
		System.out.println("username：---"+username);
		System.out.println("password：---"+password);
		return super.execute();
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
}
