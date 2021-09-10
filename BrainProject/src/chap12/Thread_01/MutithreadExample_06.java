package chap12.Thread_01;

import java.awt.Frame;

class SoloFrame extends Frame {

	public SoloFrame() {
		SoloThread t = new SoloThread(this);
		t.start();
	}
}

class SoloThread extends Thread { // 스레드를 작동하는 부분

	private Frame f = null;

	public SoloThread(Frame f) {
		this.f = f;
	}

	public void run() {
		int i = 0;
		System.out.println("스레드 시작");
		while (i < 20) {
			System.out.print(i + "\t");
			f.setTitle("스레드 동작중" + i++);
			try {
				this.sleep(300);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("스레드 종료!");
	}
}

public class MutithreadExample_06 {

	public static void main(String[] args) {
		SoloFrame s = new SoloFrame(); // SoloThread가 아닌 SoloFrame을 객체 생성
		s.setSize(300, 100);
		s.setVisible(true);
	}
}
