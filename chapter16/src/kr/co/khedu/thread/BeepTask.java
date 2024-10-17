package kr.co.khedu.thread;

import java.awt.Toolkit;

public class BeepTask implements Runnable{
	public static Toolkit toolkit=Toolkit.getDefaultToolkit();
	
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

}
