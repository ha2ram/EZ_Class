package kr.co.ezen.practice1;

import java.util.Scanner;

public class VariablePractice3 {
	
	public void inputScannerPractice3() {
		double num1;
		double num2;
		
		Scanner vp3=new Scanner(System.in);
		
		System.out.println("가로: ");
		num1=vp3.nextDouble();
		
		System.out.println("세로: ");
		num2=vp3.nextDouble();
				
		System.out.println("면적: "+(num1*num2));
		
		System.out.println("둘레: "+((num1+num2)*2));
		
	}
	
}
