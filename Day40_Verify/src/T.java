import com.zhuang.util.VerifyCode;
import org.junit.Test;

/**
 * Created by zyf on 2018/1/16.
 */
public class T {

	@Test
	public void t(){
		String output = VerifyCode.getInstance().output(
				"/Users/zyf/Desktop/verify/show.jpg"
		);
		System.out.println(output);
	}

}
