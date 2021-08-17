package kr.co.ezen.example.array;

import java.util.Scanner;

public class A_Array {
	
	public void method1() {
		
		// 배열 사용 이유, 배열의 편리함

		// 변수 여러개 사용
		int num1=10;
		int num2=20;
		int num3=30;
		int num4=40;
		int num5=50;
		
		// 반복문도 사용하지 못하고 일일이 더할 때
		int sum1=0;
		sum1+=num1;
		sum1+=num2;
		sum1+=num3;
		sum1+=num4;
		sum1+=num5;
		
		int[] arr=new int[5]; // 배열 선언 및 할당
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		System.out.println("arr.length="+arr.length);
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=10*(i+1);
		}
		
		int sum2=0;
		
		for(int i=0;i<arr.length;i++) {
			sum2+=arr[i]; // 메모리 공간 = 값
		}
		
		System.out.println("sum2: "+sum2);
	}
	
	public void method2() {
		
		int[] iArr; // 배열 변수 선언 - stack에 int형 배열의 주소를 보관할 수 있는 공간 생성

		char cArr[];

		iArr=new int[5];
		cArr=new char[10];
		
		
		int[] iArr2=new int[5];
		char cArr2[]=new char[10];
		
		// 배열의 단점: 한번 지정한 배열의 크기는 변경 불가능
		
		System.out.println("iArr: "+iArr);
		System.out.println("iArr2: "+iArr2);
		System.out.println("cArr: "+cArr);
		System.out.println("cArr2: "+cArr2);
		
		// heap 메모리는 변수를 생성하여 직접 접근을 하지 못하는 영역이기 때문에 실제 값을 저장하고 있는 공간의 주소만 가지고 접근할 수 있다.
		
		System.out.println("iArr의 hashCode: "+iArr.hashCode());
		System.out.println("cArr의 hashCode: "+cArr.hashCode());
		
		// hashcode 주소에 접근하기 위한 키 (메모리 주소 참조 값)
		
		for(int i=0;i<iArr.length;i++) {
			System.out.println(iArr[i]); // int형 배열은 값을 주지 않으면 default가 0이다.
		}
		
		for(int i=0;i<cArr.length;i++) {
				System.out.println(cArr[i]); // char형 배열은 값을 주지 않으면 default가 공백이다.
		}
		
		System.out.println("iArr의 길이: "+iArr.length);
		System.out.println("cArr의 길이: "+cArr.length);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("새로 할당한 배열의 길이를 입력하세요: ");
		int size=sc.nextInt();
		double[] dArr=new double[size]; // 프로그램이 실행되면서 메모리가 할당 = 동적 할당
		// dArr - 배열명이면서 변수
		
		System.out.println("dArr의 hashcode: "+dArr.hashCode());
		System.out.println("dArr의 길이: "+dArr.length);
		
		dArr=new double[30];
		System.out.println("dArr의 hashcode: "+dArr.hashCode());
		System.out.println("dArr의 길이: "+dArr.length);
		
		dArr=null;
		System.out.println("삭제 후 dArr의 길이: "+dArr.length);
		
		// Exception in thread "main" java.lang.NullPointerException
		// Exception: 예외 -> 에러
	}

	public void method3() {
		
		int[] iArr=new int[5];
		
		iArr[0]=1;
		iArr[1]=2;
		iArr[2]=3;
		iArr[3]=4;
		iArr[4]=5;
		
		for(int i=0;i<iArr.length;i++) {
			iArr[i]=i+1;
		}
		
		for(int i=0;i<iArr.length;i++) {
			System.out.println("iArr["+i+"]="+iArr[i]);
		}
		
		
		// 배열을 사용하는 다양한 방법
		
		int[] iArr2=new int[] {11,22,33,44,55}; // 중괄호로 값을 직접 주는 것도 가능
		System.out.println("iArr의 길이: "+iArr2.length); // 5
		
		String[] sArr= {"apple","banana","grape","orange"}; // 바로 중괄호도 가능
		
		String sArr2[]= {"apple"};
		
		String sArr3[];
		sArr3=new String[] {"apple"};
		
		
		// 배열명에는 문자열을 줄 수 없다.
		
		String sArr4[]= {"apple"};
		// sArr4="apple"; 주소값 상수값이기 때문에 문자열 불가 
		
		String sArr5[]=null;
		// sArr5="abcd"; 
	}
	
	public void method4() {
		
		// 사용자에게 5명의 키의 정보를 입력받아 배열에 담아두고 반복문을 통해 5명의 키의 평균값을 구하시오.
		
		Scanner sc=new Scanner(System.in);
		
		double[] height=new double[5];
		
		double sum=0;
		
		for(int i=0;i<height.length;i++) {
			System.out.print("키 입력: ");
			height[i]=sc.nextDouble();
			
			sum+=height[i];
		}
		double avg=sum/height.length;
		System.out.println("평균키: "+avg);
		
		sc.close();
	}
	
	public void method5() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("정수 입력: ");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		// 해당 배열에 1부터 100 사이의 랜덤 값들을 발생시켜 넣어줌.
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100+1);
		}
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
			if(arr[i] % 2 == 0) {
				sum+=arr[i];
			}
		}
		System.out.println();
		System.out.println("짝수의 총합: "+sum);
		
		sc.close();
	}
	
	public void method6() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("문자열 입력: ");
		String str=sc.nextLine();
		
		char[] arr=new char[str.length()];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=str.charAt(i);
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
