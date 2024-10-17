package kr.co.khedu.list_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ListMain {

	public static void main(String[] args) {
		Integer[] intArr = new Integer[] {1,2,3,4,5,6,7,8,9,10};
		List<Integer> list1 = null;
		List<Integer> list2 = new ArrayList<>();
		
		list1 = Arrays.asList(intArr);
		
		for(Integer num : list1) {
			System.out.print(num+" ");
		}
		
		//for(int i=0;i<list1.size();i++)
		//{
		//	if(list1.get(i) % 2 == 0)
		//	{
		//		list2.add(list1.get(i));
		//	}
		//}
		
		for(Integer data : list1)
		{
			if(data % 2 == 0)
			{
				list2.add(data);
			}
		}

		System.out.println();
		for(Integer num : list2) {
			System.out.print(num+" ");
		}
		System.out.println("======================");
		//1단계
		MYaccept myAccept = new MYaccept();
		list1.stream().filter(data-> data %2 == 0).forEach(myAccept);

		
		//2단계(임시객체)
		Consumer<Integer> consumer = new Consumer<Integer>() {
			
			@Override
			public void accept(Integer data) {
				System.out.println(data+" ");
			}
		}; 
		list1.stream().filter(data-> data %2 == 0).forEach(consumer);
	
		//3단계(매개변수안에서 작성: 임시객체)
		list1.stream().filter(data-> data %2 == 0).forEach(new Consumer<Integer>() {
			
			@Override
			public void accept(Integer data) {
				System.out.println(data+" ");
			}
		});

		//4단계(람다식)
		list1.stream().filter(data-> data %2 == 0).forEach(data -> System.out.println(data));

	
		//5단계(함수선언식(1급함수))
		list1.stream().filter(data-> data %2 == 0).forEach(System.out::println);
	}

}
