package chap06.Inheritance_01;

class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "x:" + x + ",y:" + y;
	}
}

class Point3D extends Point {
	int z;

	Point3D(int x, int y, int z) {
		super(x, y);
		// this.x = x;
		// this.y = y;
		this.z = z;
	}

	String getLocation() { // method overriding: 재정의
		return "x:" + x + ",y:" + y + ",z:" + z;
	}
}

public class PointTest_03 {

	public static void main(String[] args) {
		Point3D p3 = new Point3D(1, 2, 3);
		String po = p3.getLocation();
		System.out.println(po);
	}

}
