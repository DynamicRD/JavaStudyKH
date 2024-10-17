package kr.co.khedu.join;

public class JoinMain {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		Thread thread = new SumThread(mainThread);
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("sumThread 끝났어요");
		System.out.println("합계 : "+thread.getName());
	}

}
