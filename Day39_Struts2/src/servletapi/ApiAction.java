package servletapi;

import bean.User;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zyf on 2018/1/15.
 */
public class ApiAction extends ActionSupport {


	public String api(){
		List<User> users = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			User user = new User();
			user.setUsername("名字"+i);
			user.setAge(i);
			users.add(user);
		}

		ServletActionContext.getRequest()
				.setAttribute("users",users);
		return SUCCESS;
	}


}
