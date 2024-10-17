package kr.co.khedu_bomb;

public class Bomb {
	private int expPower;

	public Bomb(int expPower) {
		this.expPower = expPower;
	}

	public int getExpPower() {
		return expPower;
	}

	public void setExpPower(int expPower) {
		this.expPower = expPower;
	}

	@Override
	public String toString() {
		return "Bomb [expPower=" + expPower + "]";
	}
	//연산자폭발함수
	public void bombBlast()
	{
		System.out.println(expPower+"사이즈로 폭발합니다. Bomb");
	}
}
