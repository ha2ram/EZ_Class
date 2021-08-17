package kr.co.ezen.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수: "); // println에서 ln은 줄바꿈, ln을 지우면 옆에 입력
		int num=sc.nextInt();
		
		String str=(num>0)? "양수다":"양수가 아니다";
		System.out.println(str);
		
		sc.close();
	}
	
	public void practice2() {
		Scanner sc2=new Scanner(System.in);
		System.out.print("정수: ");
		int num=sc2.nextInt();
		
		String str=(num>0)? "양수다":(num==0? "0이다":"음수다");
		System.out.println(str);
		
		sc2.close();
	}
	
	public void practice3() {
		Scanner sc3=new Scanner(System.in);
		System.out.print("정수: ");
		int num=sc3.nextInt();
		
		String str=(num%2==0)? "짝수다":"홀수다";
		System.out.println(str);
		
		sc3.close();		
	}
		
	//public void practice4() {
		//Scanner sc4=new Scanner(System.in);
		//System.out.print("인원수: ");
		//int num1=sc4.nextInt();
		
		//System.out.print("사탕 개수: ");
		//int num2=sc4.nextInt();
		
		//System.out.print("1인당 사탕 개수: "+num3);
		//int num3=num2/num1;
		
		//System.out.print("남는 사탕 개수: "+num4);
		//int num4=num2%num1;
		
		//sc4.close();
	
	public void practice4() {
		Scanner sc=new Scanner(System.in);
		int people;
		int candy;
		
		System.out.print("인원수: ");
		people=sc.nextInt();
		
		System.out.print("사탕 개수: ");
		candy=sc.nextInt();
		
		System.out.println("1인당 사탕 개수: "+candy/people);
		System.out.println("남는 사탕 개수: "+candy%people);
		
		sc.close();
	}
	
	//public void practice5() {
		//Scanner sc=new Scanner(System.in);
		//String name;
		//int grade;
		//int group;
		//int num;
		//char gender;
		//double score;
		
		//System.out.print("이름: ");
		//name=sc.next();
		
		//System.out.print("학년(숫자만): ");
		//grade=sc.nextInt();
		
		//System.out.print("반(숫자만): ");
		//group=sc.nextInt();
				
		//System.out.print("번호(숫자만): ");
		//num=sc.nextInt();
		
		//System.out.print("성별(M/F): ");
		//gender=sc.next();
		//String gender2=(gender=="M")? "남학생":"여학생";
		
		//System.out.println();
		
		//System.out.print("성적(소수점 아래 둘째 자리까지): ");
		//score=sc.nextDouble();
		
		//System.out.println(grade+"학년"+group+"반"+num+"번"+" "+name+" "+gender2+"의"+" "+"성적은"+" "+score+"이다");
		
		//sc.close();	
	//}
	
	public void practice5() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print(("이름: "));
		String name=sc.nextLine();
		
		System.out.print(("학년(숫자만): "));
		int grade=sc.nextInt();
		
		System.out.print(("반(숫자만): "));
		int classNum=sc.nextInt();
		
		System.out.print(("번호(숫자만): "));
		int num=sc.nextInt();
		
		System.out.print(("성별(M/F): "));
		char gender=sc.next().charAt(0);		
		
		System.out.print(("성적(소수점 아래 둘째 자리까지): "));
		double score=sc.nextDouble();
		
		String student=gender == 'M' ? "남학생":"여학생";

		System.out.println(grade+"학년"+classNum+"반"+num+"번"+" "+name+" "+student+"의"+" "+"성적은"+" "+score+"이다");
		
		sc.close();
	}
	
	public void practice6() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("나이: ");
		int age=sc.nextInt();
		
		String str=age <= 13 ? "어린이": (age <= 19 ? "청소년":"성인");
		System.out.println(str);
		
		sc.close();
	}
	
	public void practice7() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("국어: ");
		int kor=sc.nextInt();
		
		System.out.print("영어: ");
		int eng=sc.nextInt();
		
		System.out.print("수학: ");
		int math=sc.nextInt();
		
		int sum=kor+eng+math;
		double avg=sum/3.0; // 정수/정수==>정수, 정수/실수==>실수
		
		System.out.print("합계: "+sum);
		System.out.print("평균: "+avg);
		
		String result=kor>=40 && eng>=40 && math>=40 && avg>=60 ? "합격":"불합격";
		System.out.println(result);
		
		sc.close();
	}
	
	public void practice8() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(-포함) : ");
		char pId=sc.nextLine().charAt(7);
		
		String gender=pId == '1' || pId == '3' ? "남자":"여자";
		System.out.println(gender);
		
		sc.close();
	}
	
	//public void practice9() {
		//Scanner sc=new Scanner(System.in);
		
		//System.out.print("정수 1 : ");
		//int num1=sc.nextInt();
		
		//System.out.print("정수 2 : ");
		//int num2=sc.nextInt();
		
		//System.out.print("입력 : ");
		//int num3=sc.nextInt();
		
		//String result=num3 >= num1 || num3 > num2 ? "true":"false";
		//System.out.println(result);
		
		//sc.close();
	//}
	
	public void practice9() {
		Scanner sc=new Scanner(System.in);
		
		int num1;
		int num2;
		int input;
		
		System.out.print("정수 1 : ");
		num1=sc.nextInt();
		System.out.print("정수 2 : ");
		num2=sc.nextInt();
		System.out.print("입력 : ");
		input=sc.nextInt();
		
		System.out.println((input<=num1) || (input>num2));
		
		sc.close();
	}
	
	//public void practice10() {
		//Scanner sc=new Scanner(System.in);
			
		//System.out.print("입력1 : ");
		//int num1=sc.nextInt();
		
		//System.out.print("입력2 : ");
		//int num2=sc.nextInt();
		
		//System.out.print("입력3 : ");
		//int num3=sc.nextInt();
		
		//String result=num1==num2 && num1==num3? "true":"false";
		//System.out.println(result);
		
		//sc.close();
	//}
	
	public void practice10() {
		Scanner sc=new Scanner(System.in);
			
		System.out.print("입력1 : ");
		int num1=sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2=sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3=sc.nextInt();
		
		boolean isTrue=(num1==num2) && (num2==num3) ;
		System.out.println(isTrue);
		
		sc.close();
	}

}
