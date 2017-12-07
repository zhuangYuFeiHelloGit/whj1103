package com.lanou3g.study;

import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Created by zyf on 2017/12/7.
 */
public class Main2 {

	static SAXReader reader = new SAXReader();


	static Document document = null;


	public static void main(String[] args) throws DocumentException, IOException {


		document =
			reader.read(new File("src/output.xml"));
		Element students =
				document.getRootElement();

		Element student = students.addElement("student");
		student.addText("我是后加紧来的");

		OutputFormat format =
				OutputFormat.createPrettyPrint();

		XMLWriter writer = new XMLWriter(new FileWriter("src/output.xml"),format);

		writer.write(document);
		writer.close();


//		List<Student> students =
//				listElements();
//
//		System.out.println(
//				Arrays.toString(students.toArray())
//		);


//		allEles(document.getRootElement());


	}


	public static void allEles(Element e){
		List<Attribute> attributes =
				e.attributes();

		for (int i = 0; i < attributes.size(); i++) {
			Attribute attr =
					attributes.get(i);

			System.out.println(
					"属性名为："+attr.getName()
					+"\t属性值为："+attr.getValue());
		}

		String text = e.getText();
		System.out.println("当前元素的文本为："+text);


		List<Element> elements =
				e.elements();

		//如果没有子标签，则结束这个方法
		if(elements.size() == 0){
			return;
		}


		for (int i = 0; i < elements.size(); i++) {
			//获得第i个子标签

			Element ele = elements.get(i);

			//扔到allELes这个方法中
			allEles(ele);
		}





	}





	private static List<Student> listElements() throws DocumentException {


		Element rootElement =
			document.getRootElement();

		List<Element> student =
			rootElement.elements("student");

		List<Student> studentData =
				new ArrayList<>();
		Map<String ,Student> stuMap =
				new HashMap<>();

		for (int i = 0; i < student.size(); i++) {

			Element ele = student.get(i);
			Student stu = new Student();

			Attribute name =
					ele.attribute("name");

			//获得name属性的值
			String nameValue = name.getValue();

			//设置到stu这个对象中
			stu.setName(nameValue);


			Element score = ele.element("score");

			//拿到score标签中的文本
			String text = score.getText();

			//"1001" --- > 1001
			stu.setScore(Integer.parseInt(text));

			//把数据健全的学生对象，装进集合中
			studentData.add(stu);

			System.out.println(
					"学生的名为："
					+nameValue+"\t"
					+"学生的分数为："+text
			);

		}
		return studentData;
	}

}
