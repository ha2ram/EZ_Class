package chap05.Object_Class_08;

public class BlockTest_15 {

	static {
		System.out.println("static{}");
	}

	public BlockTest_15() {
		System.out.println("생성자");
	}

	public static void main(String[] args) {
		System.out.println("BlockTest_15 bt = new BlockTest_15();");
		BlockTest_15 bt = new BlockTest_15();

		System.out.println("BlockTest_15 bt = new BlockTest_15();");
		BlockTest_15 bt2 = new BlockTest_15();
	}
}
