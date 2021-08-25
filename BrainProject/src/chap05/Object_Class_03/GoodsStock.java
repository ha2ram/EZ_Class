package chap05.Object_Class_03;

public class GoodsStock {
	String goodsCode;
	int stockNum;

	// GoodsStock(){	// 기본 생성자, 리턴 타입이 없다, 클래스 이름과 같다, 생성자도 메서드다.
						// 기본 생성자는 다른 생성자를 만들면 만들어지지 않는다.
	// System.out.println("생성자는 객체가 만들어질 때 제일 먼저 호출.");
	// }

	public GoodsStock(String code, int num) {	// 클래스가 public이면 생성자도 public
		goodsCode = code;
		stockNum = num;
	}

	void addStock(int amount) {
		stockNum += amount;
	}

	int subtractStock(int amount) {
		if (stockNum < amount)
			return 0;
		stockNum -= amount;
		return amount;
	}

}
