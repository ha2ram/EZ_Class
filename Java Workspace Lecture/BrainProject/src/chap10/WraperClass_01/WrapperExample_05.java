package chap10.WraperClass_01;

public class WrapperExample_05 {

	public static void main(String[] args) {
		Integer obj = new Integer("10");
		int sum = obj + 20; // auto unboxing
		System.out.println(sum);
	}

}
