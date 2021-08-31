package kr.co.ezen.silsub4.model.vo;

public class Student {

	private static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;

	{
		classroom = 5;
		name = "라이언";
		height = 180;
		gender = '남';
	}

	static {
		grade = 3;
	}

	public Student() {

	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String information() {

		return "[학년:" + grade + ",반:" + classroom + ",이름:" + name + ",키:" + height + ",성별:" + gender + "]";

	}

}
