package com.company.domain;

import java.sql.Timestamp;

public class MemberVO {

	// 회원 정보
	private int idx; // 회원번호
	private String email; // 이메일
	private String pwd;	// 비밀번호
	private String name; // 이름
	private String phone;// 전화번호
	private Timestamp reg_date; // 가입일자
	private Timestamp rev_date; // 정보 수정일자

	// 결제 관련
	private String membership_type; // 멤버십명
	private Timestamp membership_reg_date; // 멤버십 등록일자
	private Timestamp membership_end_date; // 멤버십 종료일자
	private String membership_pay; // 멤버십 금액 
	
	// getter
	public int getIdx() {return idx;}
	public String getEmail() {return email;}
	public String getPwd() {return pwd;}
	public String getName() {return name;}
	public String getPhone() {return phone;}
	public Timestamp getReg_date() {return reg_date;}
	public Timestamp getRev_date() {return rev_date;}
	public String getMembership_type() {return membership_type;}
	public Timestamp getMembership_reg_date() {return membership_reg_date;}
	public Timestamp getMembership_end_date() {return membership_end_date;}
	public String getMembership_pay() {return membership_pay;}

	// setter
	public void setIdx(int idx) {this.idx = idx;}
	public void setEmail(String email) {this.email = email;}
	public void setPwd(String pwd) {this.pwd = pwd;}
	public void setName(String name) {this.name = name;}
	public void setPhone(String phone) {this.phone = phone;}
	public void setReg_date(Timestamp reg_date) {this.reg_date = reg_date;}
	public void setRev_date(Timestamp rev_date) {this.reg_date = rev_date;}
	public void setMembership_type(String membership_type) {this.membership_type = membership_type;}
	public void setMembership_reg_date(Timestamp membership_reg_date) {this.membership_reg_date = membership_reg_date;}
	public void setMembership_end_date(Timestamp membership_end_date) {this.membership_end_date = membership_end_date;}
	public void setMembership_pay(String membership_pay) {this.membership_pay = membership_pay;}
	
	// toString
	@Override
	public String toString() {
		return "MemberVO [idx=" + idx + ", email=" + email + ", pwd=" + pwd + ", name=" + name + ", phone=" + phone
				+ ", reg_date=" + reg_date + ", rev_date=" + rev_date + ", storedFileName="
				+ ", originalFileName=" + ", membership_type=" + membership_type
				+ ", membership_reg_date=" + membership_reg_date + ", membership_end_date=" + membership_end_date
				+ ", membership_pay=" + membership_pay + "]";
	}
	
}