package kr.co.khedu.thread_name;

import java.awt.Toolkit;

public class ThreadA extends Thread {
	public static Toolkit tk = Toolkit.getDefaultToolkit();
	
	public ThreadA(String name) {
		setName(name);
	}
	
	
	public ThreadA() {
	}


	@Override
	public void run() {
		for(int i = 0;i<5;i++) {
			System.out.println(getName()+" = beep");
			tk.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		super.run();
	}
}
