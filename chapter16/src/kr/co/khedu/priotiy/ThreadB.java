package kr.co.khedu.priotiy;

public class ThreadB extends Thread {

	public ThreadB(String name) {
		setName(name);
	}


	@Override
	public void run() {
		//시간 check방법
		long start = System.currentTimeMillis();//현재시간을 0.001초값
		for(int i = 0;i<Integer.MAX_VALUE;i++) {
			//약 20억번을 실행한다.
		}
		long stop = System.currentTimeMillis();
		System.out.println(getName()+"("+(stop-start)/1000.0+")");
	}
}
