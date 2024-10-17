package kr.co.khedu.thread_state;

public class ThreadStateMain {

	public static void main(String[] args) {
		Thread t = new TargetThread();
		
		Thread thread = new TraceState((TargetThread)t);
		thread.start();
	}

}
