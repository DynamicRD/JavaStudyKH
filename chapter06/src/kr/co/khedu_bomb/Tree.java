package kr.co.khedu_bomb;

public class Tree extends Bomb {
	public Tree(int expPower) {
		super(expPower);
	}

	@Override
	public void bombBlast() {
		System.out.println("나뭇가지가 떨어지면서 나무가 불타오릅니다.");
	}
}
