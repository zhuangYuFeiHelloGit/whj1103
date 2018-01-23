import com.lanou.mvc.action.UserAction;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by zyf on 2018/1/23.
 */
public class UserActionTest {


	private ApplicationContext context;

	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("spring-config.xml");
	}

	@Test
	public void login() throws Exception {
		UserAction userAction = (UserAction)
				context.getBean("userAction");

		String login = userAction.login();
		System.out.println(login);
	}
}