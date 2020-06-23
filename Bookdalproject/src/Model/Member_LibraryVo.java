package Model;

public class Member_LibraryVo {
	private String id;
	private String pw;
	private String name;
	private String age;
	private String sex;
	private String phone;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Member_LibraryVo(String id, String pw, String name, String age, String phone, String sex) {
	
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.phone = phone;
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
	
	
	
}
