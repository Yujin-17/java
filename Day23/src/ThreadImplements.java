
public class ThreadImplements implements Runnable {

	private String resourse;

	public ThreadImplements(String resourse) {
		this.resourse = resourse;
	}

	@Override
	public void run() {
		// 여기서 구현하는 내용이 쓰레드에서 수행된다.

		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 0.5초
			System.out.println(this.resourse);
		}
	}

}
