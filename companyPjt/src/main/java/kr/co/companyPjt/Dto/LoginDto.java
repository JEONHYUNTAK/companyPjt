package kr.co.companyPjt.Dto;

public class LoginDto {
	private int id; //���̵�
	private int pwd; //��й�ȣ
	private String name; //�̸�
	private String email; //�̸���
	
	//���̵� getter
	public int getId() {
		return id;
	}
	//��й�ȣ getter
	public int getPwd() {
		return pwd;
	}
	//�̸� getter
	public String getName() {
		return name;
	}
	//�̸��� getter
	public String getEmail() {
		return email;
	}
	//���̵� setter
	public void setId(int id) {
		this.id = id;
	}
	//��й�ȣ setter
	public void setPwd(int pwd) {
		this.pwd = pwd;
	}
	//�̸� setter
	public void setName(String name) {
		this.name = name;
	}
	//�̸��� setter
	public void setEmail(String email) {
		this.email = email;
	}
}
