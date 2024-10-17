package kr.co.khedu.join;

public class SumThread extends Thread{
	private int sum;
	private Thread mainThread;
	
	public SumThread(Thread mainThread)
	{
		this.sum = 0;
		this.mainThread = mainThread;
	}
	
	public int getSum() {
		return sum;
	}

	@Override
	public void run() {
		//1부터 10000까지 합계를 구하고 종료하는 스레드
		for(int i = 1;i<=1000;i++)
		{
			sum+=1;
		}
		try {
			mainThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
