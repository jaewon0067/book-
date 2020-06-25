package Model;

public class BookcartbookVO {
	String Member_ID;
	String Member_Name;
	String Book_Name;
	String Book_ID;
	String Author;
	String Publisher;
	String Library;
	String status;
	
	public BookcartbookVO(String member_ID, String member_Name, String book_Name, String book_ID, String author,
			String publisher, String library, String status) {
		Member_ID = member_ID;
		Member_Name = member_Name;
		Book_Name = book_Name;
		Book_ID = book_ID;
		Author = author;
		Publisher = publisher;
		Library = library;
		this.status = status;
	}

	public String getMember_ID() {
		return Member_ID;
	}

	public void setMember_ID(String member_ID) {
		Member_ID = member_ID;
	}

	public String getMember_Name() {
		return Member_Name;
	}

	public void setMember_Name(String member_Name) {
		Member_Name = member_Name;
	}

	public String getBook_Name() {
		return Book_Name;
	}

	public void setBook_Name(String book_Name) {
		Book_Name = book_Name;
	}

	public String getBook_ID() {
		return Book_ID;
	}

	public void setBook_ID(String book_ID) {
		Book_ID = book_ID;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	public String getLibrary() {
		return Library;
	}

	public void setLibrary(String library) {
		Library = library;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
