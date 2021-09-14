package kr.co.ezen.first;

public class A_MethodPrinter { //범위
	
	public void methodA() { //메서드(기능), 메서드는 호출돼야 일을 한다
		System.out.println("methodA()...호출됨");
		methodB(); //메서드 호출
	}
	
	public void methodB() {
		System.out.println("methodB()...호출됨");
	}

	public void methodC() {
		System.out.println("methodC()...호출됨");
	}
	
}
