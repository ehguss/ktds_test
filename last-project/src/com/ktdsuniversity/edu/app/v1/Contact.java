package com.ktdsuniversity.edu.app.v1;

import java.util.ArrayList;
import java.util.List;

public class Contact {

	/**
	 * 연락처 이름
	 */
	private String name;
	
	/**
	 * 연락처 별명
	 */
	private String nickName;
	
	/**
	 * 연락처 이메일
	 */
	private String email;
	
	/**
	 * 이름 - 도현
	 */
	private String firstName;
	
	/**
	 * 성 - 김
	 */
	private String lastName;
	
	/**
	 * 전화번호 목록
	 */
	private List<Phone> phones;
	
	/**
	 * 근무중인 회사 정보
	 */
	private Company company;
	
	/**
	 * 메모
	 */
	private String memo;
	
	//생성자
	public Contact() {
		// 연락처는 비어있는 arrayList
		this.phones = new ArrayList<>();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Phone> getPhones() {
		return this.phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	
}
