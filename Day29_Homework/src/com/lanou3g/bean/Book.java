package com.lanou3g.bean;

/**
 * Created by zyf on 2018/1/4.
 */
public class Book {
	private String bkName;
	private String author;
	private String price;

	@Override
	public String toString() {
		return "Book{" +
				"bkName='" + bkName + '\'' +
				", author='" + author + '\'' +
				", price='" + price + '\'' +
				'}';
	}

	public String getBkName() {
		return bkName;
	}

	public void setBkName(String bkName) {
		this.bkName = bkName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Book(String bkName, String author, String price) {
		this.bkName = bkName;
		this.author = author;
		this.price = price;
	}

	public Book() {

	}
}
