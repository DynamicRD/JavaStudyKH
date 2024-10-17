package kr.co.khedu.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {
		String[] name = new String[] {"Kim","Lee","Ju","Choi","Chee","Bark"};
		//1/배열,컬렉션 => Stream 변경한다
		Stream <String> stream = Arrays.stream(name);
		//2.Stream을 중간처리 연산(filter기능)
		Stream <String> stream2 =stream.filter(new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.startsWith("C");
			}
		});
		
		//3.Stream을 중간처리 연산(정렬필터링)
		Stream <String> stream3 = stream2.sorted(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		//4.Stream을 중간처리 연산(타입변환연산: map)
		Stream<Integer> stream4 = stream3.map(t->t.length());
			
	
		
		
		//5.Stream을 종단처리(배열이나, 컬렉션프레임워크로 변경)
//		List<String> list = stream4.collect(Collectors.toList());
//		String[] name2 = list.toArray(new String[list.size()]);
//		
//		//5.결과를 확인
//		for(String data: list)
//		{
//			System.out.println(data+"\t");
//		}
//		//============================
//		for(String data: name2)
//		{
//			System.out.println(data+"\t");
//		}
	}

}
