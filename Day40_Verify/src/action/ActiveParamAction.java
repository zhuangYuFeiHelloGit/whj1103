package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;

/**
 * Created by zyf on 2018/1/16.
 */
public class ActiveParamAction extends ActionSupport {
	private String username;
	private String password;



	@Override
	public String execute() throws Exception {
		System.out.println("username：---"+username);
		System.out.println("password：---"+password);
		return super.execute();
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
