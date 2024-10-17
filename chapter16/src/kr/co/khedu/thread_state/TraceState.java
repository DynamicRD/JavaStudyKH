package kr.co.khedu.thread_state;

//스레드 상태를 추적하는 스레드
public class TraceState extends Thread
{
	private TargetThread tt;
	
	public TraceState(TargetThread tt) {
		this.tt = tt;
	}

	@Override
	public void run() {
		while(true)
		{
			//상태점검(상대방스레드 상태를 점검
			State state = tt.getState();
			System.out.println("tt의 현재상태는="+state.toString());

			//New -> Runnable 상태변경
			if(state == Thread.State.NEW)
			{
				tt.start();
			}else if(state == Thread.State.TERMINATED) {
				System.out.println("상태를 점검할 스레드가 종료되었습니다.");
				break;
			}
			
			//시간지연
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		}//end of while
	System.out.println(getName()+" = The End");
	}
}
