import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by zyf on 2018/1/5.
 */
@WebServlet(name = "PicServlet",
		urlPatterns = "/pic")
public class PicServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//File,FileReader,FileInputStream
		//都是找本机中的文件：绝对路径

		//要想找本项目中的文件
		//需要使用ServletContext#getResourceAsStream
		//相对路径
		//这里这个相对路径，是相对web文件夹的
		InputStream picSteam = getServletContext()
				.getResourceAsStream("img/gogogo.jpg");

		byte[] bytes =
				IOUtils.toByteArray(picSteam);

		response.getOutputStream().write(bytes);

		//类对象.getClassLoader();
		//会获得一个ClassLoader对象
		//称为：类加载器
		//可以帮助我们加载一些文件
		//路径：相对src
	}
}
