package kr.co.ezen.chap02.loop;

import java.util.Scanner;

public class A_For {

	// for(초기식;조건식;증감식) {
	// 		실행할 문장;
	// }
	
	public void method1() {

		// 1부터 5까지 출력
	
		for(int i=1;i<=5;i++) {
			System.out.println(i+"번째 반복문 실행");
		}
	}
	
	public void method2() {
		
		for(int i=5;i>=1;i--) {
			System.out.println(i+"번째 반복문 실행");
		}
	}
	
	public void method3() {
		
		// 1부터 10 사이의 홀수만 출력
		
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
			System.out.println(i);
			}
		}
		
		for(int i=1;i<=10;i+=2) {
			System.out.println(i);
		}
	}
	
	public void method4() {
		
		// 정수를 하나 입력받아 그 수가 1~9 사이의 수일 때만 그 수의 구구단 출력
		// 조건이 맞지 않으면 "1~9 사이의 양수를 입력해야 합니다." 출력
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1~9 사이의 양수를 하나 입력하세요.");
		int dan=sc.nextInt();
		
		if(dan>=1 && dan<=9) {
			for(int i=1;i<10;i++) {
				System.out.printf("%d * %d = %d\n",dan,i,dan*i);
			}
		}else {
			System.out.println("1~9 사이의 양수를 입력해야 합니다.");
		}
	}
	
	public void method5() {
		
		// 1부터 10사이의 임의의 난수를 정해 1부터 난수까지의 정수 합계
		// 0 <= Math.random() < 1
		
		//for(int i=1;i<=10;i++)
		//	System.out.println(Math.random());
		
		int random=(int)(Math.random()*10+1); // 1~10
		
		int sum=0;
		
		for(int i=1;i<=random;i++) {
			sum+=i;
		}
		
		System.out.printf("1부터 %d까지의 정수 합계:%d",random,sum);
	}
	
	public void method6() {
		
		//키보드로 정수 두개를 받아 작은 수부터 큰수까지의 합
		
		Scanner sc=new Scanner(System.in);
		int sum=0;
		
		System.out.println("첫 번째 정수:");
		int num1=sc.nextInt();
		
		System.out.println("두 번째 정수:");
		int num2=sc.nextInt();
		
		//for(int i=num1;i<=num2;i++) {
		//	sum+=i;			
		//}
		
		//System.out.println("sum="+sum);
		
		// a와 b의 값을 서로 바꾸려면 c가 필요
		// c=a
		// a=b
		// b=c
		
		int max=0;
		int min=0;
		
		if(num1 > num2) {
			max=num1;
			min=num2;
		}else {
			max=num2;
			min=num1;
		}
		
		for(int i=min;i<=max;i++) {
			sum+=i;
		}
		
		System.out.printf("%d에서 %d까지의 합:%d",min,max,sum);
		
		sc.close();
	}
	
	public void method7() {
		
		for(int dan=2;dan<=9;dan++) {
			for(int i=1;i<10;i++) {
				System.out.printf("%d * %d = %d\n",dan,i,dan*i);
			}
			System.out.println();
		}
	}
	
	public void method8() {
		
		for(int hour=0;hour<24;hour++) {
			for(int min=0;min<60;min++) {
				System.out.printf("%2d시%2d분\n",hour,min);
			}
		}
	}
	
	public void method9() {
		Scanner sc=new Scanner(System.in);
		System.out.print("출력할 줄 수:");
		int row=sc.nextInt();
		
		for(int r=1;r<=row;r++) {
			for(int c=1;c<=5;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void method10() {
		/*
		 1*****
		 *2****
		 **3***
		 ***4**
		 ****5*
		 *****6
		 */
		Scanner sc=new Scanner(System.in);
		System.out.print("줄 수:"); // 6
		int row=sc.nextInt();
		System.out.print("칸 수:"); // 6
		int col=sc.nextInt();
		
		for(int r=1;r<=row;r++) {
			for(int c=1;c<=col;c++) {
				if(r==c) {
					System.out.print(r);
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
