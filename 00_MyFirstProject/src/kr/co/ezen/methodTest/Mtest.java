package kr.co.ezen.methodTest;

public class Mtest {

	public void methodA() {
		System.out.println("나 메서드 A야!!!");
		methodB();
	}
		
	public void methodB() {
		System.out.println("나 메서드 B야!!!");
		methodC();
	}
	public void methodC() {
		System.out.println("나 메서드 C야!!!");
	}
}
