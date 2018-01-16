package result;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Result;
import com.zhuang.util.VerifyCode;
import org.apache.struts2.ServletActionContext;

/**
 * Created by zyf on 2018/1/16.
 */
public class CodeImgResult implements Result {
	@Override
	public void execute(ActionInvocation actionInvocation) throws Exception {
		String output = VerifyCode.getInstance().output(
				ServletActionContext.
						getResponse().
						getOutputStream()
		);
		System.out.println(output);


	}
}
