
public class ThreadImplements implements Runnable {

	private String resourse;

	public ThreadImplements(String resourse) {
		this.resourse = resourse;
	}

	@Override
	public void run() {
		// ���⼭ �����ϴ� ������ �����忡�� ����ȴ�.

		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 0.5��
			System.out.println(this.resourse);
		}
	}

}
