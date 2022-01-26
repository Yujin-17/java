package Runnable;

public class Run_ex01 {

	public static void main(String[] args) throws InterruptedException {

		ThreadRunnable t1 = new ThreadRunnable("¾îÈï");
		ThreadRunnable t2 = new ThreadRunnable("À½¸Ş~");
		ThreadRunnable t3 = new ThreadRunnable("È÷À×");
		
		Thread tr1 = new Thread(t1);
		Thread tr2 = new Thread(t2);
		Thread tr3 = new Thread(t3);
		
		tr1.start();
		tr2.start();
		tr1.join();
		tr2.join();
		tr3.start();
	}

}
