package main;

import bean.User;
import org.junit.Test;
import utils.Constants;
import utils.NetTool;


/**
 * Created by zyf on 2017/12/14.
 */
public class MainTest {
	@Test
	public void t(){
		User user = new NetTool().pullXml(Constants.URL_FIRST, User.class);
		System.out.println("目前第一名为：" + user.getNickname() + "\t成绩为" + user.getScore());

	}

}