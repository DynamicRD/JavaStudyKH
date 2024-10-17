package kr.co.khedu_base;

public class Base {
		private int baseNo;

		public Base() {
			super();
			System.out.println("부모 생성");
		}

		public Base(int baseNo) {
			super();
			this.baseNo = baseNo;
		}

		public int getBaseNo() {
			return baseNo;
		}

		public void setBaseNo(int baseNo) {
			this.baseNo = baseNo;
		}

		@Override
		public String toString() {
			return "Base [baseNo=" + baseNo + "]";
		}
		
		
		public void print()
		{
			System.out.println("부모 프린트");
		}
}
