package lotto;

import java.util.Random;

public class LottoChecker {
	/*
	 * 1���� 45������ 6�� ���� �������� ��÷��ȣ�� �����. �ζǸ� �Է� �޾Ƽ� �ش� Ŭ������ ���� ��÷���θ� Ȯ���Ѵ�.
	 * 
	 * 6��: 1��, 5��: 2��, 4��: 3��, 3��: 4��, ������: ��
	 */
	private int[] winningNumbers = new int[6];

	// ��ü ������ ��÷��ȣ�� �������� �����Ѵ�.
	public LottoChecker() {
		Random rand = new Random();

		for (int i = 0; i < this.winningNumbers.length; i++) {
			int randNum = rand.nextInt(45) + 1; // 1~45������ �� ���� �̱�

			// �ߺ�Ȯ��
			boolean isDuplication = false;
			for (int j = 0; j < this.winningNumbers.length; j++) {
				if (randNum == this.winningNumbers[j]) {
					// �ߺ�
					isDuplication = true;
					i--;// i�� �ѹ� �� ������ ����
					break;
				}
			}
			if (isDuplication == false) {
				this.winningNumbers[i] = randNum;
			}

		}
	}

	// ��÷ ����
	public String check(Lotto lotto) {
		int[] numbers = lotto.getNumbers(); // �ζ� ��ȣ

		int count = 0; // �� ���� �¾Ҵ���
		for (int i = 0; i < this.winningNumbers.length; i++)
			for (int j = 0; j < numbers.length; j++)
				if (this.winningNumbers[i] == numbers[j]) {

					count++;
					break;
				}

		if (count == 6) {
			return "1��";
		} else if (count == 5) {
			return "2��";
		} else if (count == 4) {
			return "3��";
		} else if (count == 5) {
			return "4��";
		}
		return "��";
	}
}
