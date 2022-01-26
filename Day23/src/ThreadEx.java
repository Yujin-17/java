
public class ThreadEx {

	public static void main(String[] args) throws InterruptedException {

		ThreadExtends te1 = new ThreadExtends("*");
		ThreadExtends te2 = new ThreadExtends("o");
		
//		//Single Thread: ���������� ���� 
//		te1.run();
//		te2.run();
//		
//		//Multi Thread : ���ÿ� ����
//		te1.start();
//		te2.start();
		
		// ������ ����� (2) : Runnable �������̽��� �����ؼ� ����Ѵ�.
		ThreadImplements ti1 = new ThreadImplements("��");
		ThreadImplements ti2 = new ThreadImplements("��");
		
		// Single Thread
//		ti1.run();
//		ti2.run();
		Thread t1 = new Thread(ti1);
		Thread t2 = new Thread(ti2);
		
		//Multi Thread
		t1.start();
		t1.join(); // t1 �����尡 ���� ������(���ξ�����) ��ٸ���. 
		t2.start();
		t2.join(); // t2 �����尡 ���� ������ (���ξ����尡) ��ٸ���.
		
		System.out.println("���� �Ϸ�");
	}

}
