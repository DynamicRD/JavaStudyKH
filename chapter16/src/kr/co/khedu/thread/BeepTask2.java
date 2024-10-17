package kr.co.khedu.thread;

import java.awt.Toolkit;

public class BeepTask2 extends Thread{
	Toolkit toolkit=Toolkit.getDefaultToolkit();
	@Override
	public void run() {
		//작업스레드가 일을하는것인데 => 메인스레드에서 작업을 진행한다.(1초마다소리)
		for(int i = 1;i<6;i++)
		{
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		super.run();
	}


}
