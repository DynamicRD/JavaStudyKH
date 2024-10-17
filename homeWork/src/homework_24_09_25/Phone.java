package homework_24_09_25;

public class Phone {
		private String makingCompany;
		private int price;
		private String type;
		public Phone(String makingCompany, int price, String type) {
			this.makingCompany = makingCompany;
			this.price = price;
			this.type = type;
		}
		public String getMakingCompany() {
			return makingCompany;
		}
		public void setMakingCompany(String makingCompany) {
			this.makingCompany = makingCompany;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		@Override
		public String toString() {
			return "Phone [makingCompany=" + makingCompany + ", price=" + price + ", type=" + type + "]";
		}
		
		
}
