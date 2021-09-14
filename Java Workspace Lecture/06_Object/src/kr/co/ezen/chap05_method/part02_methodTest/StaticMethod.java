package kr.co.ezen.chap05_method.part02_methodTest;

public class StaticMethod {

	public static void staticMethod1() {
		int num1 = 10;
		int num2 = 20;

		System.out.println("10과 20의 합은" + (num1 + num2) + "입니다.");
	}

	public static int staticMethod2() {
		int num1 = 10;
		int num2 = 30;

		return num1 + num2;
	}

	public static void staticMethod3(String name) {
		System.out.println(name + "님의 방문을 환영합니다.");
	}

	public static String staticMethod4(String name) {
		return name + "님의 방문을 환영합니다.";
	}

}
