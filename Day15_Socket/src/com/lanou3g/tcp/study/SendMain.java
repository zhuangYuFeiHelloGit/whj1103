package com.lanou3g.tcp.study;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by zyf on 2017/12/12.
 */
public class SendMain {
	public static void main(String[] args) throws IOException {
		//创建一个socket对象
		//指定目标的ip地址和端口号
		Socket socket =
			new Socket("192.168.20.221",9999);

		//获得socket对象的输出工具
		//这个东西我们叫做流
		OutputStream os =
				socket.getOutputStream();

		//调用这个工具的写方法
		//把要传输的内容作为参数传进去
		//参数是一个字节数组
		os.write(("春江潮水连海平，海上明月共潮生。滟滟随波千万里，何处春江无月明。" +
				"江畔何年初见月，江月何年初照人。人生代代无穷已，江月年年只相似").getBytes());


		//关闭socket
		socket.close();




	}
}
