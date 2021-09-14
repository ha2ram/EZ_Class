package chap05.Object_Class_06;

class Circle {
	double radius; // 필드
	// private double radius; // 필드에 private이 붙으면 무조건 외부(속해있는 class의 외부) 접근 금지

	Circle(double radius) {
		this.radius = radius;
	}

	double getArea() {
		double area; // 지역 변수
		area = radius * radius * 3.14;

		return area; // return: 값을 반환, 메서드 종료
	}
}

public class FieldExample_02 {

	public static void main(String[] args) {
		Circle obj = new Circle(0.0); // 객체를 만들면서 생성자를 초기화
		obj.radius = 5.0; // 변수(ojb)를 통해서 접근
		double area = obj.getArea();

		System.out.println("obj.radius:" + obj.radius);
		System.out.println("area:" + area);
	}
}
