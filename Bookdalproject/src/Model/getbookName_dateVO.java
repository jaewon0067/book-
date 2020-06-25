package Model;

public class getbookName_dateVO {

	private String book_name;
	private String borrow_date;

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getBorrow_date() {
		return borrow_date;
	}

	public void setBorrow_date(String borrow_date) {
		this.borrow_date = borrow_date;
	}

	public getbookName_dateVO(String book_name, String borrow_date) {
		super();
		this.book_name = book_name;
		this.borrow_date = borrow_date;
	}
}
