package com.lanou3g.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import org.apache.struts2.ServletActionContext;

/**
 * Created by zyf on 2018/1/17.
 */
public class LoginStatusInterceptor extends MethodFilterInterceptor {
	@Override
	protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
		Object attribute = ServletActionContext.getRequest().getSession().getAttribute("user");
		if (attribute == null){
			return "login";
		}
		return actionInvocation.invoke();
	}
}
