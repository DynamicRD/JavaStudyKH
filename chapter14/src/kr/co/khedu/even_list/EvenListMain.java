package kr.co.khedu.even_list;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenListMain {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {1,2,3,4,5,6,7,8};
		
		
//		List<Integer> list =Arrays.stream(arr).filter(t->t<=4).map( t->4*t*t).collect(Collectors.toList());
//		for(Integer data: list)
//		{
//			System.out.print(data+", ");
//		}
		
		//1. 배열을 스트림으로 변환(레코드-테이블 전체)
//		Stream <Integer> stream = Arrays.stream(arr);
		
		//2.짝수를 구한다	(where => filter)
//		Stream <Integer> stream2 =Arrays.stream(arr).filter(t->t%2==0);
		
		//3.제곱승 Map	(select toChar(number) from student where number %2 == 0)
//		Stream <Integer> stream3 = Arrays.stream(arr).filter(t->t%2==0).map( t->t*t);
		
		//4.list 변형
		List<Integer> list =Arrays.stream(arr).filter(t->t%2==0).map( t->t*t).collect(Collectors.toList());
	
		System.out.println(list.toString());
	}

}
