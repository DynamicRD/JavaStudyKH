package kr.co.khedu.thread;

import java.awt.Toolkit;

public class ThreadMain {

	public static void main(String[] args) throws InterruptedException {
		//메인스레드 숫자를 1부터 5까지 찍자
//1번	Runnable r = new BeepTask();
//		Thread thread = new Thread(r);
//		//이 지점부터 작업스레드를 작동시키면 되는 장소(진입점)
//		thread.start();
		
//2,3번	Runnable r = ()->{
//				Toolkit toolkit=Toolkit.getDefaultToolkit();
//				for(int i = 1;i<6;i++)
//				{
//					toolkit.beep();
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//				
//			};
	
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit toolkit=Toolkit.getDefaultToolkit();
				for(int i = 1;i<6;i++)
				{
					System.out.println("1");
					toolkit.beep();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		thread.start();
		
		//메인스레드 진입점
		for(int i = 1;i<6;i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
	
		
//		Thread thread = Thread.currentThread();
//		System.out.println(thread.getName());
		
	}
}
