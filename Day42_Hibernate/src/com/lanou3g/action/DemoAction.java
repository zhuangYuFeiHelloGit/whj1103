package com.lanou3g.action;

import com.lanou3g.BaseDao;
import com.lanou3g.BaseDaoImpl;
import com.lanou3g.bean.Demo;

/**
 * Created by zyf on 2018/1/18.
 */
public class DemoAction {

	private BaseDao<Demo> baseDao
			= new BaseDaoImpl();

	public String demo(){
		//假装我是一个Struts2的action
		//毕竟POJO类也可以作为action使用
		baseDao.add(new Demo());
		return "success";
	}



}
