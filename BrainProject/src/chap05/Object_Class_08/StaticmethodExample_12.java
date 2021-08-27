package chap05.Object_Class_08;

class Accumulator2 {
	int total = 0;
	static int grandTotal = 0; // static

	void accumulate(int amount) { // 객체 생성 필요
		total += amount;
		grandTotal += amount;
	}

	public static int getGrandTotal() { // static

		return grandTotal;
	}
}

public class StaticmethodExample_12 {

	public static void main(String[] args) {
		Accumulator2 obj1 = new Accumulator2();
		Accumulator2 obj2 = new Accumulator2();

		obj1.accumulate(10);
		obj2.accumulate(20);
		int grandTotal = Accumulator2.getGrandTotal();
		System.out.println("obj1.total=" + obj1.total);
		System.out.println("obj1.tota2=" + obj2.total);
		System.out.println("총계=" + grandTotal);
	}

}
