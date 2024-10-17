package homework_24_10_07;

import java.util.ArrayList;
import java.util.Scanner;

public class fifteen {

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i< 10;i++){
		System.out.print("심사위원의 점수: ");
		Double score = sc.nextDouble( );
		sc.nextLine( );
		list.add(score);
		}
		double sum = 0.0;
		for(int i = 0;i< 10;i++){
		sum += list.get(i);
		}
		System.out.println("점수의 합: "+sum);



	}

}
