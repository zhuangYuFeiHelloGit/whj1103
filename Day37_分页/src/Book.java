/**
 * Created by zyf on 2018/1/12.
 */
public class Book {
	private String bookName;
	private String author;
	private String price;
	private String category;

	public Book(String bookName, String author, String price, String category) {
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.category = category;
	}

	public Book() {
	}

	@Override
	public String toString() {
		return "Book{" +
				"bookName='" + bookName + '\'' +
				", author='" + author + '\'' +
				", price='" + price + '\'' +
				", category='" + category + '\'' +
				'}';
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
