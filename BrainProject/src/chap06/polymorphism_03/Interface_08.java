package chap06.polymorphism_03;

interface A1 {
	int w = 10;
	static int x = 20;
	final int y = 30;
	public static final int z = 40; // interface 필드의 기본, 위에는 생략한 것
}

public class Interface_08 {

	public static void main(String[] args) {
		// A1 ap = new A1(); // 객체 생성 불가
		// A1.w = 100; // 값 변경 불가
		System.out.println("w=" + A1.w); // interface 이름으로 접근은 가능
		System.out.println("x=" + A1.x);
		System.out.println("y=" + A1.y);
		System.out.println("z=" + A1.z);
	}

}
