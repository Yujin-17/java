package exception_ex;

public class Ex01 {

	public static void main(String[] args) {

		// 예외처리(Exception): 예상치 못한 상황에 대한 처리를 하는 것 
		// try - catch - finally
		
		// NPE
		try {
//			String str = null;
//			System.out.println(str.isEmpty());
			
			// 배열 범위 참조 예외 
//			int[] arr = new int[3];
//			for(int i =0; i < arr.length; i++) {
//				arr[i] = i;
//				System.out.println(arr[i]);
//			}
			
			// 캐스팅 예외
			Object x = new Integer(10);
			System.out.println((String) x);
		}catch(NullPointerException npe) {
			System.out.println("NPE가 발생했다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 참조 오류 발생했다.");
		}catch(Exception e) {
			System.out.println("모든 예외를 다 잡는다. ");
		}finally {
			System.out.println("예외이든 아니든 무조건 불러진다.");
		}
		
		System.out.println("수행 완료");
		
		a();
		
	}
	
	public static void a() {
		try {
			b();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("수행 완료");
	}
	
	public static void b() throws Exception {
		// 예외 처리 방법 2가지 
		// 1. try-catch로 감싸서 처리한다.(내가 처리)
		// 2. 회피 (남이 처리)
		
		// 예외 종류
		//1. checked Exception
		//2. unchecked Exception => 프로그램이 바로 종료된다. 
		//throw new RuntimeException(); // unchecked Exception이라 프로그램 종료
		
		throw new Exception(); // checked exception
	}

}
