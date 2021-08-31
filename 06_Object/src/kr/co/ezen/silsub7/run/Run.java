package kr.co.ezen.silsub7.run;

import java.util.Scanner;

import kr.co.ezen.silsub7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {

		Employee emp1 = null;
		Employee emp2 = null;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {
			System.out.print("사원명: ");
			String name = sc.nextLine();

			System.out.print("부서명: ");
			String dept = sc.nextLine();

			System.out.print("나이: ");
			int age = sc.nextInt();

			System.out.print("성별: ");
			char gender = sc.next().charAt(0);

			System.out.print("급여: ");
			int salary = sc.nextInt();
			sc.nextLine();

			System.out.print("전화번호: ");
			String phone = sc.nextLine();

			System.out.print("주소: ");
			String address = sc.nextLine();

			if (i == 0) {
				emp1 = new Employee(name, dept, age, gender, salary, phone, address);
			} else {
				emp2 = new Employee(name, dept, age, gender, salary, phone, address);
			}
		}
		System.out.println(emp1.information());
		System.out.println(emp2.information());
	}
}
