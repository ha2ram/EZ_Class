package kr.co.ezen.practice.array;

import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		
		int arr[]=new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice2() {
		
		int arr[]=new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr.length-i;
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice3() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("양의 정수: ");
		int num=sc.nextInt();
		
		int arr[]=new int[num];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
	
	public void practice4() {
		
		String arr[]=new String[5];
		arr[0]="사과";
		arr[1]="귤";
		arr[2]="포도";
		arr[3]="복숭아";
		arr[4]="참외";
		
		System.out.println(arr[1]);
	}
	
	public void practice5() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("문자열: ");
		String str=sc.nextLine();
		
		
		System.out.print("문자: ");
		char ch=sc.next().charAt(0);
		
		char[] chArr=new char[str.length()];
		//char[] chArr=str.toCharArray();
		int count=0;
		
		System.out.print(str+"에 "+ch+"가 존재하는 위치(인덱스): ");
		
		for(int i=0;i<str.length();i++) {
			chArr[i]=str.charAt(i);
			if(ch==chArr[i]) {
				count++;
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		System.out.print(ch+"개수: "+count);
		
		sc.close();
	}
	
	public void practice6() {
		
		String[] strArr= {"월","화","수","목","금","토","일"};
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("0 ~ 6 사이 숫자 입력: ");
		int num=sc.nextInt();
		
		if(num>=0 && num<=6) {
			System.out.println(strArr[num]+"요일");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice7() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수: ");
		int num=sc.nextInt();
		
		int arr[]=new int[num];
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값: ");
			int num2=sc.nextInt();
			arr[i]=num2;
		}
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("총합: "+sum);
		
		sc.close();
	}
	
	public void practice8() {
		
		Scanner sc=new Scanner(System.in);
		
		int[] arr;
		
		while(true) {
			System.out.print("정수: ");
			int num=sc.nextInt();
			
			if(num>=3 && num%2!=0) {
				arr=new int[num];
				
				int div=num/2;
				
				for(int i=0;i<=div;i++) {
					arr[i]=i+1;
				}
				for(int i=div+1;i<arr.length;i++) {
					arr[i]=num-i;
				}
				break;
			}else {
				System.out.println("다시 입력하세요.");
				continue;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) {
				System.out.print(arr[i]);
			}else {
				System.out.print(arr[i]+",");
			}
		}
		sc.close();
	}
	
	public void practice9() {
		
		String[] arr= {"후라이드","양념","간장"};
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("치킨 이름을 입력하세요: ");
		String chicken=sc.nextLine();
		
		boolean check=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(chicken)) {
				check=true;
				break;
			}
		}
		if(check) {
			System.out.println(chicken+"치킨 배달 가능");
		}else {
			System.out.println(chicken+"치킨은 없는 메뉴입니다.");
		}
		
		sc.close();
	}
}
