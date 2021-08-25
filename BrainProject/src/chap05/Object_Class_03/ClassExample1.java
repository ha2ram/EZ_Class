package chap05.Object_Class_03;

public class ClassExample1 {

	public static void main(String[] args) {
		GoodsStock obj = null;	// null: 아직 연결 대상이 없다.
		//obj = new GoodsStock();	// 객체를 만들면서 생성자 호출, 생성자는 자동으로 만들어진다. 그러나 눈에 보이지 않는다.
		obj = new GoodsStock("52135", 200);
		//obj.goodsCode = "52135"; // 초기화
		//obj.stockNum = 200;
		
		System.out.println("상품코드: " + obj.goodsCode);
		System.out.println("재고수량: " + obj.stockNum);
		
		obj.addStock(1000);
		
		System.out.println("상품코드: " + obj.goodsCode);
		System.out.println("재고수량: " + obj.stockNum);
	}

}
