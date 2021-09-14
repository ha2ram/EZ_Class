package kr.co.ezen.chap03.branch;

public class B_continue {
	
	public void method1() {

		int sum=0;
		
		for(int k=1;k<101;k++) {
			if(k%4==0)
				continue;
			System.out.print(k+"+");
			sum+=k;
		}
		System.out.println();
		System.out.println("sum: "+sum);
	}
	
	public void method2() {
		
		for(int dan=2;dan<10;dan++) {
			System.out.println("====="+dan+"=====");
			
			for(int su=1;su<10;su++) {
				if(dan%2==0 || su%2==0) {
					continue;
				}
				System.out.println(dan+"*"+su+"="+(dan*su));
			}
		}
	}
}
