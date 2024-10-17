package kr.co.khedu.stop_flag;

public class StopFlagThread extends Thread {
	private boolean stopFlag;

	public StopFlagThread() {
		stopFlag = false;
	}

	public boolean isStopFlag() {
		return stopFlag;
	}

	public void setStopFlag(boolean stopFlag) {
		this.stopFlag = stopFlag;
	}

	@Override
	public void run() {
		try {
			while (!stopFlag) {
				System.out.println("실행중");
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("종료준비");
		}
		System.out.println("자원정리");
		System.out.println("실행종료");
	}
	
//	while (!stopFlag) {
//        System.out.println("실행중");
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {}
//    }
}
