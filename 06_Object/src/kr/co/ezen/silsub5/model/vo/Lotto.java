package kr.co.ezen.silsub5.model.vo;

import java.util.Random;

public class Lotto {

	private int[] lotto = new int[6];

	{
		for (int i = 0; i < lotto.length; i++) {
			// lotto[i] = (int) (Math.random() * 45) + 1;
			lotto[i] = new Random().nextInt(45) + 1; // 0~44

			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < i; j++) {
				if (lotto[i] < lotto[j]) {
					int temp;
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
	}

	public Lotto() {

	}

	public int[] getLotto() {
		return lotto;
	}

	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}

	public void information() {

		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
	}
}
