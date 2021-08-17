package kr.co.ezen.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {

	public void method1() {
		
		// 선 처리 후 비교
		// 참과 거짓에 상관 없이 처음 한번은 반드시 실행
		
		// 키보드로 영어 문자열 값을 입력받아 출력 반복 실행
		
		Scanner sc=new Scanner(System.in);
		String str=null;
		
		do {
			System.out.print("문자열 입력: ");
			str=sc.next();
			System.out.println("str: "+str);
		}while(!str.equals("exit")); // equals: 문자열 비교
	}
	
	public void method2() {
		
		Scanner sc=new Scanner(System.in);
		String str=null;
		
		do {
			System.out.print("문자열 입력: ");
			str=sc.next();
			System.out.println("str: "+str);
			
			if(str.equals("exit")) {
				break;
			}
		}while(true); // 무한 반복
	}
	
	public void method3() {
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("1.테스트1");
			System.out.println("2.테스트2");
			System.out.println("3.테스트3");
			System.out.println("4.종료");
			System.out.println("메뉴 선택");
			int menuNum=sc.nextInt();
			
			switch(menuNum) {
			case 1:
				System.out.println(1);
				break;
			case 2:
				System.out.println(2);
				break;
			case 3:
				System.out.println(3);
				break;
			case 4:
				System.out.println("종료합니다");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}while(true);
	}
}
