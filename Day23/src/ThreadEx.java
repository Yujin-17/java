
public class ThreadEx {

	public static void main(String[] args) throws InterruptedException {

		ThreadExtends te1 = new ThreadExtends("*");
		ThreadExtends te2 = new ThreadExtends("o");
		
//		//Single Thread: 순차적으로 수행 
//		te1.run();
//		te2.run();
//		
//		//Multi Thread : 동시에 수행
//		te1.start();
//		te2.start();
		
		// 쓰레드 만들기 (2) : Runnable 인터페이스를 구현해서 사용한다.
		ThreadImplements ti1 = new ThreadImplements("◆");
		ThreadImplements ti2 = new ThreadImplements("◇");
		
		// Single Thread
//		ti1.run();
//		ti2.run();
		Thread t1 = new Thread(ti1);
		Thread t2 = new Thread(ti2);
		
		//Multi Thread
		t1.start();
		t1.join(); // t1 쓰레드가 끝날 때까지(메인쓰레드) 기다린다. 
		t2.start();
		t2.join(); // t2 쓰레드가 끝날 때까지 (메인쓰레드가) 기다린다.
		
		System.out.println("수행 완료");
	}

}
