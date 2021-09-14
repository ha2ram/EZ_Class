package chap05.Object_Class_04;

public class ConstrExample2 {

	public static void main(String[] args) {
		SubscriberInfo obj1, obj2;
		obj1 = new SubscriberInfo("연흥부", "poorman", "zebi");
		obj2 = new SubscriberInfo("연놀부", "richman", "money", "02-0000-0000", "타워팰리스");
		
		/*
		System.out.println("이름: " + obj1.name);
		System.out.println("아이디: " + obj1.id);
		System.out.println("패스워드: " + obj1.password);
		System.out.println("전화번호: " + obj1.phoneNo);
		System.out.println("주소: " + obj1.address);
		System.out.println();

		System.out.println("이름: " + obj2.name);
		System.out.println("아이디: " + obj2.id);
		System.out.println("패스워드: " + obj2.password);
		System.out.println("전화번호: " + obj2.phoneNo);
		System.out.println("주소: " + obj2.address);
		System.out.println();
		*/
		printSubscriberInfo(obj1);
		printSubscriberInfo(obj2);
	}
	
	public static void printSubscriberInfo(SubscriberInfo obj) {
		System.out.println("이름: " + obj.name);
		System.out.println("아이디: " + obj.id);
		System.out.println("패스워드: " + obj.password);
		System.out.println("전화번호: " + obj.phoneNo);
		System.out.println("주소: " + obj.address);
		System.out.println();
	}

}
