package Model;

public class ChartVO {

	private String id;
	private String bookName;
	private String age;
	private String gender;
	private String borrow_date;

	public ChartVO(String id, String bookName, String age, String gender, String borrow_date) {
		this.id = id;
		this.bookName = bookName;
		this.age = age;
		this.gender = gender;
		this.borrow_date = borrow_date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBorrow_date() {
		return borrow_date;
	}

	public void setBorrow_date(String borrow_date) {
		this.borrow_date = borrow_date;
	}

}
