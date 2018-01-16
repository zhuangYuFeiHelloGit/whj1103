package action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by zyf on 2018/1/16.
 */
public class ResultAction extends ActionSupport{
	public String plaintext(){
		return SUCCESS;
	}

	public String toGlobalGR(){
		System.out.println(
				"请求转发到：Global包下的gr"
		);
		return SUCCESS;
	}

	@Override
	public String execute() throws Exception {
		return super.execute();
	}
}
