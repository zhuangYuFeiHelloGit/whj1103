import java.util.List;

/**
 * Created by zyf on 2018/1/12.
 */
public class PageBean {
	private List<Book> books;
	//private int totalPages;
	private int pageCode;
	private int totalData;
	private int pageSize = 10;

	//多条件组合查询时的参数
	private String params;

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setTotalData(int totalData) {
		this.totalData = totalData;
	}

	public PageBean() {
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public int getTotalPages() {
		int ps = totalData / 10;
		if(totalData % 10 > 0 ){
			ps++;
		}
		return ps;
	}

	public int getPageCode() {
		return pageCode;
	}

	public void setPageCode(int pageCode) {
		this.pageCode = pageCode;
	}
}
