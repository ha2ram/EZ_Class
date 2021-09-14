package chap10.WraperClass_01;

public class WrapperExample_03 {

	public static void main(String[] args) {
		int total = 0;

		for (int cnt = 0; cnt < args.length; cnt++)
			total += Integer.parseInt(args[cnt]);
		System.out.println(total);
	}

}

// 문자열을 프리미티브 타입으로 바꾸는 메서드
// parse-메서드(래퍼 객체를 생성하지 않는다) static