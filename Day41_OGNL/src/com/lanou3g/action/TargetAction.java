package com.lanou3g.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * Created by zyf on 2018/1/17.
 */
public class TargetAction extends ActionSupport {

	public String target(){
		ValueStack valueStack = ActionContext.getContext().getValueStack();
		System.out.println("target");
		return SUCCESS;
	}

}
