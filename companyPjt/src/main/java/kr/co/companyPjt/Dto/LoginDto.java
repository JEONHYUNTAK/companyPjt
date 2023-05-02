package kr.co.companyPjt.Dto;

public class LoginDto {
	private int id; //아이디
	private int pwd; //비밀번호
	private String name; //이름
	private String email; //이메일
	
	//아이디 getter
	public int getId() {
		return id;
	}
	//비밀번호 getter
	public int getPwd() {
		return pwd;
	}
	//이름 getter
	public String getName() {
		return name;
	}
	//이메일 getter
	public String getEmail() {
		return email;
	}
	//아이디 setter
	public void setId(int id) {
		this.id = id;
	}
	//비밀번호 setter
	public void setPwd(int pwd) {
		this.pwd = pwd;
	}
	//이름 setter
	public void setName(String name) {
		this.name = name;
	}
	//이메일 setter
	public void setEmail(String email) {
		this.email = email;
	}
}
