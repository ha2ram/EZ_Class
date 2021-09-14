package chap10.WraperClass_01;

public class WrapperExample_01 {

	public static void main(String[] args) {
		Integer obj1 = new Integer(12);
		Integer obj2 = new Integer(7);

		int sum = obj1.intValue() + obj2.intValue(); // 19

		System.out.println(sum);
	}

}
