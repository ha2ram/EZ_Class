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
				char[][] arr = new char[row][col];

				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						arr[i][j] = (char) ((int) (Math.random() * 26 + 65));
						System.out.print(arr[i][j] + " ");
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

	public void practice6() {

		String[][] strArr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "!", "더", "!!" } };

		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i] + " ");
			}
			System.out.println();
		}
	}

	public void practice7() {

		Scanner sc = new Scanner(System.in);

		System.out.print("행의 크기: ");
		int row = sc.nextInt();

		char[][] charArr = new char[row][];

		for (int i = 0; i < row; i++) {
			System.out.print(i + "열의 크기: ");
			charArr[i] = new char[sc.nextInt()];
		}
		char data = 'a';

		for (int i = 0; i < charArr.length; i++) {
			for (int j = 0; j < charArr[i].length; j++) {
				charArr[i][j] = data;
				System.out.print(charArr[i][j] + " ");
				data++;
			}
			System.out.println();
		}
		sc.close();
	}

	public void practice8() {
		String[] student = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];
		int count = 0;

		System.out.println("==1분단==");
		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[i].length; j++) {
				seat1[i][j] = student[count];
				count++;
				System.out.print(seat1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("==2분단==");
		for (int i = 0; i < seat2.length; i++) {
			for (int j = 0; j < seat2[i].length; j++) {
				seat2[i][j] = student[count];
				count++;
				System.out.print(seat2[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice8_2() {

		String[] student = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		String[][] Arr = new String[3][2];

		int k = 0;
		for (int l = 1; l < 3; l++) {
			System.out.println("==" + l + "분단==");
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 2; j++) {
					Arr[i][j] = student[k];
					k++;
					System.out.print(Arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

	public void practice9() {
		String[] student = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];
		int count = 0;

		System.out.println("==1분단==");
		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[i].length; j++) {
				seat1[i][j] = student[count];
				count++;
				System.out.print(seat1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("==2분단==");
		for (int i = 0; i < seat2.length; i++) {
			for (int j = 0; j < seat2[i].length; j++) {
				seat2[i][j] = student[count];
				count++;
				System.out.print(seat2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("=====================");

		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 학생 이름을 입력하세요: ");
		String name = sc.nextLine();
		String partName = "";
		String colName = "";
		String rowName = "";

		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[1].length; j++) {
				if (seat1[i][j].equals(name)) {
					partName = "1분단";
					if (i == 0) {
						rowName = "첫 번째 줄";
					} else if (i == 1) {
						rowName = "두 번째 줄";
					} else {
						rowName = "세 번째 줄";
					}
					if (j == 0) {
						colName = "왼쪽";
					} else {
						colName = "오른쪽";
					}
				}
			}
		}

		for (int i = 0; i < seat2.length; i++) {
			for (int j = 0; j < seat2[1].length; j++) {
				if (seat2[i][j].equals(name)) {
					partName = "2분단";
					if (i == 0) {
						rowName = "첫 번째 줄";
					} else if (i == 1) {
						rowName = "두 번째 줄";
					} else {
						rowName = "세 번째 줄";
					}
					if (j == 0) {
						colName = "왼쪽";
					} else {
						colName = "오른쪽";
					}
				}
			}
		}
		System.out.println("검색하신 " + name + " 학생은 " + partName + " " + rowName + " " + colName + "에 있습니다.");
		sc.close();
	}

	public void practice9_2() { // by범수

		String[] student = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];
		int count = 0;

		System.out.println("==1분단==");
		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[i].length; j++) {
				seat1[i][j] = student[count];
				count++;
				System.out.print(seat1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("==2분단==");
		for (int i = 0; i < seat2.length; i++) {
			for (int j = 0; j < seat2[i].length; j++) {
				seat2[i][j] = student[count];
				count++;
				System.out.print(seat2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("=====================");

		Scanner sc = new Scanner(System.in);

		System.out.print("검색할 학생 이름을 입력하세요: ");
		String name = sc.next();
		String lineArr1[] = { "첫", "두", "세" };
		String lineArr2[] = { "왼쪽", "오른쪽" };

		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[i].length; j++) {

				if (seat1[i][j].equals(name)) {
					System.out.printf("검색하신 %s 학생은 1분단 %s번째줄 %에 있습니다.", name, lineArr1[i], lineArr2[j]);
				}
				if (seat2[i][j].equals(name)) {
					System.out.printf("검색하신 %s 학생은 2분단 %s번째줄 %에 있습니다.", name, lineArr1[i], lineArr2[j]);
				}
			}
		}
		sc.close();
	}

	public void practice10() {

		Scanner sc = new Scanner(System.in);

		String[][] board = new String[6][6];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = " ";
			}
		}
		for (int i = 0; i < board.length - 1; i++) {
			board[0][i + 1] = i + "";
			board[i + 1][0] = i + "";
		}
		System.out.print("행 인덱스 입력: ");
		int row = sc.nextInt();

		System.out.print("열 인덱스 입력: ");
		int col = sc.nextInt();

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (i == row && j == col) {
					board[i + 1][j + 1] = "X";
				}
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

	public void practice11() {

		Scanner sc = new Scanner(System.in);

		String[][] board = new String[6][6];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = " ";
			}
		}
		for (int i = 0; i < board.length - 1; i++) {
			board[0][i + 1] = i + "";
			board[i + 1][0] = i + "";
		}
		int row = 0;
		int col = 0;

		do {
			System.out.print("행 인덱스 입력: ");
			row = sc.nextInt();

			System.out.print("열 인덱스 입력: ");
			col = sc.nextInt();

			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[i].length; j++) {
					if (i == row && j == col) {
						board[i + 1][j + 1] = "X";
					}
					System.out.print(board[i][j] + " ");
				}
				System.out.println();
			}
		} while (row != 99);
		System.out.println("프로그램 종료");
		sc.close();
	}
}
