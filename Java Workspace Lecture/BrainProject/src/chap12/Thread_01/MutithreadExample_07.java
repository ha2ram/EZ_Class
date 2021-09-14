package chap12.Thread_01;

class CalcThread extends Thread {
	SharedArea sharedArea; // SharedArea를 사용하겠다는 선언

	public void run() {
		double total = 0.0;
		for (int cnt = 1; cnt < 10000; cnt += 2)
			if (cnt / 2 % 2 == 0)
				total += 1.0 / cnt;
			else
				total -= 1.0 / cnt;
		sharedArea.result = total * 4;
		sharedArea.isReady = true; // 값이 들어가기 전에 출력되는 것을 방지하기 위해
	}
}

class SharedArea {
	double result;
	boolean isReady; // default: false
}

class PrintThread extends Thread {
	SharedArea sharedArea;

	public void run() {
		while (sharedArea.isReady != true) // true가 아니면 반복
			continue;
		System.out.println(sharedArea.result); // 값이 들어가기 전에 0.0이 출력
	}
}

public class MutithreadExample_07 {

	public static void main(String[] args) {
		CalcThread thread1 = new CalcThread();
		PrintThread thread2 = new PrintThread();
		SharedArea obj = new SharedArea();

		thread1.sharedArea = obj;
		thread2.sharedArea = obj;

		thread1.start();
		thread2.start();
	}
}
