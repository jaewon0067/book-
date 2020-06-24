
public class BookVO {
	String book_index;
	String lib_location;
	String status;
	String restriction;
	String book_id;
	String book_name;
	String author;
	String publisher;
	String publishedin;
	String published_place;
	String original;
	String price;
	String sidebook;
	
	public BookVO(String book_index, String lib_location, String status, String restriction, String book_id,
			String book_name, String author, String publisher, String publishedin, String published_place, String original,
			String price, String sidebook) {
		super();
		this.book_index = book_index;
		this.lib_location = lib_location;
		this.status = status;
		this.restriction = restriction; // 
		this.book_id = book_id;
		this.book_name = book_name;
		this.author = author;
		this.publisher = publisher;
		this.publishedin = publishedin;
		this.published_place = published_place;
		this.original = original;
		this.price = price;
		this.sidebook = sidebook;
	}

	public String getBook_index() {
		return book_index;
	}

	public void setBook_index(String book_index) {
		this.book_index = book_index;
	}

	public String getLib_location() {
		return lib_location;
	}

	public void setLib_location(String lib_location) {
		this.lib_location = lib_location;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRestriction() {
		return restriction;
	}

	public void setRestriction(String restriction) {
		this.restriction = restriction;
	}

	public String getBook_id() {
		return book_id;
	}

	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPublishedin() {
		return publishedin;
	}

	public void setPublishedin(String publishedin) {
		this.publishedin = publishedin;
	}

	public String getPublished_place() {
		return published_place;
	}

	public void setPublished_place(String published_place) {
		this.published_place = published_place;
	}

	public String getOriginal() {
		return original;
	}

	public void setOriginal(String original) {
		this.original = original;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSidebook() {
		return sidebook;
	}

	public void setSidebook(String sidebook) {
		this.sidebook = sidebook;
	}
	


}
