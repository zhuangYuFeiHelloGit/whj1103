package homework;

import java.io.*;

/**
 * Created by zyf on 2017/12/13.
 */
public class 反序列化示例 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fr =
				new FileInputStream("src/");

		ObjectInputStream ois =
				new ObjectInputStream(fr);

		Object o = ois.readObject();

		System.out.println(o);


		ois.close();
	}



}
