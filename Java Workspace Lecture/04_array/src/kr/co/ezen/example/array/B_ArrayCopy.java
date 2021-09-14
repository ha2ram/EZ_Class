package kr.co.ezen.example.array;

import java.util.Arrays;

public class B_ArrayCopy {

	// 얕은 복사: 배열의 주소만 복사
	// 깊은 복사: 동일한 새로운 배열을 하나 생성하여 실제 내부 값 복사
	
	public void method1() {
		
		int[] originArr= {1,2,3,4,5};
		int[] copyArr=originArr; // 얕은 복사
		
		String str="";
		
		//for(int i=0;i<originArr.length;i++) {
		//	if(i<originArr.length-1) {
		//		System.out.print(originArr[i]+",");
		//	}else
		//		System.out.print(originArr[i]);
		//}
		
		for(int i=0;i<originArr.length;i++) {
			
			if(i != originArr.length-1) {
				str+=originArr[i]+",";
			}else
				str+=originArr[i];
		}
		System.out.println("originArr: "+str);
		
		str="";
		
		for(int i=0;i<copyArr.length;i++) {
			
			if(i != copyArr.length-1) {
				str+=copyArr[i]+",";
			}else
				str+=copyArr[i];
		}
		System.out.println("copyArr: "+str);
		
		originArr[0]=99;
		
		str="";
		
		for(int i=0;i<originArr.length;i++) {
			
			if(i != originArr.length-1) {
				str+=originArr[i]+",";
			}else
				str+=originArr[i];
		}
		System.out.println("originArr: "+str);
		
		str="";
		
		for(int i=0;i<copyArr.length;i++) {
			
			if(i != copyArr.length-1) {
				str+=copyArr[i]+",";
			}else
				str+=copyArr[i];
		}
		System.out.println("copyArr: "+str);
		
		System.out.println("originArr의 hashcode: "+originArr);
		System.out.println("copyArr의 hashcode: "+copyArr);
	}
	
	public void method2() {
		
		int[] originArr= {1,2,3,4,5};
		int[] copyArr=new int[5];
		
		for(int i=0;i<originArr.length;i++) {
			copyArr[i]=originArr[i]; // 깊은 복사
		}
		String str="";
		
		for(int i=0;i<originArr.length;i++) {
			
			if(i != originArr.length-1) {
				str+=originArr[i]+",";
			}else
				str+=originArr[i];
		}
		System.out.println("originArr: "+str);
		
		str="";
		
		for(int i=0;i<copyArr.length;i++) {
			
			if(i != copyArr.length-1) {
				str+=copyArr[i]+",";
			}else
				str+=copyArr[i];
		}
		System.out.println("copyArr: "+str);
		
		originArr[0]=99;
		
		str="";
		
		for(int i=0;i<originArr.length;i++) {
			
			if(i != originArr.length-1) {
				str+=originArr[i]+",";
			}else
				str+=originArr[i];
		}
		System.out.println("originArr: "+str);
		
		str="";
		
		for(int i=0;i<copyArr.length;i++) {
			
			if(i != copyArr.length-1) {
				str+=copyArr[i]+",";
			}else
				str+=copyArr[i];
		}
		System.out.println("copyArr: "+str);
		
		System.out.println("originArr의 hashcode: "+originArr);
		System.out.println("copyArr의 hashcode: "+copyArr);
	}
	
	public void method3() {
		
		int[] originArr= {1,2,3,4,5};
		int[] copyArr=new int[10];
		
		System.arraycopy(originArr,0,copyArr,0,originArr.length); // 복사할 배열, 위치, 붙여넣을  배열, 위치, 길이
		
		String str="";
		
		for(int i=0;i<originArr.length;i++) {
			
			if(i != originArr.length-1) {
				str+=originArr[i]+",";
			}else
				str+=originArr[i];
		}
		System.out.println("originArr: "+str);
		
		str="";
		
		for(int i=0;i<copyArr.length;i++) {
			
			if(i != copyArr.length-1) {
				str+=copyArr[i]+",";
			}else
				str+=copyArr[i];
		}
		System.out.println("copyArr: "+str);
		
		System.out.println("originArr의 hashcode: "+originArr);
		System.out.println("copyArr의 hashcode: "+copyArr);
	}
	
	public void method4() {
		
		int[] originArr= {1,2,3,4,5};
		int[] copyArr=new int[10];
		
		String str="";
		
		for(int i=0;i<copyArr.length;i++) {
			
			if(i != copyArr.length-1) {
				str+=copyArr[i]+",";
			}else
				str+=copyArr[i];
		}
		System.out.println("처음 copyArr: "+str);
		
		copyArr=Arrays.copyOf(originArr, originArr.length); // 복사할 배열, 배열 길이
		//copyArr=Arrays.copyOf(originArr, 3);
		
		str="";
		
		for(int i=0;i<copyArr.length;i++) {
			
			if(i != copyArr.length-1) {
				str+=copyArr[i]+",";
			}else
				str+=copyArr[i];
		}
		System.out.println("copyArr: "+str);
	}
	
	public void method0() { // method4와 비교
		
		int[] originArr= {1,2,3,4,5};
		int[] copyArr=new int[10];
		
		copyArr=Arrays.copyOf(originArr, originArr.length);
		
		System.out.println("copyArr: "+Arrays.toString(copyArr));
	}
	
	public void method5() {
		
		int[] originArr= {1,2,3,4,5};
		int[] copyArr=new int[10];
		
		System.out.println("originArr 배열 주소: "+originArr.hashCode());
		System.out.println("준비된 복사본 배열의 주소: "+copyArr.hashCode());
		copyArr=originArr.clone();
		System.out.println("복사된 배열의 주소: "+copyArr.hashCode());
		
		String str="";
		
		for(int i=0;i<originArr.length;i++) {
			
			if(i != originArr.length-1) {
				str+=originArr[i]+",";
			}else
				str+=originArr[i];
		}
		System.out.println("originArr: "+str);
		
		str="";
		
		for(int i=0;i<copyArr.length;i++) {
			
			if(i != copyArr.length-1) {
				str+=copyArr[i]+",";
			}else
				str+=copyArr[i];
		}
		System.out.println("copyArr: "+str);
	}
}
