package chap12.Thread_01;

import java.awt.Frame;

class RunFrame extends Frame implements Runnable { // 윈도우창을 만들기 위해 Frame이 필요하다

	public void run() {
		int i = 0;
		System.out.println("스레드 시작!");
		while (i < 20) {
			System.out.print(i + "\t");
			this.setTitle("스레드 동작중" + i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("스레드 종료!");
	}
}

public class MultithreadExample_05 {

	public static void main(String[] args) {
		RunFrame r = new RunFrame();
		r.setSize(300, 100);
		r.setVisible(true);
		Thread t = new Thread(r);
		t.start();
	}
}
