package Model;

public class RecommandVO {

	String gender;
	String book_name;

	public RecommandVO(String gender, String book_name) {
		super();
		this.gender = gender;
		this.book_name = book_name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

}
