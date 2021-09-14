package chap05.Object_Class_08;

class HundredNumbers {
	static int arr[];

	// 정적 초기화 블록
	static {
		arr = new int[100];
		for (int cnt = 0; cnt < 100; cnt++) {
			arr[cnt] = cnt;
		}
	}
}

public class StaticInitializerExample_14 {

	public static void main(String[] args) {
		System.out.println(HundredNumbers.arr[35]);
		System.out.println(HundredNumbers.arr[36]);
		System.out.println(HundredNumbers.arr[37]);
	}

}
