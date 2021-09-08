package chap11.DataStructure_01;

public class HashCodeExample_12 {

	public static void main(String[] args) {
		String obj1 = new String("헤르미온느");
		String obj2 = new String("헤르미온느");

		Integer obj3 = new Integer(5);
		Integer obj4 = new Integer(5);

		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());

		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
	}

}
