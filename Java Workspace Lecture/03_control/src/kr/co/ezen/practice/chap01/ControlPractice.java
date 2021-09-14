package kr.co.ezen.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	public void practice1() {
		
		Scanner sc=new Scanner(System.in);

		System.out.print("숫자를 한개 입력하세요: ");
		int num=sc.nextInt();
		
		if(num>0) {
			if(num%2==0) {
				System.out.println("짝수다");
			}else
				System.out.println("홀수다");
		}else
			System.out.println("양수만 입력해주세요.");
		
		sc.close();
	}
	
	public void practice2() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("국어점수: ");
		int kor=sc.nextInt();
		System.out.print("영어점수: ");
		int eng=sc.nextInt();
		System.out.print("수학점수: ");
		int math=sc.nextInt();
		
		int sum=kor+eng+math;
		double avg=sum/3.0;
		
		if(kor>40 && eng>40 && math>40 && avg>=60) {
			System.out.println("국어: "+kor);
			System.out.println("영어: "+eng);
			System.out.println("수학: "+math);
			System.out.println("합계: "+sum);
			System.out.println("평균: "+avg);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
		sc.close();
	}
	
	public void practice3() {
		
		String id="myId";
		String pw="myPassword12";
		
		Scanner sc=new Scanner(System.in);
		System.out.print("아이디: ");
		String userId=sc.next();
		System.out.print("비밀번호: ");
		String userPw=sc.next();
		
		if(id.equals(userId)) {
			if(pw.equals(userPw)) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}
		
		/*
		 * if(id.equals(userId) && pw.equals(userPw)){
		 * 		system.out.println("로그인 성공");
		 * }else if(id.equals(userId)){
		 * 		system.out.println("비밀번호가 틀렸습니다.");
		 * }else if(pw.equals(userPw)){
		 * 		system.out.println("아이디가 틀렸습니다.");
		 * }
		 * 
		 */
		
		sc.close();
	}
	
	public void practice4() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("5. 종료");
		System.out.println("메뉴 번호를 입력하세요:");
		
		int menu=sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("입력메뉴입니다.");
			break;
		case 2:
			System.out.println("수정메뉴입니다.");
			break;
		case 3:
			System.out.println("조회메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제메뉴입니다.");
			break;
		case 5:
			System.out.println("프로그램이 종료됩니다.");
			break;
		default :
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
		sc.close();
	}
	
	public void practice5() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1~12 사이의 정수 입력:");
		int num=sc.nextInt();
		String season=null;
		
		switch(num) {
		case 12:
		case 1:
		case 2:
			season="겨울";
			break;
		case 3:
		case 4:
		case 5:
			season="봄";
			break;
		case 6:
		case 7:
		case 8:
			season="여름";
			break;
		case 9:
		case 10:
		case 11:
			season="가을";
			break;
		default:
			season="잘못 입력된 달";
			break;
		}
		
		System.out.println(num+"월은"+" "+season+"입니다.");
		
		sc.close();
	}
	
	public void practice6() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("권한을 확인하고자 하는 회원등급:");
		
		switch(sc.nextLine()) {
		case "관리자":
			System.out.print("회원 관리, 게시글 관리, ");
		case "회원" :
			System.out.print("게시글 작성, 댓글 작성, ");
		case "비회원" :
			System.out.print("게시글 조회");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		sc.close();
	}
	
	public void practice7() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("키(m)를 입력해주세요: ");
		double height=sc.nextDouble();
		
		System.out.println("몸무게(kg)를 입력해주세요: ");
		double weight=sc.nextDouble();
		
		double BMI=weight/height*height;
		
		System.out.println("BMI 지수: "+BMI);
		
		if(BMI<18.5) {
			System.out.println("저체중");
		}else if(BMI<23) {
			System.out.println("정상체중");
		}else if(BMI<25) {
			System.out.println("과체중");
		}else if(BMI<30) {
			System.out.println("비만");
		}else {
			System.out.println("고도비만");
		}
		sc.close();
	}
	
	public void practice8() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("피연산자1 입력: ");
		int num1=sc.nextInt();
		
		System.out.println("피연산자2 입력: ");
		int num2=sc.nextInt();
		
		System.out.println("연산자를 입력(+,-,*,/,%): ");
		char ch=sc.next().charAt(0);
		
		int result=0;
		double result1=0;
		
		if(num1>0 && num2>0) {
			switch(ch) {
			case '+':
				result=num1+num2;
				break;
			case '-':
				result=num1-num2;
				break;
			case '*':
				result=num1*num2;
				break;
			case '/':
				result1=(double)num1/num2;
				break;
			case '%':
				result=num1%num2;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				return;
			}
			
			if(ch!='/') {
				result1=(int)result;
				System.out.printf("%d %c %d=%d", num1,ch,num2,result);
			}else {
				System.out.printf("%d %c %d=%.6f", num1,ch,num2,result1);
			}
		}else {
			System.out.println("양수만을 입력해주세요. 프로그램을 종료합니다.");
			
		sc.close();
		}
	}
	
	public void practice9() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("중간 고사 점수: ");
		int midTerm=sc.nextInt();
		System.out.print("기말 고사 점수: ");
		int finalTerm=sc.nextInt();
		System.out.print("과제 점수: ");
		int homework=sc.nextInt();
		System.out.print("출석 횟수: ");
		int attendance=sc.nextInt();
		
		System.out.println("==========결과==========");
		
		double score1=midTerm*0.2;
		double score2=finalTerm*0.3;
		double score3=homework*0.3;
		double score4=attendance;
		double score5=score1+score2+score3+score4;
		
		if(attendance*5>70) {
						
			System.out.println("중간 고사 점수(20): "+score1);
			System.out.println("기말 고사 점수(30): "+score2);
			System.out.println("과제 점수(30): "+score3);
			System.out.println("출석 점수(20): "+score4);
			System.out.println("총점: "+score5);
			
			if(score5>=70) {
				System.out.println("Pass");
			}else {
				System.out.println("Fail [점수 미달]");
			}
		}else {
			System.out.printf("Fail [출석 횟수 부족(%d/20)]",attendance);
		}
		sc.close();
	}
}
