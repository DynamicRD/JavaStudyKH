package kr.co.khedu.list_test;

import java.util.function.Consumer;

public class MYaccept implements Consumer<Integer> {

	public MYaccept() {
		super();
	}

	@Override
	public void accept(Integer data) {
		//여기 내용은 자주 변할 수 있는 영역
		System.out.println(data);
	}

}
