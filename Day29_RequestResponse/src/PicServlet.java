import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by zyf on 2018/1/2.
 */
@WebServlet(name = "PicServlet",urlPatterns = "/pic")
public class PicServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		File file = new File("/Users/zyf/Desktop/1_图片/搞怪图片/girl.jpg");
		InputStream stream = getServletContext().getResourceAsStream("../img/girl.jpg");
		FileInputStream fis =
				new FileInputStream("/Users/zyf/Desktop/1_图片/搞怪图片/girl.jpg");

		byte[] pics = new byte[1024*1024*10];

		int length = stream.read(pics);

		fis.close();

		response.getOutputStream()
				.write(pics,0,length);



	}
}
