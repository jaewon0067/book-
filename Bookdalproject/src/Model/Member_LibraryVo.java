package Model;

public class Member_LibraryVo {
	private String id;
	private String pw;
	private String name;
	private String age;
	private String gender;
	private String phone;
	private String addr;
	private String number;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Member_LibraryVo(String id, String pw, String name, String age, String phone, String gender, String addr) {
	
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.addr = addr;
	}
	public Member_LibraryVo(String id, String pw) {
	
		this.id = id;
		this.pw = pw;
		
	}
	public Member_LibraryVo(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	public Member_LibraryVo(String number) {
		
		this.number = number;
	}
	
	
	
	
}
