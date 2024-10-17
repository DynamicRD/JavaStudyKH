package homework_24_09_25;

public class Food {
		private int calorie;
		private int price;
		private double weight;
		
		public Food(int calorie, int price, double weight) {
			this.calorie = calorie;
			this.price = price;
			this.weight = weight;
		}
		public int getCalorie() {
			return calorie;
		}
		public void setCalorie(int calorie) {
			this.calorie = calorie;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public double getWeight() {
			return weight;
		}
		public void setWeight(double weight) {
			this.weight = weight;
		}
		@Override
		public String toString() {
			return "Food [calorie=" + calorie + ", price=" + price + ", weight=" + weight + "]";
		}
		
		
}
