package chap05.Object_Class_08;

class AccessWay {
	static int num = 0; // static 변수는 객체가 생성되기 이전에 별도의 메모리 공간에 할당

	AccessWay() {
		incrCnt();
	}

	public void incrCnt() {
		num++; // 객체가 만들어진 수만큼 증가
	}
}

public class ClassVarAccess_09 {

	public static void main(String[] args) { // static 때문에 객체 생성을 하지 않아도 main이 실행된다.
		/*
		 * AccessWay way = new AccessWay(); // 1 System.out.println("num=" + way.num++);
		 * // 2 AccessWay way2 = new AccessWay(); // 3 System.out.println("num=" +
		 * way2.num++); // 4 AccessWay way3 = new AccessWay(); // 5
		 * System.out.println("num=" + way3.num++);
		 */

		AccessWay way = new AccessWay();
		way.num++;
		AccessWay.num++;
		System.out.println("num=" + AccessWay.num); // static 변수는 객체 생성을 하지 않아도 클래스 이름으로 접근 가능
	}

}
