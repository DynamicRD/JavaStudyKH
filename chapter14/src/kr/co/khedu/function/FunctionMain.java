package kr.co.khedu.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionMain {

	public static void main(String[] args) {
		//1단계 구현클래스
		MyApply ma = new MyApply();
		Double value = ma.apply((Integer)10);
		System.out.println("value ="+value);
		
		//2단계 임시객체(구현클래스가 없다)
		MyFunction<Integer,Double> mf = new MyFunction<Integer, Double>() {
			
			@Override
			public Double apply(Integer t) {
				return t+4.0;
			}
		};
		Double value2 = mf.apply((Integer)10);
		System.out.println("value ="+value2);
		
		//3단계 람다식
	MyFunction<Integer,Double> mf2 =(Integer t)-> {
				return t+5.0;
		};
		Double value3 = mf2.apply((Integer)10);
		System.out.println("value ="+value3);
		//******************************
		//인터페이스로 만들지않고 사용할 수 있다=>범용으로 이미 만들어놨다(인터페이스 9개)
		
		//1.임시객체
		Function<Integer, String> fun = new Function<Integer, String>() {
			
			@Override
			public String apply(Integer t) {
				return t+"값입니다.";
			}
		};
		
		System.out.println(fun.apply((Integer)100));
		
		//2. 람다식
Function<Integer, String> fun2 = t->t+"값입니다.";
		
		System.out.println(fun2.apply((Integer)100));
		
		
		//-------------------------------
		//BiFunction<T,U,R> => public R apply(T,U);
		BiFunction<String, String, Integer> bf = (t, u)->t.length()+u.length();		
		int time = bf.apply("내일은 공부하는날", "모레 공부하는날");
		System.out.println("우리가 공부해야될 총 시간 "+time);
	}

}
