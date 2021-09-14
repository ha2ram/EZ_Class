package chap08.basicClass_01;

public class StringExample_02 {

	public static void main(String[] args) {
		String str1 = "자바";
		String str2 = "자바";

		// String str1 = new String("Java");
		// String str2 = new String("Java");

		if (str1 == str2) // str1.equals(str2) 비교해보기
			System.out.println("같음");
		else
			System.out.println("다름");
	}

}
