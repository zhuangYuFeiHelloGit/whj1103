package action;

import com.opensymphony.xwork2.ActionSupport;
import com.zhuang.util.VerifyCode;
import org.apache.struts2.ServletActionContext;

import java.io.IOException;

/**
 * Created by zyf on 2018/1/16.
 */
public class CodeImgAction extends ActionSupport {
	public String codeImg() throws IOException {
		String output = VerifyCode.getInstance().output(
				ServletActionContext.getResponse().getOutputStream()
		);
		System.out.println(output);
		return SUCCESS;
	}
}
