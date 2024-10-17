package kr.co.khedu.thread_state;

public class TargetThread extends Thread {
	@Override
	public void run() {
		double sum = 0;
		//1초동안 일한다(Runnable state)
		for(long i = 0;i<1000000000L;i++) {
			sum+=i;
		}
		try {
			//1.5초동안 일시정지(Timed wating state)
			Thread.sleep(1500);
		} catch (InterruptedException e) {	}
		//1초동안 일한다(Runnable state)
		for(long i = 0;i<1000000000L;i++) {
			sum+=i;
		}
	}
}
