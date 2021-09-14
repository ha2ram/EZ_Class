package kr.co.ezen.chap01.encapsulation.mode.vo;

public class Account {
	String name = "홍길동";
	// String accNo = "110-1121-13123";
	// String pwd = "1234";
	// int backCode = 20;
	int balance = 0;
	int money;

	public Account() {

	}

	public void deposit(int money) { // 입금
		if (money > 0) {
			balance += money;
			System.out.println(name + "님의 계좌에 " + money + "원이 입급되었습니다.");
		} else {
			System.out.println("잘못된 금액이 입금되었습니다.");
		}
	}

	public void withdraw(int money) { // 출금
		if (money < balance) {
			balance -= money;
			System.out.println(name + "님의 계좌에서 " + money + "원이 출금되었습니다.");
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}

	public void displayBalance() { // 잔액 조회
		System.out.println(name + "님의 계좌 잔액은 " + balance + "원 입니다.");
	}

}
