package com.lanou3g.study;

import java.io.*;

/**
 * Created by zyf on 2017/12/12.
 */
public class CopyPic {
	public static void main(String[] args) throws IOException {
		FileInputStream fis =
				new FileInputStream("src/girl.jpg");

		byte[] buff =
				new byte[1024*1024*10];

		fis.read(buff);

		FileOutputStream fos =
				new FileOutputStream("src/girl2.jpg");

		fos.write(buff);


		fis.close();
		fos.close();




	}
}
