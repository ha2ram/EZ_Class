package kr.co.ezen.practice1;

import java.util.Scanner;

public class VariablePractice1 {
	
	public void inputScannerPractice1() {
		String name;
		char gender;
		int age;
		double height;
		
		Scanner vp=new Scanner(System.in);
		
		System.out.println("이름을 입력하세요:");
		name=vp.nextLine();
		
		System.out.println("나이를 입력하세요:");
		age=vp.nextInt();
		vp.nextLine();
		
		System.out.println("성별을 입력하세요(남/여):");
		gender=vp.nextLine().charAt(0);
		
		System.out.println("키를 입력하세요:");
		height=vp.nextDouble();
		
		System.out.println("키"+height+"cm인"+age+"살"+gender+"자"+name+"님반갑습니다^^");
		
		vp.close();
	}

}
