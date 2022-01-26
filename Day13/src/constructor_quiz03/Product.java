package constructor_quiz03;

public class Product {

	// field
	private String name;
	private int price;
	private String expriraton;
	
	
	
	// method
	
	// ������(constructor)
	public Product(String name, int price, String expiration) {
		this.name = name;
		this.price = price;
		this.expriraton = expiration;
	}
	
	// getters
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public String getExpiration() {
		return this.expriraton;
}

	// ��ǰ n���� ����
	public int calculatePrice(int count) {
		return this.price * count;
	}
	
	// �Ǹ� ���� ����
	public String availableSale() {
		// ���� ��¥ <= ������� : �Ǹ� ���� ��ǰ
		// ���� ��¥ > ������� : �Ǹ� �Ұ� ��ǰ 
		// "2022-11-06" "2021-12-22"
		
		// compareTo
		// ���� ���ڿ��� ũ�� 1
		// ���� ���ڿ��� ������ 0
		// ���� ���ڿ��� ������ -1 
		if(this.expriraton.compareTo("2021-11-06") >= 0) {
			return " �Ǹ� ����  ��ǰ";
			
		}
		
		
		return "�Ǹ� �Ұ� ��ǰ";
		
		
//		String[] expirationDate = this.expriraton.split("-");
//		int year = Integer.parseInt(expirationDate)[0];
//		int month = Integer.valueOf(expirationDate)[1];
//		int day = Integer.valueOf(expirationDate)[2];
//		
//		
//		if(year > 2021) {
//			return "�ǸŰ��ɻ�ǰ";
//		}else if(year == 2021) {
//			if(month > 11) {// ���� ������
//				return "�Ǹ� ���� ��ǰ";
//			} else if(month == 11) {
//				if(day > 6) {
//					return "�Ǹ� ���� ��ǰ";
//				}
//			}
//		}
			
	
	}
}

