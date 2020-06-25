package Model;

import java.awt.Dimension;
import javax.swing.JTable;

public class TableVo {
	private String id;
	private String borrow_date;
	private String book_name;
	private String lib_name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBorrow_date() {
		return borrow_date;
	}
	public void setBorrow_date(String borrow_date) {
		this.borrow_date = borrow_date;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getLib_name() {
		return lib_name;
	}
	public void setLib_name(String lib_name) {
		this.lib_name = lib_name;
	}
	public TableVo(String id, String borrow_date, String book_name, String lib_name) {
		super();
		this.id = id;
		this.borrow_date = borrow_date;
		this.book_name = book_name;
		this.lib_name = lib_name;
	}
    
}


	
