package kr.co.khedu.thread;

import java.awt.Toolkit;

public class ThreadMain2 {
	public static Toolkit toolkit=Toolkit.getDefaultToolkit();
	
	public static void main(String[] args) throws InterruptedException {
		//1. 부자관계
		Runnable r = new BeepTask();
		Thread thread = new Thread(r);
		
		//2. 부자관계 extend Thread
		Thread thread2  = new BeepTask2();
		
		//3.임시객체(Runnable 구현)
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				for(int i = 1;i<6;i++)
				{
					System.out.println("beep");
					toolkit.beep();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
				}				
			}
		};
		Thread thread3 = new Thread(r2);
		
		//4. 임시객체(Thread 임시객체)
		Thread thread4 = new Thread() {
			 public void run() {
				 for(int i = 1;i<6;i++)
					{
						System.out.println("beep");
						toolkit.beep();
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {}
					} 
			 }
		};
		
		//5. 임시객체를 람다식으로
		Runnable r5 = ()-> {
				for(int i = 1;i<6;i++)
				{
					System.out.println("beep");
					toolkit.beep();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
				}				
		};
		Thread thread5 = new Thread(r5);

		//1. 1~5 출력하는 프로그램 작성
		//스레드를 이용해라
		thread2.start();
		for(int i =1;i<6;i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		
		
		
		
		
		
		
		
//		BeepTask2 bt = new BeepTask2();
//		Toolkit toolkit = Toolkit.getDefaultToolkit();
//		//2. 소리를 나게한다. 1초마다 소리가 나도록 한다 5번
//		for(int i = 1;i<6;i++) {
//			toolkit.beep();
//			System.out.println("beep");
//			Thread.sleep(1000);
//		}
		
	}
}
