package kr.co.ezen.example.array;

import java.util.Arrays;

public class C_ArraySort {
	
	public static void testSwapLogic() {
	
		int num1=10;
		int num2=20;
		int temp=0;
		
		temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("num1:"+num1); // 20
		System.out.println("num2:"+num2); // 10
		
		int[] arr= {2,1,3};
		int temp2=0;
		
		temp2=arr[0];
		arr[0]=arr[1];
		arr[1]=temp2; // 1,2,3		
		
		// 2,1,3
		// 2,3,1
		
		for(int i=0;i<arr.length-1;i++) {
			temp2=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp2;

			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[j]);
			}
			System.out.println();
		}
	}
	
	public static void testArraySort1() {
		
		int[] array= {2,4,6,1,3,5};
		// 선택 정렬(select sort)
		int min;
		int temp;
		
		for(int i=0;i<array.length-1;i++) {
			min=i;
			for(int j=i+1;j<array.length;j++) {
				System.out.printf("현재 인덱스 위치: %d, %d\n",i,j);
				
				if(array[min]>array[j]) {
					min=j;
				}
			}
			System.out.println("---교환 시작합니다---");
			temp=array[i];
			array[i]=array[min];
			array[min]=temp;
		}
		System.out.println("정렬 후: ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	public static void testArraySort2() {
		
		int[] array= {2,4,6,1,3,5};
		// 버블 정렬(bubble sort)
		int temp=0;
		
		for(int i=array.length-1;i>-1;i--) {
			for(int j=0;j<i;j++) {
				if(array[j]>array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
				
				for(int k=0;k<array.length;k++) {
					if(k<array.length-1) {
						System.out.print(array[k]+",");
					}else {
						System.out.println(array[k]);
					}
				}
			}
		}
		System.out.println("정렬 후 확인:");
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
}
