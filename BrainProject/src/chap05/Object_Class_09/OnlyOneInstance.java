package chap05.Object_Class_09;

class SimpleNumber {
	int num = 0;

	private SimpleNumber() { // private: 외부 접근 금지

	}

	public void addNum(int n) {
		num += n;
	}

	public void showNum() {
		System.out.println(num);
	}

	public static SimpleNumber getSimpleNumberInst() { // SimpleNumber 타입

		return new SimpleNumber(); // 같은 메서드라서 생성자가 private이라도 객체 생성 가능
	}

}

public class OnlyOneInstance {

	public static void main(String[] args) {
		// SimpleNumber num1 = new SimpleNumber(); // 직접적으로 객체 생성을 못한다.
		SimpleNumber num1 = SimpleNumber.getSimpleNumberInst(); // 간접적으로 객체 생성
		num1.addNum(20);
		SimpleNumber num2 = SimpleNumber.getSimpleNumberInst();
		num2.addNum(30);
		num1.showNum();
		num2.showNum();

	}

}
