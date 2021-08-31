package kr.co.ezen.chap04_constructor.mode.vo;

import java.util.Date;

public class User {
	private String userId;
	private String userPwd;
	private String userName;
	private Date enrollDate;

	public User() {

	}

	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}

	/*
	public User(String id, String pwd, String name, Date date) {
		userId = id;
		userPwd = pwd;
		userName = name;
		enrollDate = date;
	} // 변수 이름이 다를 때는 this를 안 써도 된다.
	*/
	
	public User(String id, String pwd, String name, Date date) {
		// userId = id;
		// userPwd = pwd;
		// userName = name;
		
		// enrollDate = date; // 순서대로 값을 받아야 하기 때문에 마지막에 와야 한다.
		this(id,pwd,name);
		enrollDate = date;
	}

}
