package kr.co.khedu.function;

public class MyApply implements MyFunction<Integer, Double> {

	@Override
	public Double apply(Integer t) {
		return t*4.0;
	}


}
