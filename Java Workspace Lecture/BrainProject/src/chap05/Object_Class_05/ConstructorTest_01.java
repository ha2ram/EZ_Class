package chap05.Object_Class_05;

class Data1 {
	int value;

	Data1() {

	}
}

class Data2 {
	int value;
	
	/*
	Data2(){
		
	}
	*/
	
	Data2(int x) {
		value = x;
	}
}

public class ConstructorTest_01 {

	public static void main(String[] args) {
		Data1 d1 = new Data1();
		// Data2 d2 = new Data2();
		Data2 d2 = new Data2(10);
		System.out.println("d2.value=" + d2.value);
	}

}
