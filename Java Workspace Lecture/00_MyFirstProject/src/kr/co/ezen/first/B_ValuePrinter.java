package kr.co.ezen.first;

public class B_ValuePrinter {
	
	public void printValue1() {
		// 여러가지 형태의 값을 출력해 보기
	
		// 숫자 출력
		System.out.println(123); // 정수
		System.out.println(1.23); // 실수
		
		// 문자 출력
		// char 2byte A를 저장한 다음 println()호출
		// println()은 A를 받아서 출력한다
		System.out.println('A');
		System.out.println('a');
		
		// 문자열 출력
		System.out.println("안녕하세요");
		System.out.println("반갑습니다");
		
		// 연산
		System.out.println(123+456);
		System.out.println(1.23-0.12);
		
		System.out.println('a'+1); // 아스키코드
		System.out.println("안녕하세요"+123); // 문자열 +는 연산이 아니라 연결
	}

	public void printValue2() {
		// 문자열과 숫자의 '+' 연산
		System.out.println(9+9);
		System.out.println(9+"9");
		System.out.println("9"+9);
		System.out.println("9"+"9");
		
		System.out.println(9+9+"9");
		System.out.println(9+"9"+9);
		System.out.println("9"+9+9);
		System.out.println("9"+(9+9));
	
	}

	public void printValue3() {
		System.out.println("변수 사용전");
		System.out.println(100+10);
		System.out.println((100+10)*10-10);
		
		int point=100;
		int bonus=10;
		int personCount=10;
		int fees=10;
		
		System.out.println("변수 사용 후");
		System.out.println(point+bonus);
		System.out.println((point+bonus)*personCount);
		System.out.println(((point+bonus)*personCount)-fees);
	}
	
}
