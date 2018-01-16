import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by zyf on 2018/1/15.
 */
public class UserAction extends ActionSupport {

	/**
	 * 因为对于User的操作
	 * 肯定存在增删改查，或则其他的操作方式
	 * 那么我们可以给UserAction写出对应的方法
	 * 返回值可以我们自己定义
	 * 在struts.xml中的result标签中
	 * 可以找到对应的结果就可以了
	 */


	public String add(){
		return "add";
	}
	public String del(){
		return "del";
	}
	public String update(){
		return "update";
	}
	public String query(){
		return "query";
	}
}
