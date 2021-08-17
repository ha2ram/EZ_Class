package kr.co.ezen.practice1;

import java.util.Scanner;

public class VariablePractice4 {
	
	public void inputScannerPractice4() {
		
		String fr;
		char fr1,fr2,fr3;
		
		Scanner vp4=new Scanner(System.in);
		
		System.out.println("문자열을입력하세요: ");
		fr=vp4.nextLine();
		
		fr1=fr.charAt(0);
		fr2=fr.charAt(1);
		fr3=fr.charAt(2);
		
		System.out.println("첫번째문자: "+fr1);
		System.out.println("두번째문자: "+fr2);
		System.out.println("세번째문자: "+fr3);
		
		vp4.close();
		
	}

}
