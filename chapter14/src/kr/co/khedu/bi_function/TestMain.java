package kr.co.khedu.bi_function;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class TestMain {

	public static void main(String[] args) {
		//BiFunction<T,R,U> => public new apply(T,R);
		BiFunction<Integer, Integer, Integer> bf =(Integer t, Integer u)->Calculator.add(t,u);
		BiFunction<Integer, Integer, Integer> bff =Calculator::add;
		
		
		int value = bf.apply(10, 20);
		int value2 = bff.apply(100, 200);
		System.out.println(value);
		System.out.println(value2);
		//============================================
		//Supplier<T> => public T get();
		print(new Supplier<Integer>() {
			
			@Override
			public Integer get() {
				return "내일과 모레는 우리에게 좋은 찬스".length();
			}
		});
		//람다식
		print(()->"내일과 모레는 우리에게 좋은 찬스와 신난다".length());
		//함수식
		String str = "내일과 모레는 우리에게 좋은 찬스 와 신난다 아헿헤헤헿";
		print(str::length);
	
	}

	public static void print(Supplier<Integer> supplier) {
		System.out.println(supplier.get());
	}
}
