package com.lanou3g.study;

import com.lanou3g.util.GetDataFromXml;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zyf on 2017/12/7.
 */
public class Test {

	public static void main(String[] args) {
		GetDataFromXml<Teacher> gdfx
			= new GetDataFromXml<>();
		List<Teacher> students
			= gdfx.getFromXmlPath(Teacher.class, "src/test.xml");

		System.out.println(Arrays.toString(students.toArray()));
	}
}
