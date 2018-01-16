package action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by zyf on 2018/1/16.
 */
public class DecValAction extends ActionSupport{
	private String name;

	public String dec1(){
		return SUCCESS;
	}

	public String dec2(){
		return SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
