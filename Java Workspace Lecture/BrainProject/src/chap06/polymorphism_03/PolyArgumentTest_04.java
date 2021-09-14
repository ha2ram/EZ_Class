package chap06.polymorphism_03;

class Product {
	int price;
	int bonusPoint;

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;

	Product[] item = new Product[10];

	int i = 0;

	public void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p + "을/를 구입하셨습니다.");
	}

	public void summary() { // 구매한 물품에 대한 정보
		int sum = 0;
		String itemList = " ";
		// 반복문을 이용해서 구입한 물품의 총 가격과 목록 작성
		for (int i = 0; i < item.length; i++) {
			if (item[i] == null)
				sum += item[i].price;
			itemList += item[i] + ",";
		}

		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구매하신 제품은 " + itemList + "입니다.");
	}
	/*
	 * public void buy(Computer p) { if (money < p.price) {
	 * System.out.println("잔액이 부족하여 물건을 살 수 없습니다."); return; } money -= p.price;
	 * bonusPoint += p.bonusPoint; System.out.println(p + "을/를 구입하셨습니다."); }
	 */
}

public class PolyArgumentTest_04 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio audio = new Audio();

		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();

		// System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		// System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다.");
	}

}
