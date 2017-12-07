package com.lanou3g.study;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

/**
 * Created by zyf on 2017/12/7.
 */
public class Main {

	public static void main(String[] args) throws DocumentException {

		//用来帮助我们将.xml文件
		// 弄到java世界中来的一个工具类
		SAXReader saxReader = new SAXReader();

		//File：文件
		//括号中的字符串，是要找到哪个文件，
		// 就填入哪个文件的路径
		Document document =
			saxReader.read(new File("src/data.xml"));

		//获得文档的根节点
		//就是data.xml中的<students>标签
		Element root =
				document.getRootElement();

		//获得<students>中的<student>标签
		Element student =
				root.element("student");

//		List studentList = root.elements("student");

		//获得<student>标签下的name属性
		Attribute name =
				student.attribute("name");

		//获得name属性的值
		String value = name.getValue();
		System.out.println(value);

	}




}
