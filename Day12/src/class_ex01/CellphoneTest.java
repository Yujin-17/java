package class_ex01;

public class CellphoneTest {

	public static void main(String[] args) {

		//의식의 흐름 
		
		Cellphone  cellphone1 = new Cellphone();
		
		cellphone1.maker = "samsung";
		cellphone1.model = "galaxy";
		cellphone1.color = "pink";
		cellphone1.price = 100;
		
		System.out.println(cellphone1.maker);
		System.out.println(cellphone1.model);
		System.out.println(cellphone1.color);
		System.out.println(cellphone1.price);
		
		
		cellphone1.call();
		cellphone1.camera();
		
		
		// 100개 생산
		Cellphone[] cellphones = new Cellphone[100];
		
		for(int i = 0; i < cellphones.length;i++) {
			cellphones[i] = new Cellphone();
		}
		
		for(int i = 0; i < cellphones.length; i++ ) {
			System.out.println(cellphones[i].maker);
			System.out.println(cellphones[i].model);
		}
		
		cellphone1.maker = "apple";
		System.out.println(cellphone1.maker);
	}

}

//new가 되는 순간 객체가 생성 > 실제 사용 가능. 
