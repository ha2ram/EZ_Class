package chap06.Inheritance_02;

abstract class MessageSender {
	String title;
	String senderName;

	MessageSender(String title, String senderName) {
		this.title = title;
		this.senderName = senderName;
	}

	abstract void sendMessage(String recipient); // 추상 메서드, 부모 클래스는 제목만 내용은 자식클래스에서
}

class EmailSender extends MessageSender {
	String senderAddr;
	String emailBody;

	EmailSender(String title, String senderName, String senderAddr, String emailBody) {
		super(title, senderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	}

	@Override
	void sendMessage(String recipient) {
		System.out.println("------------------------------");
		System.out.println("제목: " + title);
		System.out.println("보내는 사람: " + senderName + " " + senderAddr);
		System.out.println("받는 사람: " + recipient);
		System.out.println("내용: " + emailBody);
	}
}

class SMSSender extends MessageSender {
	String returnPhoneNo;
	String message;

	SMSSender(String title, String senderName, String returnPhoneNo, String message) {
		super(title, senderName);
		this.returnPhoneNo = returnPhoneNo;
		this.message = message;
	}

	@Override
	void sendMessage(String recipient) {
		System.out.println("------------------------------");
		System.out.println("제목: " + title);
		System.out.println("보내는 사람: " + senderName);
		System.out.println("받는 사람: " + recipient);
		System.out.println("회신 전화번호: " + returnPhoneNo);
		System.out.println("메시지 내용: " + message);
	}
}

// abstract 메서드가 없어도 인스턴스 생성을 원하지 않으면 클래스를 abstract로 선언할 수 있다.
// 그러나 abstract 메서드가 하나라도 있으면 그 클래스는 반드시 abstract로 선언해야한다.

public class InheritanceExample_02 {

	public static void main(String[] args) {
		EmailSender obj1 = new EmailSender("생일을 축하합니다", "고객센터", "admin@dukeeshop.co.kr", "10% 할인 쿠폰이 발행되었습니다.");
		SMSSender obj2 = new SMSSender("생일을 축하합니다", "고객센터", "02-000-0000", "10% 할인 쿠폰이 발행되었습니다.");
		
		obj1.sendMessage("hatman@yeyeye.com");
		obj1.sendMessage("stickman@hahaha.com");
		obj2.sendMessage("010-0000-0000");
	}
}
