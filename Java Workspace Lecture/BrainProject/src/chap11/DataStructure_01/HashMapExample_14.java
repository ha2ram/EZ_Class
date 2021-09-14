package chap11.DataStructure_01;

class Name2 {
	String firstName;
	String lastName;

	Name2(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
}

public class HashMapExample_14 {

	public static void main(String[] args) {
		Name2 obj1 = new Name2("헤르미온느", "그레인져");
		Name2 obj2 = new Name2("헤르미온느", "그레인져");

		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}
