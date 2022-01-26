package exception_ex;

public class Ex01 {

	public static void main(String[] args) {

		// ����ó��(Exception): ����ġ ���� ��Ȳ�� ���� ó���� �ϴ� �� 
		// try - catch - finally
		
		// NPE
		try {
//			String str = null;
//			System.out.println(str.isEmpty());
			
			// �迭 ���� ���� ���� 
//			int[] arr = new int[3];
//			for(int i =0; i < arr.length; i++) {
//				arr[i] = i;
//				System.out.println(arr[i]);
//			}
			
			// ĳ���� ����
			Object x = new Integer(10);
			System.out.println((String) x);
		}catch(NullPointerException npe) {
			System.out.println("NPE�� �߻��ߴ�.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ���� ���� �߻��ߴ�.");
		}catch(Exception e) {
			System.out.println("��� ���ܸ� �� ��´�. ");
		}finally {
			System.out.println("�����̵� �ƴϵ� ������ �ҷ�����.");
		}
		
		System.out.println("���� �Ϸ�");
		
		a();
		
	}
	
	public static void a() {
		try {
			b();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("���� �Ϸ�");
	}
	
	public static void b() throws Exception {
		// ���� ó�� ��� 2���� 
		// 1. try-catch�� ���μ� ó���Ѵ�.(���� ó��)
		// 2. ȸ�� (���� ó��)
		
		// ���� ����
		//1. checked Exception
		//2. unchecked Exception => ���α׷��� �ٷ� ����ȴ�. 
		//throw new RuntimeException(); // unchecked Exception�̶� ���α׷� ����
		
		throw new Exception(); // checked exception
	}

}
