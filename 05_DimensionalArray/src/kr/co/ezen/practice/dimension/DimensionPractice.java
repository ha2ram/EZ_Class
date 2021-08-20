package kr.co.ezen.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {

	public void practice1() {

		String[][] arr = new String[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d, %d", i, j);
			}
			System.out.println();
		}
	}

	public void practice2() {

		int[][] arr = new int[4][4];

		int count = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count++;
				System.out.printf("%-2d ", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice3() {

		int[][] arr = new int[4][4];

		int count = 16;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count--;
				System.out.printf("%-2d ", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice4() {

		int[][] arr = new int[4][4];

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				arr[i][j] = (int) (Math.random() * 10 + 1);
			}
		}

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%-2d ", arr[i][j]);
			}
			arr[3][3] += arr[i][3] + arr[3][i];
			System.out.println();
		}
	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("행크기: ");
			int row = sc.nextInt();

			System.out.print("열크기: ");
			int col = sc.nextInt();

			if (row >= 1 && row <= 10 && col >= 1 && col <= 10) {
				char[][] arr=new char[row][col];
				
				for(int i=0;i<arr.length;i++) {
					for(int j=0;j<arr[i].length;j++) {
						arr[i][j]=(char)((int)(Math.random()*26+65));
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}
				break;
				
			} else {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}
		}
		sc.close();
	}
}
