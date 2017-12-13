package com.lanou3g.tcp.study;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by zyf on 2017/12/12.
 */
public class ReceiveMain {
	public static void main(String[] args) throws IOException {
		//创建一个接收方ServerSocket对象
		//构造方法中传入的参数为9999
		//就是端口号
		ServerSocket ss =
				new ServerSocket(9999);

		//从接收方，得到是谁发过来的
		//因为接收方和发送方会建立连接
		//这里就是通过接收方，获得发送方
		//accept方法是一个阻塞式方法
		//如果获得不到发送方的socket，那么就会将程序
		//阻塞在这里，不再向下执行
		Socket socket = ss.accept();


		//获得发送方的读取对象
		InputStream is =
				socket.getInputStream();

		byte[] buf = new byte[24];


		//调用is的读取方法
		//将socket中的内容，
		// 读取到buf这个字节数组中

		//返回值为读取了多少数据
		int len = 0;

		String c = "";

		StringBuffer sb = new StringBuffer();

		while ((len = is.read(buf)) != -1){
			//根据字节数组，创建出一个字符串
			//取数组中，从0开始，取多少个，取len个
			String content =
					new String(buf,0,len);

			//"春""江"
			//输出
//			System.out.print(content);
//			c+=content;
			sb.append(content);
		}

		//我想在这里使用接收到的字符串

		System.out.println(sb);

		ss.close();




	}
}
