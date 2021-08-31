package kr.co.ezen.chap04_constructor.mode.vo;

public class ThisConstructor {
	private String bookName;
	private int bookprice;
	private String bookpublisher;
	private int bookid;

	{
		bookid = 10;
		bookpublisher = "ezen";

	}

	public ThisConstructor() {
		System.out.println("기본 생성자입니다.");
	}

	// overloading(오버로딩): 같은 이름으로 매개변수의 타입, 개수, 위치가 다르면 다른 메서드로 인식
	public ThisConstructor(String bookName, int bookprice) {

	}

	public ThisConstructor(int bookprice, String bookName) {

	}

	public ThisConstructor(String bookpublisher) {
		this.bookpublisher = bookpublisher;
		System.out.println("매개 변수 하나");
	}

	public ThisConstructor(String bookName, int bookprice, int bookid) {
		this("ezen house");
		this.bookName = bookName;
		this.bookprice = bookprice;
		this.bookid = bookid;
		// this("ezen house"); // 다른 생성자를 호출할 때는 처음에 해야 한다.
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookprice() {
		return bookprice;
	}

	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}

	public String getBookpublisher() {
		return bookpublisher;
	}

	public void setBookpublisher(String bookpublisher) {
		this.bookpublisher = bookpublisher;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
}
