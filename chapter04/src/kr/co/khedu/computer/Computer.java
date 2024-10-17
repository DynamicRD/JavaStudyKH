package kr.co.khedu.computer;

public class Computer {
		private int password;
		private String Id;
		private boolean isSwitchOn;
		
		
		public Computer() {}
		public Computer(int passworld,String Id,boolean isSwitchOn)
		{
			this.password = passworld;
			this.Id = Id;
			this.isSwitchOn = isSwitchOn;
		}
		
		
		public int getPassword() {
			return password;
		}
		public void setPassword(int password) {	
			if(password <0 || password >9999)
			{
				System.out.println("패스워드의 범위를 벗어났습니다.");
				return;
			}
			this.password = password;
		}
		public String getId() {
			return Id;
		}
		public void setId(String id) {
			Id = id;
		}
		public boolean isSwitchOn() {
			return isSwitchOn;
		}
		public void setSwitchOn(boolean isSwitchOn) {
			this.isSwitchOn = isSwitchOn;
		}
		
		
		public void passwordSafetyTest()
		{
			if((password / 1000 == password /100 % 10) && (password  /100 % 10 == password /10 % 10) && (password /10 % 10 == password % 10))
			{
				System.out.println("패스워드가 매우 안전하지 않습니다.");
			}
			else
			{
				System.out.println("패스워드가 안전합니다.");
			}	
		}
		
		
		
		@Override
		public String toString() {
			return "Computer [password=" + password + ", Id=" + Id + ", isSwitchOn=" + isSwitchOn + "]";
		}
		
		
		
		
}
