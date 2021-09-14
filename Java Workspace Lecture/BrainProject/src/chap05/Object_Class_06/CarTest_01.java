package chap05.Object_Class_06;

class Car {
	String color;
	String gearType;
	int door;

	// 생성자도 메서드이므로 다른 생성자를 호출할 수 있다.
	Car() {
		// this.color = "white";
		// this.gearType = "auto";
		// this.door = 4;
		this("white", "auto", 4); // this: 생성자 호출
	}

	Car(String color) {
		// this.color = color;
		// this.gearType = "auto";
		// this.door = 4;
		this(color, "auto", 4);
	}

	Car(String color, String gearType, int door) {
		this.color = color; // this: 클래스
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest_01 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("blue");

		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
	}
}
