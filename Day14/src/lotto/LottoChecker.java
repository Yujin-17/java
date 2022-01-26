package lotto;

import java.util.Random;

public class LottoChecker {
	/*
	 * 1부터 45까지의 6개 수를 랜덤으로 당첨번호를 만든다. 로또를 입력 받아서 해당 클래스를 통해 당첨여부를 확인한다.
	 * 
	 * 6개: 1등, 5개: 2등, 4개: 3등, 3개: 4등, 나머지: 꽝
	 */
	private int[] winningNumbers = new int[6];

	// 객체 생성시 당첨번호를 랜덤으로 생성한다.
	public LottoChecker() {
		Random rand = new Random();

		for (int i = 0; i < this.winningNumbers.length; i++) {
			int randNum = rand.nextInt(45) + 1; // 1~45까지의 수 랜덤 뽑기

			// 중복확인
			boolean isDuplication = false;
			for (int j = 0; j < this.winningNumbers.length; j++) {
				if (randNum == this.winningNumbers[j]) {
					// 중복
					isDuplication = true;
					i--;// i를 한번 더 돌리기 위해
					break;
				}
			}
			if (isDuplication == false) {
				this.winningNumbers[i] = randNum;
			}

		}
	}

	// 당첨 여부
	public String check(Lotto lotto) {
		int[] numbers = lotto.getNumbers(); // 로또 번호

		int count = 0; // 몇 개가 맞았는지
		for (int i = 0; i < this.winningNumbers.length; i++)
			for (int j = 0; j < numbers.length; j++)
				if (this.winningNumbers[i] == numbers[j]) {

					count++;
					break;
				}

		if (count == 6) {
			return "1등";
		} else if (count == 5) {
			return "2등";
		} else if (count == 4) {
			return "3등";
		} else if (count == 5) {
			return "4등";
		}
		return "꽝";
	}
}
