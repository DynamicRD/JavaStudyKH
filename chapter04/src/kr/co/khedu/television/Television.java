package kr.co.khedu.television;

public class Television {
		//멤버변수
		private int channelNum;
		private int volume;
		private boolean isPower ;
		//생성자
		public Television()
		{
			
		}
		
		public Television(int channelNum,int volume,boolean isPower)
		{
			this.channelNum = channelNum;
			this.volume = volume;
			this.isPower = isPower;
		}
		//setter,getter
		public void setChannelNum(int channelNum)
		{
			//음수나 300번 넘으면 등록
			if(channelNum<0 || channelNum>300)
			{
				System.out.println("정신차려어");
				return;
			}
			this.channelNum = channelNum;
		}
		
		public int getChannelNum()
		{
			return channelNum;
		}
		public int getVolume() {
			return volume;
		}

		public void setVolume(int volume) {
			this.volume = volume;
		}

		public boolean isPower() {
			return isPower;
		}

		public void setPower(boolean isPower) {
			this.isPower = isPower;
		}
		//연산함수
		public String getChannelName()
		{
			String channelName = null;
			
			switch(channelNum)
			{
			case 10:
				channelName = "MBC";
				break;
			case 11:
				channelName = "KBS";
				break;
			case 12:
				channelName = "CBS";
				break;
			default:
				channelName = "없는채널번호입니다.";
				break;
			}
			
			
			return channelName;
		}
		//출력함수(멤버변수 모두 출력하는 기능)

		@Override
		public String toString() {
			return "Television [channelNum=" + channelNum + ", volume=" + volume + ", isPower=" + isPower + "]";
		}

	
	
	
}
