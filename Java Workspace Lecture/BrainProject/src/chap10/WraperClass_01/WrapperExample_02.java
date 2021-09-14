package chap10.WraperClass_01;

public class WrapperExample_02 {

	public static void main(String[] args) {
		int total = 0;

		for (int cnt = 0; cnt < args.length; cnt++) {
			Integer obj = new Integer(args[cnt]); // 문자열 값을 정수 타입에 저장
			total += obj.intValue();
		}
		
		System.out.println(total);
	}
}

// Run As - Run Configurations - Arguments (100 200 300)
// 문자열 처리 가능
// 단, 숫자로 구성되어 있을 경우
// a200(x)