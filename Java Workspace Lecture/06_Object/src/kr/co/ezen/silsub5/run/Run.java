package kr.co.ezen.silsub5.run;

import kr.co.ezen.silsub5.model.vo.Lotto;

public class Run {

	public static void main(String[] args) {

		// Lotto lot = new Lotto();

		// lot.information();

		System.out.println("=== 이번주 당첨 예상 번호 ===");

		for (int i = 1; i <= 5; i++) {
			Lotto lot = new Lotto();

			System.out.print(i + "번째 예상: ");
			lot.information();
		}
	}
}
