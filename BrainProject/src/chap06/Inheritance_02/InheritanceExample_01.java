package chap06.Inheritance_02;

// 추상 클래스는 인스턴스의 생성(객체 생성) 불가능
abstract class Account { // final class Account: 상속 불가
	String accountNo;
	String ownerName;
	int balance;

	Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	void deposit(int amount) { // final void deposit(int amount): overriding 금지
		balance += amount;
	}

	int withdraw(int amount) throws Exception {
		if (balance < amount)
			throw new Exception("잔액이 부족합니다.");
		balance -= amount;
		return amount;
	}
}

public class InheritanceExample_01 {

	// Account obj=new Account("111-222-3333", "임꺽정", 0);
	// System.out.println(obj.balance); // 추상 클래스(abstract class)는 인스턴스의 생성(객체생성)이 불가능
}
