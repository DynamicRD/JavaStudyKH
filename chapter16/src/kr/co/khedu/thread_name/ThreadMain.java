package kr.co.khedu.thread_name;

public class ThreadMain {

	//main 스레드
	public static void main(String[] args) {
//		Thread mainThread = Thread.currentThread();
//		System.out.println("메인스레드의 이름"+mainThread.getName());
		
//		//방법1
//		Runnable r = new ThreadB();
//		Thread t1 = new Thread(r);
//		t1.start();
//		System.out.println("threadB이름 "+t1.getName());
		
		//방법2
		Thread t2 = new ThreadA("beep이름 스레드");
		t2.start();
		System.out.println("threadA이름 "+t2.getName());

		//스레드 10개 만들어서 돌린다
		for (int i= 0;i<10 ; i++) {
			Thread t3 = new ThreadA();
			t3.start();
		}
		
	}

}
