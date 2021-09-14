package chap10.WraperClass_01;

public class BoxingUnboxing_04 {

	public static void main(String[] args) {
		Integer iValue = new Integer(10); // boxing
		Double dValue = new Double(3.14);

		System.out.println(iValue); // 10
		System.out.println(dValue); // 3.14
		// 주소값이 아닌 실제 값을 보여준다.

		iValue = new Integer(iValue.intValue() + 10); // unboxing
		dValue = new Double(dValue.doubleValue() + 1.2);

		System.out.println(iValue); // 20
		System.out.println(dValue); // 4.34
	}

}
