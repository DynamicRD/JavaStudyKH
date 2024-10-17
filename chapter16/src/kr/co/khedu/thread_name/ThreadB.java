package kr.co.khedu.thread_name;

import java.awt.Toolkit;

public class ThreadB implements Runnable {
	public static Toolkit tk = Toolkit.getDefaultToolkit();
	
	@Override
	public void run() {
		for(int i = 0;i<5;i++) {
			System.out.println("beep");
			tk.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
