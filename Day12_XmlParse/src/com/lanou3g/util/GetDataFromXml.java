package com.lanou3g.util;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zyf on 2017/12/7.
 */
public class GetDataFromXml<T> {
	private List<T> data;
	private Class<T> clazz;


	public List<T> getFromXmlPath(Class<T> clazz,String path){
		data = new ArrayList<T>();
		this.clazz = clazz;

		SAXReader reader = new SAXReader();
		try {
			Document document = reader.read(new File(path));
			Element root = document.getRootElement();
			List<Element> eles = root.elements();
			for (int i = 0; i < eles.size(); i++) {
				allEles(eles.get(i));
			}

		} catch (DocumentException e) {
			throw new RuntimeException("文件未找到");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return data;
	}


	private void allEles(Element e)throws Exception{
		if(!e.getName().equalsIgnoreCase(clazz.getSimpleName())){
			return;
		}
		//创建一个对象
		T t = clazz.newInstance();


		//获取该类中所有的属性
		Field[] allFields = this.clazz.getDeclaredFields();

		for (Field field : allFields) {
			//获取每一个属性的名字
			String name = field.getName();
			//看一下标签e中有没有name这个属性
			Attribute attr = e.attribute(name);
			//打破private的限制
			field.setAccessible(true);
			String value = null;
			if (attr != null){
				//说明有这个属性，那么从e中拿出来它的值
				value = attr.getValue();
			}

			//看一下标签e中有没有name这个子标签
			Element ele = e.element(name);
			if(ele != null){
				value = ele.getTextTrim();
			}

			try{

				//设置给t
				field.set(t,value);
			}catch (IllegalArgumentException i){
				int v = Integer.parseInt(value);
				field.set(t,v);
			}
		}

		data.add(t);

	}


}
