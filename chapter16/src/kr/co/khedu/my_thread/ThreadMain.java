package kr.co.khedu.my_thread;

import java.awt.Toolkit;

public class ThreadMain {

	public static Toolkit tk = Toolkit.getDefaultToolkit();
	
	public static void main(String[] args) throws InterruptedException {
		//1.Runnable
		Runnable r1 = new ThreadA();
		Thread t1 = new Thread(r1);
		
		//2.Thread
		Thread t2 = new ThreadB();
		
		//3.임시객체 Runnable
		Runnable r3 = new Runnable() {
			@Override
			public void run() {
				for(int i = 0;i<5;i++) {
					System.out.println("beep");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Thread t3 = new Thread(r3);
		
		//4.임시객체 Thread
		Thread t4 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0;i<5;i++) {
					System.out.println("beep");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		//5. Runnable 람다식
		Runnable r5 = ()-> {
				for(int i = 0;i<5;i++) {
					System.out.println("beep");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
		};
		Thread t5 = new Thread(r5);
		
		//-----------------------
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		for(int i = 0;i<5;i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
		
		long sum = 0;
		for(int i = 0;i<1000;i++)
		{
			for(int j = 0;j<1000;j++) {
				for(int k = 0;k<1000;k++)
				{
					sum+= i+j+k;
				}
			}
		}
		System.out.println(sum);
	}

}
