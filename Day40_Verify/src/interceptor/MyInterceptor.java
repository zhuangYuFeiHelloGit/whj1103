package interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import org.apache.struts2.ServletActionContext;

/**
 * Created by zyf on 2018/1/16.
 */
public class MyInterceptor extends AbstractInterceptor {
	//自定义拦截器
//	要继承AbstractInterceptor
//	复写intercept方法
//	该方法的参数，actionInvocation决定是否放行

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {


		System.out.println("我要开始拦截了---");
		//String invoke = //这句代码就是放行
		//		actionInvocation.invoke();
		System.out.println("拦截完毕，放过去了---");

		//如果不是登录状态
		//不放行
		//直接return一个结果视图
		//重定向到登录页面即可

		//System.out.println(invoke);
		return "success";
	}
}
