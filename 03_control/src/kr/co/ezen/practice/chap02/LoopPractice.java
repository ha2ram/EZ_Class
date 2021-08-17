package kr.co.ezen.practice.chap02;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요: ");
		int num=sc.nextInt();
		
		if(num>=1) {
			for(int i=1;i<=num;i++) {
				System.out.print(i+" ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		sc.close();
	}
	
	public void practice2() {

		Scanner sc=new Scanner(System.in);
		
		while(true) {
		
			System.out.print("1 이상의 숫자를 입력하세요: ");
			int num=sc.nextInt();
			
			if(num>=1) {
				for(int i=1;i<=num;i++) {
					System.out.print(i+" ");
				}
				break;
			}else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
		sc.close();
	}
	
	public void practice3() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요: ");
		int num=sc.nextInt();
		
		if(num>=1) {
			for(int i=num;i>=1;i--) {
				System.out.print(i+" ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		sc.close();
	}
	
	public void practice4() {
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
		
			System.out.print("1 이상의 숫자를 입력하세요: ");
			int num=sc.nextInt();
			
			if(num>=1) {
				for(int i=num;i>=1;i--) {
					System.out.print(i+" ");
				}
				break;
			}else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
	}
	
	public void practice5() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요: ");
		int num=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=num;i++) {
			sum+=i;
			if(i!=num) {
				System.out.print(i+"+");
			}else {
				System.out.print(i+"="+sum);
			}	
		}
		sc.close();
	}
	
	public void practice6() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("첫 번째 숫자: ");
		int num1=sc.nextInt();
		System.out.print("두 번째 숫자: ");
		int num2=sc.nextInt();
		
		if(num1>=1 && num2>=1) {
			int max=0;
			int min=0;
			
			if(num1>num2) {
				max=num1;
				min=num2;
			}else {
				max=num2;
				min=num1;
			}
			
			for(int i=min;i<=max;i++) {
				System.out.print(i+" ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		sc.close();
		
		//Scanner sc=new Scanner(System.in);
		//
		//System.out.print("첫 번째 숫자: ");
		//int num1=sc.nextInt();
		//System.out.print("두 번째 숫자: ");
		//int num2=sc.nextInt();
		
		//if(num1>=1 && num2>=1) {
		//	if(num1<num2) {
		//		for(int i=num1;i<=num2;i++) {
		//			System.out.print(i+" ");
		//		}
		//	}else
		//		for(int i=num2;i<=num1;i++) {
		//			System.out.print(i+" ");
		//		}
		//}else {
		//	System.out.println("1 이상의 숫자를 입력해주세요.");
		//}
	}
	
	public void practice7() {
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			
			System.out.print("첫 번째 숫자: ");
			int num1=sc.nextInt();
			System.out.print("두 번째 숫자: ");
			int num2=sc.nextInt();
			
			if(num1>=1 && num2>=1) {
				int max=0;
				int min=0;
				
				if(num1>num2) {
					max=num1;
					min=num2;
				}else {
					max=num2;
					min=num1;
				}
				
				for(int i=min;i<=max;i++) {
					System.out.print(i+" ");
				}
				break;
			}else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
		sc.close();
	}
	
	public void practice8() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("숫자: ");
		int num=sc.nextInt();
		
		System.out.printf("=====%d단=====\n",num);
		
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n",num,i,num*i);
		}
		sc.close();
	}
	
	public void practice9() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("숫자: ");
		int num=sc.nextInt();
		
		if(num<=9) {
			for(int dan=num;dan<=9;dan++) {
				System.out.printf("=====%d단=====\n",dan);
				
				for(int i=1;i<=9;i++) {
					System.out.printf("%d * %d = %d\n",dan,i,dan*i);
				}
				System.out.println();
			}
		}else {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}
		sc.close();
	}
	
	public void practice10() {
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자: ");
			int num=sc.nextInt();
			
			if(num<=9) {
				for(int dan=num;dan<=9;dan++) {
					System.out.printf("=====%d단=====\n",dan);
					
					for(int i=1;i<=9;i++) {
						System.out.printf("%d * %d = %d\n",dan,i,dan*i);
					}
					System.out.println();
				}
				break;
			}else {
				System.out.println("9 이하의 숫자만 입력해주세요.");
			}
		}
		sc.close();
	}
	
	public void practice11() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("시작숫자: ");
		int start=sc.nextInt();
		
		System.out.print("공차: ");
		int num=sc.nextInt();
		
		int count=0;
		for(int i=start;;i+=num) {
			System.out.print(i+" ");
			count++;
			if(count==10) {
				break;
			}
		}
		sc.close();
	}
	
	public void practice12() {
		
		Scanner sc=new Scanner(System.in);
						
		while(true){
			System.out.print("연산자(+, -, *, /, %) : ");
			String op=sc.next();
			
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.print("정수1 : ");
			int num1=sc.nextInt();
			System.out.print("정수2 : ");
			int num2=sc.nextInt();
			
			//if(op.equals("/") && num2==0){
			//	System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			//	continue;
			//}
			
			switch(op) {
			case "+":
				System.out.printf("%d %s %d = %d\n", num1,op,num2,num1+num2);
				break;
			case "-":
				System.out.printf("%d %s %d = %d\n", num1,op,num2,num1-num2);
				break;
			case "*":
				System.out.printf("%d %s %d = %d\n", num1,op,num2,num1*num2);
				break;
			case "/":
				if(num2!=0) {
					System.out.printf("%d %s %d = %d\n", num1,op,num2,num1/num2);
				}else
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				break;
			case "%":
				System.out.printf("%d %s %d = %d\n", num1,op,num2,num1%num2);
				break;
			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				continue;				
			}
		}
		sc.close();
	}
	
	public void practice13() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("정수 입력: ");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
	
	public void practice14() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num=sc.nextInt();
		
		for(int i=num;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
