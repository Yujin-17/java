package Inheritance_quiz02;

public class HeathRate extends HealthInfo {

	public HeathRate(String name, int height, int weight) {
		super(name, height, weight);
	}

	/*
	 * ǥ��ü��:SW=(H-100)*0.9 �񸸵�: B(%)=(W-SW)/SW * 100
	 * 
	 * �θ� Ŭ����(HeathInfo.java)�� ��ӹ޴� �񸸵� ��� Ŭ������ �����Ѵ�.(HealthRate.java) ǥ��ü�� ����ϴ�
	 * �޼ҵ带 �����Ѵ�. �� ���θ� ���ϴ� �޼ҵ带 �����Ѵ�. (�񸸵��� 10% �̸��̸� ����, 10%�̻� 20% �̸��̸� ��ü��,
	 * 20%�̻��� ��) 
	 * ��� ���� (HealthTest.java) �ڵѸ����� ���� 160, ������ 45kg => �����Դϴ�. 
	 * ȫ�浿���� ����168, ������ 90kg => ���Դϴ�.
	 */
	// ǥ�� ü�� ���
	private double standardWeight() {
		return (super.height - 100) * 0.9;
	}

	// �񸸵� ���
	private double getRate() {
		double sw = standardWeight();
		return (super.weight - sw) / sw * 100;

	}

	// �� ���� ���
	private String status() {

		double ratio = getRate();
		if (ratio < 10) {
			return "����";
		} else if (ratio < 20) {
			return "������";
		} else return "��";
		
	}
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println(status());
	}
}