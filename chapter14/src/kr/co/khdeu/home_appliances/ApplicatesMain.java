package kr.co.khdeu.home_appliances;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ApplicatesMain {

	public static void main(String[] args) {
		List<HomeApplicates> list = new ArrayList<>();
		
		list.add(new HomeApplicates("TV",400));
		list.add(new HomeApplicates("Air Conditioner",500));
		list.add(new HomeApplicates("Hair Dryer",20));
		list.add(new HomeApplicates("Vaccum Cleaner",60));
		list.add(new HomeApplicates("Remote Controller",5));

		
//		Stream<HomeApplicates> stream = list.stream();
		
//		Stream<HomeApplicates> stream2 = list.stream().filter(t->t.getPrice() >= 300);
		
		List<HomeApplicates> list2 = list.stream().filter(t->t.getPrice() >= 300).collect(Collectors.toList());
		
		for(HomeApplicates data: list2)
		{
			System.out.print(data.getName()+" ");
		}
		
		
	}

}
