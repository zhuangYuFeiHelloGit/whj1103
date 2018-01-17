package com.lanou3g.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import java.io.InputStream;

/**
 * Created by zyf on 2018/1/17.
 */
public class DownloadAction extends ActionSupport {

	private InputStream stream;
	private String filename;

	public String down(){

		filename = "dog.jpg";
		//获得在web下的图片
		//应该怎么写？

		//getServletContext().getResourceAsStream("相对路径");

		ServletContext servletContext =
				ServletActionContext.getServletContext();
		stream = servletContext
		.getResourceAsStream("img/dog.jpg");

		//stream=null

		return SUCCESS;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public InputStream getStream() {
		return stream;
	}

	public void setStream(InputStream stream) {
		this.stream = stream;
	}
}
