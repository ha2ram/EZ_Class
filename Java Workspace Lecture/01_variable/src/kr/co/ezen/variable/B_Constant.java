package kr.co.ezen.variable;

public class B_Constant {
	// 상수 테스트
	public void finalConstant() {
		int age;
		final int AGE; // 상수 변수(일반 변수와 구분하기 위해 대문자 사용)
		
		age=20;
		AGE=20;
		
		System.out.println("age:"+age);
		System.out.println("AGE:"+AGE);
		
		age=30;
		//AGE=30;
		
		System.out.println("age:"+age);
		System.out.println("AGE:"+AGE);
		System.out.println("상수값은 한 번 저장 후 값 변경 불가능");
	}
}
