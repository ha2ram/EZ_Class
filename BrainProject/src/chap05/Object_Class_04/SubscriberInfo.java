package chap05.Object_Class_04;

public class SubscriberInfo {
	String name, id, password;
	String phoneNo, address;

	SubscriberInfo(String name, String id, String password) {
		this.name = name; // this는 클래스
		this.id = id;
		this.password = password;
	}
	
	SubscriberInfo(String name, String id, String password, String phoneNo, String address) {
		this.name = name; // this는 클래스
		this.id = id;
		this.password = password;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	
	void changePassword(String password) {
		this.password = password;
	}
	
	void setPhoneNo(String phoneNo) { // set은 저장, get은 가져오기
		this.phoneNo = phoneNo;
	}
	
	void setAddress(String address) {
		this.address = address;
	}
}