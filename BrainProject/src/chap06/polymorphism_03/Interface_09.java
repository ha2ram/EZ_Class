package chap06.polymorphism_03;

interface A2 {
	void aaa(); // public abstract void aaa();

	public abstract void bbb();
}

class B2 implements A2 {
	public void aaa() {
		System.out.println("aaa메서드");
	}

	public void bbb() {
		System.out.println("bbb메서드");
	}
}

public class Interface_09 {

	public static void main(String[] args) {
		B2 bp = new B2();
		bp.aaa();
		bp.bbb();
	}

}
