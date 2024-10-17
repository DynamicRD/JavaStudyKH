package kr.co.khedu.car;

public interface CarPredicate {
	//상수, 추상 메소드, 정적 메소드,디폴트 메소드,private 메소드
	public abstract boolean test(Car car);
}
