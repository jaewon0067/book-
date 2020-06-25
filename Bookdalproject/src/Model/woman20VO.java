package Model;

public class woman20VO {

	private String book_name;
	private int age;
	private String gender;

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public woman20VO(String book_name, int age, String gender) {
		super();
		this.book_name = book_name;
		this.age = age;
		this.gender = gender;
	}
}
