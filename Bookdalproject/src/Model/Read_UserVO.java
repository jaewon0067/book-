package Model;

public class Read_UserVO {
	
	String member_name;
	String borrow_date;

	public Read_UserVO(String member_name, String borrow_date) {
		this.member_name = member_name;
		this.borrow_date = borrow_date;
	}

	public String getMember_id() {
		return member_name;
	}

	public void setMember_id(String member_name) {
		this.member_name = member_name;
	}

	public String getBorrow_date() {
		return borrow_date;
	}

	public void setBorrow_date(String borrow_date) {
		this.borrow_date = borrow_date;
	}
}
