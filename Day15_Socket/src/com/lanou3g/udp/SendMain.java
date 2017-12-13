package com.lanou3g.udp;

import com.lanou3g.util.Constants;

import java.io.IOException;
import java.net.*;

/**
 * Created by zyf on 2017/12/12.
 */
public class SendMain {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds =
				new DatagramSocket(8081);

		//创建一个地址对象，将ip地址传到构造方法中
		InetAddress address =
					InetAddress.getByName(
							Constants.ADDRESS
					);

		byte[] buff = new byte[1024];

		buff = "我是测试的内容".getBytes();

		//创建用来存储数据的数据包
		DatagramPacket dp =
				new DatagramPacket(
						buff,
						buff.length,
						address,
						8080);

		ds.send(dp);


	}
}
