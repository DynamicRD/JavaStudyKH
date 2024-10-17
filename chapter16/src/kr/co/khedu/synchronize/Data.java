package kr.co.khedu.synchronize;

//공유할클래스
public class Data {
	private int memory;

	public Data() {
	}

	public int getMemory() {
		return memory;
	}

	//동기화 처리 임계영역(함수전체설정)
	public  void setMemory(int memory) {
		int sum = 0;
		for(int i = 1;i<10;i++) {
			sum+=1;
		}
		
		
		synchronized(this) {
		this.memory = memory;
		//2초간 정지

		try {
			
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+ ":"+ this.memory);
			//memory가지고 2초동안 계산처리를함
			//context switching 발생이됨
		} catch (InterruptedException e) {		}
		//연산결과값을 출력한다.
		}
	
	}

	@Override
	public String toString() {
		return "Data [memory=" + memory + "]";
	}
}
