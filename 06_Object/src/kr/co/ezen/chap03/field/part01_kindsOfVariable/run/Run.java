package kr.co.ezen.chap03.field.part01_kindsOfVariable.run;

import kr.co.ezen.chap03.field.part01_kindsOfVariable.model.vo.Book;
import kr.co.ezen.chap03.field.part01_kindsOfVariable.model.vo.FieldTest1;

public class Run {

	public static void main(String[] args) {
		Book bk1 = new Book();
		bk1.setTitle("Java Standard");
		bk1.setAuthor("홍길동");
		bk1.setPrice(30000);
		Book.setStock(Book.getStock() + 1);
		System.out.println(bk1.information());

		Book bk2 = new Book();
		bk2.setTitle("Java Standard2");
		bk2.setAuthor("이순신");
		bk2.setPrice(35000);
		Book.setStock(Book.getStock() + 20);
		System.out.println(bk2.information());

		Book.setStock(15);
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		
		FieldTest1 f1 = new FieldTest1();
		f1.testMode(10);
	}

}
