package homeWork_24_09_20;

public class Dice {
		private double face;
		public static int rollCount = 0;
		
		public Dice() {}

		public double getFace() {
			return face;
		}

		@Override
		public String toString() {
			return "Dice [face=" + face + "]";
		}

		public void roll()
		{
			face = (int) (Math.random() * 6) + 1;
			Dice.rollCount++;
		}
		
		
}
