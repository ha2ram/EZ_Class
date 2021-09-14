package kr.co.ezen.chap05_method.part02_methodTest;

public class NonStaticMethod {

	public void method1() { // 매개변수 x, 반환 x
		System.out.println("매개 변수와 반환값이 둘다 없는 없는 메서드입니다.");
	}

	public String method2() { // 매개변수 x, 반환 o
		return "매개 변수가 없지만 반환값이 있는 메서드입니다.";
	}

	public void method3(int num1, int num2) { // 매개변수 o, 반환 x
		int minus = num1 - num2;
		System.out.println("minus=" + minus);
	}

	public int method4(int num1, int num2) { // 매개변수 o, 반환 o
		return num1 + num2;
	}

}
