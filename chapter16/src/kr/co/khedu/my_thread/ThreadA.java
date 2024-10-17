package kr.co.khedu.my_thread;

import java.awt.Toolkit;

public class ThreadA implements Runnable {
	public static Toolkit tk = Toolkit.getDefaultToolkit();
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

}
