package homework_24_09_25;

public class Melon extends Food {
	private String cultivateField;

	public Melon(int calorie, int price, double weight, String cultivateField) {
		super(calorie, price, weight);
		this.cultivateField = cultivateField;
	}

	public String getCultivateField() {
		return cultivateField;
	}

	public void setCultivateField(String cultivateField) {
		this.cultivateField = cultivateField;
	}

	@Override
	public String toString() {
		return "Melon [cultivateField=" + cultivateField + ", getCalorie()=" + getCalorie() + ", getPrice()="
				+ getPrice() + ", getWeight()=" + getWeight() + "]";
	}

	
	
}
