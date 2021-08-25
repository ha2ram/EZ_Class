package chap05.Object_Class_02;

class Avg {
	String name;
	int avg;

	public String average(int kor, int eng) {
		// int avg; // 지역 변수
		avg = (kor + eng) / 2;
		
		return name + avg;
	}
}

public class AvgTest {

	public static void main(String[] args) {
		Avg student1 = new Avg();
		Avg student2 = new Avg();
		student1.name = "김철수";
		student2.name = "김영희";
		String st1_avg = student1.average(70, 80);
		String st2_avg = student2.average(80, 90);

		System.out.println(st1_avg); // 김철수 75
		System.out.println(st2_avg); // 김영희 85
	}

}
