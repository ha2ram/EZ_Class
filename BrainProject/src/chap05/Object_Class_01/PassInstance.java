package chap05.Object_Class_01;

class Number {
	int num = 0;

	public void addNum(int n) {	// 메서드(함수): 기능
								// int n(매개 변수): 외부로부터 값을 전달받는 변수
		num += n;				// 메서드는 호출을 해야 작동한다.
	}							// void: 일을 처리한 후 반환할 값이 없다
	
	public int getNumber() {	// int: 반환 값의 자료형

		return num;				// 호출한 곳으로 값이 전달된다.
	}
}

// 클래스는 설계도(Class)이다 ==> new: 실제 자동차(운전 가능): 객체(Object)

public class PassInstance {		// 메서드 2개

	public static void main(String[] args) {	// class가 여러 개 있을 때 main이 들어있는 class로 저장해야 한다.
		Number nInst = new Number();			// 다른 class를 객체화
		System.out.println("메서드 호출 전: " + nInst.getNumber());
		simpleMethod(nInst);
		System.out.println("메서드 호출 후: " + nInst.getNumber());
	}
	
	public static void simpleMethod(Number numb) {	// 매개 변수 == class 타입의 numb 변수
		numb.addNum(12);
	}
}

// 자바는 클래스 단위로 처리되는 언어이다.
// 소스 파일 ==> 컴파일 과정 ==> 실행(출발점: main)