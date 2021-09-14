package kr.co.ezen.practice1;

import java.util.Scanner;

public class VariablePractice2 {
	
	public void inputScannerPractice2() {
		int num1;
		int num2;
		
		Scanner vp2=new Scanner(System.in);
		
		System.out.println("첫번째정수: ");
		num1=vp2.nextInt();
		
		System.out.println("두번째정수: ");
		num2=vp2.nextInt();
				
		System.out.println("더하기결과: "+(num1+num2));
		
		System.out.println("빼기결과: "+(num1-num2));
		
		System.out.println("곱하기결과: "+(num1*num2));
		
		System.out.println("나누기결과: "+(num1/num2));
	}

}
