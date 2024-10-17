package kr.co.khedu.stop_flag;

public class StopFlagMain {

	//메인스레드 영역 Run()
	public static void main(String[] args) throws InterruptedException {
		Thread t = new StopFlagThread(); //부자관계라 stopFlagThread 호출X
		t.start();
		
		Thread.sleep(3000);
		//((StopFlagThread)t).setStopFlag(true);
		t.interrupt();
		System.out.println("End");
		
	}

}
