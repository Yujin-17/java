package lotto;

public class LottoTest {

	public static void main(String[] args) {
		// LottoChecker ��ü ���� �� ��÷��ȣ�� �����ȴ�.
		LottoChecker lottoChecker = new LottoChecker();

		Lotto lotto1 = new Lotto();

		// ����
		lotto1.manual(1, 10, 21, 23, 29, 44);
		String lottoResult1 = lottoChecker.check(lotto1);
		// ���
		System.out.println(lottoResult1);

		Lotto lotto2 = new Lotto();
		// �ڵ�
		lotto2.auto();
		String lottoResult2 = lottoChecker.check(lotto2);
		// ���
		System.out.println(lottoResult2);
	}

}
