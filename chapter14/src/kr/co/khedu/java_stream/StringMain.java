package kr.co.khedu.java_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringMain {

	public static void main(String[] args) {
		String[] arr = new String[] {"Java","Stream","Library"};
//		Stream<String> stream = Arrays.stream(arr);
//		
//		Stream<Integer> stream2 = Arrays.stream(arr).map(t->t.length());
//		
		List<Integer> list = Arrays.stream(arr).map(String::length).collect(Collectors.toList());
		System.out.println(list.toString());
		
	}

}
