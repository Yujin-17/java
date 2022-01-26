package constructor_quiz03;

public class Product {

	// field
	private String name;
	private int price;
	private String expriraton;
	
	
	
	// method
	
	// 생성자(constructor)
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

	// 제품 n개의 가격
	public int calculatePrice(int count) {
		return this.price * count;
	}
	
	// 판매 가능 여부
	public String availableSale() {
		// 오늘 날짜 <= 유통기한 : 판매 가능 상품
		// 오늘 날짜 > 유통기한 : 판매 불가 상품 
		// "2022-11-06" "2021-12-22"
		
		// compareTo
		// 기준 문자열이 크면 1
		// 기준 문자열과 같으면 0
		// 기준 문자열이 작으면 -1 
		if(this.expriraton.compareTo("2021-11-06") >= 0) {
			return " 판매 가능  상품";
			
		}
		
		
		return "판매 불가 상품";
		
		
//		String[] expirationDate = this.expriraton.split("-");
//		int year = Integer.parseInt(expirationDate)[0];
//		int month = Integer.valueOf(expirationDate)[1];
//		int day = Integer.valueOf(expirationDate)[2];
//		
//		
//		if(year > 2021) {
//			return "판매가능상품";
//		}else if(year == 2021) {
//			if(month > 11) {// 월이 높으면
//				return "판매 가능 상품";
//			} else if(month == 11) {
//				if(day > 6) {
//					return "판매 가능 상품";
//				}
//			}
//		}
			
	
	}
}

