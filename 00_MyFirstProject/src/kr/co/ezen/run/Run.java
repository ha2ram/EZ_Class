package kr.co.ezen.run;

import kr.co.ezen.first.A_MethodPrinter;
import kr.co.ezen.first.B_ValuePrinter;
import kr.co.ezen.first.Hello;

public class Run {
	// 주석 : 프로그램 실행과 관련 없음
	// 자바에서는 클래스가 가진 메서드를 실행할려면
	// 클래스명 사용할 이름(참조형 자료형 변수)=new 클래스명
	public static void main(String[] args) {
		Hello hello=new Hello();
		hello.helloWorld(); // 호출

		A_MethodPrinter ap=new A_MethodPrinter();
		ap.methodA();
		ap.methodB();
		ap.methodC();
		
		B_ValuePrinter vp=new B_ValuePrinter();
		vp.printValue1();
		vp.printValue2();
		vp.printValue3();
	}

}
