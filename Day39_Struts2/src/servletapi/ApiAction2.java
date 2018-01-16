package servletapi;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by zyf on 2018/1/15.
 */
public class ApiAction2 extends ActionSupport implements ServletRequestAware{

	//实现XXXAware接口的方式，获得ServletAPI

	private HttpServletRequest request;

	@Override
	public void setServletRequest(HttpServletRequest httpServletRequest) {
		this.request = httpServletRequest;
	}

	public String api2(){
		//要在这里使用request
		this.request.setAttribute("","");
		return SUCCESS;
	}



}
