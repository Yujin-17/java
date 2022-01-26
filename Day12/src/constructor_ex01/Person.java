package constructor_ex01;
// 생성자(Constructor)
public class Person {
	// 속성: 멤버 변수 또는 field
	// 은닉화(hiding)
	private String birth;
	private String gender;
	private String name;

	// 기능: method
	
	// 생성자(Constructor): 객체가 생성될 때 자동으로 불려지는 특수한 메소드 
	// 리턴타입이 존재하지 않는다. 
	public Person() {
		System.out.println("응애~");
	}
	
	// 생성자 오버로딩(Overloading) : 같은 이름을 가진 메소드 중
							//	   파라미터의 타입이 다르거나, 개수가 다르거나 
	 						//	   일치하는 메소드가 선택된다. 
	public Person(String name, String birth, String gender) {
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		System.out.println("파라미터 세개짜리 생성자 호출");
	} 
	
	// 캡슐화(encapsulation) - getter, setter
	public String getName() {
		return this.name;
	}
	
	public String getBirth() {
		return this.birth;
	}
	
	public String getGender() {
		return this.getGender();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	void greet() {
		System.out.println("안녕하세요");
	}

	void walk() {
		System.out.println("걷기");
	}

	void introduce() {
		System.out.println("내 이름은 " + name + "이고 성별은" + gender + "이다.");
	}

	void printAge() {
		int year = Integer.parseInt(birth.substring(0, 4));
		int age = 2021 - year + 1;
		System.out.println("나이는 " + age + "세 이다.");
	}
}
