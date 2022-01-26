package lotto;

import java.util.Random;

public class Lotto {

	/*
	 * 메소드1: 수동(manual) 1부터 45까지의 숫자를 수동으로 6개를 입력 받는다.(중복 불가) 메소드2: 자동(auto) 1부터
	 * 45까지의 숫자를 중복 없이 자동으로 입력 받는다.
	 */
	// field

	private int[] numbers = new int[6];

	// 수동: 직접 마킹한 번호를 입력받는다
	public void manual(int n1, int n2, int n3, int n4, int n5, int n6) {
		this.numbers[0] = n1;
		this.numbers[1] = n2;
		this.numbers[2] = n3;
		this.numbers[3] = n4;
		this.numbers[4] = n5;
		this.numbers[5] = n6;
	}

	/*
	 * Random rand = new Random(); int randNum = rand.nextInt(45) + 1; // 1부터 45까지의
	 * 수를 랜덤으로 뽑는다.
	 */
	// 자동: 알아서 랜덤으로 6개의 번호를 세팅한다.
	public void auto() {
		Random rand = new Random();

		for (int i = 0; i < this.numbers.length; i++) {
			int randNum = rand.nextInt(45) + 1; // 1~45까지의 수 랜덤 뽑기

			// 중복확인
			boolean isDuplication = false;
			for (int j = 0; j < this.numbers.length; j++) {
				if (randNum == this.numbers[j]) {
					// 중복
					isDuplication = true;
					i--;// i를 한번 더 돌리기 위해
					break;
				}
			}
			if (isDuplication == false) {
				this.numbers[i] = randNum;
			}

		}
	}

	public int[] getNumbers() {
		return this.numbers;
	}

}
