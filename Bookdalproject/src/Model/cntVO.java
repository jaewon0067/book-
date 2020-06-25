package Model;

public class cntVO {
	String book_name;
	int cnt;

	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public cntVO(String book_name, int cnt) {
		
		this.book_name = book_name;
		this.cnt = cnt;
	}
}
