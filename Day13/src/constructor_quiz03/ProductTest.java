package constructor_quiz03;

public class ProductTest {

	public static void main(String[] args) {

		Product p1 = new Product("�����", 1300, "2021-02-22");
		
		System.out.println("�̸�: "+ p1.getName());
		System.out.println("����: "+ p1.getPrice());
		System.out.println("�������: "+ p1.getExpiration());
		
		
		System.out.println("��ǰ 5���� ����: " + p1.calculatePrice(5));
		System.out.println("��ǰ 13���� ����: " + p1.calculatePrice(13));
		
		System.out.println(p1.availableSale());
	}

}

