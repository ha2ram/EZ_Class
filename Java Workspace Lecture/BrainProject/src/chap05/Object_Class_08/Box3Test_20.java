package chap05.Object_Class_08;

class Box3 {
	int width;
	int height;
	int depth;
	long idNum;
	static long boxID = 0;

	public void increment() {
		idNum = ++boxID;
	}
}

public class Box3Test_20 {

	public static void main(String[] args) {
		Box3 mybox1 = new Box3();
		Box3 mybox2 = new Box3();
		Box3 mybox3 = new Box3();
		Box3 mybox4 = new Box3();

		mybox1.increment();
		mybox2.increment();
		mybox3.increment();
		mybox4.increment();

		System.out.println("mybox1의 id번호:" + mybox1.idNum); // 1
		System.out.println("mybox2의 id번호:" + mybox2.idNum); // 2
		System.out.println("mybox3의 id번호:" + mybox3.idNum); // 3
		System.out.println("mybox4의 id번호:" + mybox4.idNum); // 4
		System.out.println("전체 박스의 개수는 " + Box3.boxID + "입니다."); // 4
	}

}
