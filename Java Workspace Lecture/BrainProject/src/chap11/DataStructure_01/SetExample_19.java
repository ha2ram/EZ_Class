package chap11.DataStructure_01;

import java.util.HashSet;
import java.util.Set;

class Person2 {
	String name;
	int age;

	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + ":" + age;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Person2) {
			Person2 tmp = (Person2) obj;
			return name.contentEquals(tmp.name) && age == tmp.age;
		}
		return false;
	}

	public int hashCode() {
		return name.hashCode() + age;
	}
}

public class SetExample_19 {

	public static void main(String[] args) {
		Set<Object> set = new HashSet<Object>();
		set.add(new String("abc"));
		set.add(new String("abc")); // String은 동일 객체로 처리한다.
		set.add(new Person2("David", 10));
		set.add(new Person2("David", 10));

		System.out.println(set);
	}
}
