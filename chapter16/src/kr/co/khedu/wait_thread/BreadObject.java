package kr.co.khedu.wait_thread;

public class BreadObject {
	private String bread;

	public BreadObject() {
		bread = null;
	}
	
	//빵을 만드는 함수
	public synchronized void productBread() {
		if(bread == null) {
			bread = "단팥빵";
			System.out.println("단팥빵을 만들어서 제공했음");
			return;
		}
		notify();
		try {
			wait();
		} catch (InterruptedException e) {}
	}
	
	
	
	//빵을 소비하는 함수
	public synchronized  void consumerBread() {
		if(bread != null) {
			System.out.println("단팥빵을 다 먹었습니다. 빵을 제공해주세요");
			bread = null;
			return;
		}
		notify();
		try {
			wait();
		} catch (InterruptedException e) {}
	}
}
