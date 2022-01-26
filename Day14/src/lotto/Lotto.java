package lotto;

import java.util.Random;

public class Lotto {

	/*
	 * �޼ҵ�1: ����(manual) 1���� 45������ ���ڸ� �������� 6���� �Է� �޴´�.(�ߺ� �Ұ�) �޼ҵ�2: �ڵ�(auto) 1����
	 * 45������ ���ڸ� �ߺ� ���� �ڵ����� �Է� �޴´�.
	 */
	// field

	private int[] numbers = new int[6];

	// ����: ���� ��ŷ�� ��ȣ�� �Է¹޴´�
	public void manual(int n1, int n2, int n3, int n4, int n5, int n6) {
		this.numbers[0] = n1;
		this.numbers[1] = n2;
		this.numbers[2] = n3;
		this.numbers[3] = n4;
		this.numbers[4] = n5;
		this.numbers[5] = n6;
	}

	/*
	 * Random rand = new Random(); int randNum = rand.nextInt(45) + 1; // 1���� 45������
	 * ���� �������� �̴´�.
	 */
	// �ڵ�: �˾Ƽ� �������� 6���� ��ȣ�� �����Ѵ�.
	public void auto() {
		Random rand = new Random();

		for (int i = 0; i < this.numbers.length; i++) {
			int randNum = rand.nextInt(45) + 1; // 1~45������ �� ���� �̱�

			// �ߺ�Ȯ��
			boolean isDuplication = false;
			for (int j = 0; j < this.numbers.length; j++) {
				if (randNum == this.numbers[j]) {
					// �ߺ�
					isDuplication = true;
					i--;// i�� �ѹ� �� ������ ����
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
