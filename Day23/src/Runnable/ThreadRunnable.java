package Runnable;

public class ThreadRunnable implements Runnable{

	private String resourse;
	
	public ThreadRunnable(String resourse) {
		this.resourse = resourse;
	}
	@Override
	public void run() {

		for(int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 0.5ÃÊ
			System.out.println(this.resourse);
	}

	}
}
