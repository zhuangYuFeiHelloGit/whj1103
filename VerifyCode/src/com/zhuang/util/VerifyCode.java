package com.zhuang.util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

/**
 * Created by zyf on 2017/4/19.
 */
public class VerifyCode {

	private int w = 70;
	private int h = 35;
	private Random random = new Random();
	private String[] fontNames = {"宋体","华文楷体","黑体","微软雅黑","楷体_GB2313"};
	private String resource = "23456789abcdefghjkmnopqrstuvwxyzABCDEFGHJKMNOPQRSTUVWXYZ";
	private Color bgColor = new Color(255,255,255);

	private String text;

	private static VerifyCode vc;

	static {
		vc = new VerifyCode();
	}

	private VerifyCode() {
	}

	public static VerifyCode getInstance(){
		return vc;
	}

	private Color randomColor(){
		int red = random.nextInt(150);
		int green = random.nextInt(150);
		int blue = random.nextInt(150);
		return new Color(red,green,blue);
	}

	private Font randomFont(){
		int index = random.nextInt(fontNames.length);
		int style = random.nextInt(4);
		int size = random.nextInt(5)+24;
		return new Font(fontNames[index],style,size);
	}

	private void drawLine(BufferedImage image){
		int num = 3;
		Graphics2D g2 = (Graphics2D) image.getGraphics();
		for (int i = 0; i < num; i++) {
			int x1 = random.nextInt(w);
			int y1 = random.nextInt(h);
			int x2 = random.nextInt(w);
			int y2 = random.nextInt(h);

			g2.setStroke(new BasicStroke(1.5F));
			g2.setColor(randomColor());
			g2.drawLine(x1,y1,x2,y2);
		}

	}

	private char randomChar(){
		int index = random.nextInt(resource.length());
		return resource.charAt(index);
	}

	private BufferedImage createImage(){
		BufferedImage bi = new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
		Graphics2D g2 = (Graphics2D) bi.getGraphics();
		g2.setColor(bgColor);
		g2.fillRect(0,0,w,h);
		return bi;

	}

	public String getText() {

		return text;
	}

	public BufferedImage getVerifyImage() {
		BufferedImage bi = createImage();
		Graphics2D g2 = (Graphics2D) bi.getGraphics();
		StringBuilder sb = new StringBuilder();
		//画四个字符
		for (int i = 0; i < 4; i++) {
			String s = randomChar()+"";
			sb.append(s);
			float x = i * 1.0F * w /4;
			g2.setFont(randomFont());
			g2.setColor(randomColor());
			g2.drawString(s,x,h-5);
		}
		text = sb.toString();
		drawLine(bi);
		return bi;
	}

	public String output(String path){
		try {
			output(getVerifyImage(),new FileOutputStream(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return getText();
	}


	public String output(OutputStream os){
		try {
			output(getVerifyImage(),os);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return getText();
	}

	private void output(BufferedImage bi, OutputStream os) throws IOException {
		ImageIO.write(bi, "JPEG", os);
	}
}
