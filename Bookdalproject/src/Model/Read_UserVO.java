package Model;

public class Read_UserVO {
	
	String member_id;
	String borrow_date;

	public Read_UserVO(String member_id, String borrow_date) {
		this.member_id = member_id;
		this.borrow_date = borrow_date;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getBorrow_date() {
		return borrow_date;
	}

	public void setBorrow_date(String borrow_date) {
		this.borrow_date = borrow_date;
	}
}
