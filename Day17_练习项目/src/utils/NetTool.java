package utils;

import bean.User;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Dom4JDriver;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

/**
 * Created by zyf on 2017/12/14.
 */
public class NetTool {


	/**
	 * 提交分数
	 * @param url
	 * @param nickname 昵称
	 * @param score		分数
	 */
	public String pushScore(String url, String nickname, int score) {

		String realUrl = url + "?" + "username=" + nickname + "&score=" + score;


		String json = getResultString(realUrl);


		return json;

	}


	/**
	 * 拉取结果为json数组的请求
	 * @param url
	 * @param clazz	指定要将json转换成的实体类类型
	 * @param <T>
	 * @return		装载对应实体类的集合
	 */
	public <T> List<T> pullJsonArray(String url, Class<T> clazz) {

		String json = getResultString(url);

		JSONArray jsonArray = JSONArray.fromObject(json);
		List<T> list = null;
		try {
			list = jsonArray.toList(jsonArray, clazz.newInstance(), new JsonConfig());
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		return list;


	}


	/**
	 * 拉取结果为json对象的请求
	 * @param url
	 * @param clazz 指定要将json转换成的实体类类型
	 * @param <T>
	 * @return
	 */
	public <T> T pullJsonObject(String url, Class<T> clazz) {

		String json = getResultString(url);


		JSONObject jsonObject = JSONObject.fromObject(json);
		T t = (T) JSONObject.toBean(jsonObject);

		return t;

	}


	/**
	 * 拉取结果为xml数据的请求
	 * @param url
	 * @param clazz 指定要将xml转换成的实体类类型
	 * @param <T>
	 * @return
	 */
	public <T> T pullXml(String url,Class<T> clazz){
		String xml = getResultString(url);
		System.out.println(xml);
		XStream xStream = new XStream(new Dom4JDriver());
		xStream.alias("User", User.class);
		T t = null;
		try {
			t = (T) xStream.fromXML(xml,clazz.newInstance());
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		return t;
	}

	/**
	 * 获得访问的字符串结果
	 * 可能是xml
	 * 可能是json
	 * @param url
	 * @return
	 */
	private String getResultString(String url) {
		StringBuilder sb = new StringBuilder();
		try {
			URL u = new URL(url);
			URLConnection conn = u.openConnection();
			InputStream is = conn.getInputStream();

			byte[] bytes = new byte[1024];

			int len = 0;
			while ((len = is.read(bytes)) != -1) {
				String str = new String(bytes, 0, len);
				sb.append(str);
			}

			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}


}
