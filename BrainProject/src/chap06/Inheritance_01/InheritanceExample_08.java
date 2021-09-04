package chap06.Inheritance_01;

class BonusPointAccount extends Account {
	int bonusPoint;

	BonusPointAccount(String accountNo, String ownerName, int balance, int bonusPoint) {
		super(accountNo, ownerName, balance);
		this.bonusPoint = bonusPoint;
	}

	void deposit(int amount) { // 메서드 오버라이딩
		// balance += amount;
		balance += amount;
		bonusPoint += (int) (amount * 0.001);
	}
}

public class InheritanceExample_08 {

	public static void main(String[] args) {
		BonusPointAccount obj = new BonusPointAccount("333-33-333333", "홍길자", 0, 0);
		obj.deposit(1000000);
		System.out.println("잔액: " + obj.balance);
		System.out.println("누적 포인트: " + obj.bonusPoint);
	}
}
