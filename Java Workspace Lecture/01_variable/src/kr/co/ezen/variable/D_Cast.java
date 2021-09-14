package kr.co.ezen.variable;

public class D_Cast {
	
	public void rule1() {
		boolean flag=true; // false
		//flag=100; X
		int num='A';
		System.out.println("num:"+num);
		
		char ch=97;
		System.out.println("ch:"+ch);
		
		int num2=-97;
		System.out.println("num:"+num2);
		
		char ch3=(char) num2; // 강제 형변환
		System.out.println("ch3:"+ch3);
	}
	
	public void rule2() {
		int inum=10;
		long lnum=100;
		
		//int isum=inum+lnum; // int+long==>long
		
		int isum=(int)(inum+lnum); // 강제 casting (long 타입을 int 타입으로)
		System.out.println("isum:"+isum);
		
		int isum2=inum+(int)lnum;
		System.out.println("isum2:"+isum2);
		
		long lsum=inum+lnum;
		System.out.println("lsum:"+lsum);
		
		byte bnum=1;
		short snum=2;
		
		//short sum=bnum+snum; // byte와 short의 결과는 무조건 int이다
				
		short sum=(short)(bnum+snum);
		System.out.println("sum:"+sum);
		
		int sum2=bnum+sum;
		System.out.println("sum2:"+sum2);	
	}
	
	public void rule3() {
		long lnum=100;
		float fnum=lnum; // 정수는 실수로 자동 형변환 된다
		System.out.println("fnum:"+fnum);
		
		double dnum=10.5;
		//int inum=dnum;
		int inum=(int)dnum;
		System.out.println("inum:"+inum);
	}

}
