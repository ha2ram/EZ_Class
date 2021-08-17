package kr.co.ezen.example.array;

public class A_Array2 {
	
	public void method1() {

		int[] arr= {10,20,30,40,50};
		
		System.out.println(arr);
		System.out.println("arr의 개수: "+arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("==========");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void method2() {
		
		int[] arr=new int[] {10,20,30,40,50};
		arr[3]=40000;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void method3() {

		int[] arr=new int[10];
		int[] arr02=new int[10];
		
		for(int i=10,j=100;i<=100;i+=10,j-=10) {
			arr[i/10-1]=i;
			arr02[j/10-1]=j;
			System.out.printf("arr=%d arr=%d\n",arr[i/10-1],arr02[j/10-1]);
		}
	}
	
	public void method4() {
		
		int[] arr=new int[10];
		
		for(int i=0;i<arr.length;i++) {
			if(i % 2 == 0) {
				arr[i]='♡';
			}else {
				arr[i]='♥';
			}
			System.out.printf("%3c",arr[i]);
		}
	}
	
	public void method5() {
		
		String str="The String class"; // 문자열을 저장하는 class
		System.out.println("str[0]="+str.charAt(0));
		
		char[] arr_ch=str.toCharArray();
		
		for(int i=0;i<arr_ch.length;i++) {
			System.out.printf("%c %d번째\n", arr_ch[i],i);
		}
		System.out.println(arr_ch.length);
		System.out.println("===============");
		System.out.println("10번째 문자: "+arr_ch[9]);
	}
	
	public void method6() {
		
		String str="The String class";
		char[] arr_cnt=str.toCharArray();
		
		int LCNT=0;
		int UCNT=0;
		
		for(int i=0;i<arr_cnt.length;i++) {
			if(Character.isLowerCase(arr_cnt[i])) { // 소문자
				LCNT++;
			}else if(Character.isUpperCase(arr_cnt[i])) { // 대문자
				UCNT++;
			}
		}
		System.out.println("대문자의 개수는:"+UCNT+" 소문자의 개수는:"+LCNT);
	}
}
