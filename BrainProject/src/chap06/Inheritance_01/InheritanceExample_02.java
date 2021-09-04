package chap06.Inheritance_01;

class Account { // final class Account: 상속 불가
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

class CheckingAccount extends Account { // 체크카드
	String cardNo;

	CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);
		// super(); // 부모 생성자 호출
		// this.accountNo = accountNo;
		// this.ownerName = ownerName;
		// this.balance = balance;
		this.cardNo = cardNo;
	}

	int pay(String cardNo, int amount) throws Exception {
		if (!cardNo.contentEquals(this.cardNo) || (balance < amount)) {
			throw new Exception("지불이 불가능합니다.");
		}
		return withdraw(amount);
	}
}

public class InheritanceExample_02 {

	public static void main(String[] args) {
		/*
		 * CheckingAccount obj = new CheckingAccount(); obj.accountNo =
		 * "111-22-33333333"; obj.ownerName = "홍길동"; obj.cardNo = "5555-6666-7777-8888";
		 */
		CheckingAccount obj = new CheckingAccount("111-22-33333333", "홍길동", 0, "5555-6666-7777-8888");
		obj.deposit(100000);

		try {
			int paidAmount = obj.pay("5555-6666-7777-8888", 47000);
			System.out.println("지불액: " + paidAmount);
			System.out.println("잔액: " + obj.balance);
		} catch (Exception e) { // Exception e = new Exception(생성자 호출);
			String msg = e.getMessage();
			System.out.println(msg);
		}
	}
}
