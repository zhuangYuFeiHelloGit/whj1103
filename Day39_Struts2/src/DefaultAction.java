import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by zyf on 2018/1/15.
 */
public class DefaultAction extends ActionSupport {
	@Override
	public String execute() throws Exception {

		System.out.println("执行了默认类---");

		return super.execute();
	}
}
