package chap06.polymorphism_03;

class TV2 {
	public void onTV() {
		System.out.println("영상 출력 중");
	}
}

interface Computer2 {

	public void dataReceive(); // interface에 있는 메서드는 무조건 추상 메서드이다. abstract 생략
}

class ComputerImpl {

	public void dataReceive() {
		System.out.println("영상 데이터 수신 중");
	}
}

//자바는 다중 상속을 지원하지 않는다.
class IPTV extends TV2 implements Computer2 { // implements - interface
	ComputerImpl comp = new ComputerImpl();
	
	public void dataReceive() { // overriding
		comp.dataReceive();
	}
	
	public void powerOn() {
		dataReceive();
		onTV();
	}
}

public class MultiIheriAlternative_07 {

	public static void main(String[] args) {
		IPTV iptv = new IPTV();
		iptv.powerOn();

		TV2 tv = iptv;
		Computer2 comp = iptv;
	}

}
