package kr.co.khedu_singleton;

public class Single {
		private static Single instance = new Single();

		private int name,age,no;

		private Single() { }

		public int getName() {
			return name;
		}

		public void setName(int name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public static Single getInstance() {
			return Single.instance;
		}

	
		public void setAge(int age) {
			this.age = age;
		}

		public int getNo() {
			return no;
		}

		public void setNo(int no) {
			this.no = no;
		}

		@Override
		public String toString() {
			return "Single [name=" + name + ", age=" + age + ", no=" + no + "]";
		}



}
