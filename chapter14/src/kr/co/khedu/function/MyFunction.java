package kr.co.khedu.function;

public interface MyFunction<T,R> {
	public abstract R apply(T t);
}
