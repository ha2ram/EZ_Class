package chap11.DataStructure_01;

import java.util.HashSet;
import java.util.Set;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + ":" + age;
	}
}

public class SetExample_18 {

	public static void main(String[] args) {
		Set<Object> set = new HashSet<Object>();
		set.add("abc");
		set.add("abc");
		set.add(new Person("David", 10));
		set.add(new Person("DAvid", 10));

		System.out.println(set);
	}
}
