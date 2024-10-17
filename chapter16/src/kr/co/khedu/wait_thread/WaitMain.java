package kr.co.khedu.wait_thread;

public class WaitMain {

	public static void main(String[] args) {
		BreadObject bo = new BreadObject();
		
		BreadConsumerThread bct = new BreadConsumerThread(bo);
		BreadProductThread bpt = new BreadProductThread(bo);
		
		bct.start();
		bpt.start();
		System.out.println("The end");
	}

}
