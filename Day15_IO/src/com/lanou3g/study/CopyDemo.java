package com.lanou3g.study;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by zyf on 2017/12/12.
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException {
		//需求是，把t1.txt中的内容，
		// 复制到target.txt中

		FileReader fr =
				new FileReader("src/t1.txt");

		char[] chs = new char[1024];

		//返回值表示：读了多少字符
		int len = fr.read(chs);


		FileWriter fw =
				new FileWriter("src/target.txt");

		fw.write(chs,0,len);

		fr.close();
		fw.close();



	}
}
