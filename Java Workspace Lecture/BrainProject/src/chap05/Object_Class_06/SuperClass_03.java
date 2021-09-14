package chap05.Object_Class_06;

public class SuperClass_03 {
	final String name = "gemini"; // final: 값이 고정
	// String name = "gemini";
	int age = 10;

	public void pringInfo() {
		System.out.println(name + ":" + age);
	}

	public void changeValue() {
		// name = "johnharu";
		age = 20;
	}

	public static void main(String[] args) {
		SuperClass_03 sc3 = new SuperClass_03();
		sc3.pringInfo();
		sc3.changeValue();
		sc3.pringInfo();
		// sc3.name = "gemini2";
	}
}
