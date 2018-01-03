import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by zyf on 2018/1/3.
 */
public class T {

	@Test
	public void t() throws UnsupportedEncodingException {
		String name = "张三";

		System.out.println(
				Arrays.toString(
					name.getBytes("UTF-8")
				)
		);

		name = URLEncoder.encode(name,"UTF-8");
		System.out.println(name);

		name = URLDecoder.decode(name,"UTF-8");

		System.out.println(name);

	}

	@Test
	public void t1(){
		Random random = new Random();
		int i = random.nextInt(1)+1;
		System.out.println(i);
	}
}
