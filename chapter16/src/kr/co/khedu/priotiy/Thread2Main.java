package kr.co.khedu.priotiy;

import java.util.ArrayList;
import java.util.List;

public class Thread2Main {

	public static void main(String[] args) {
		// 스레드를 10개를 만들고 돌린다.
		   List<Thread> list = new ArrayList<>();
	        for(int i = 0; i < 10; i++) { // 인덱스를 0부터 시작
	            ThreadB thread = new ThreadB("스레드" + (i + 1));
	            if(i == 9) { // 10번째 스레드
	                thread.setPriority(Thread.MAX_PRIORITY);
	            } else {
	                thread.setPriority(Thread.MIN_PRIORITY);
	            }
	            list.add(thread);
	        }
	        
	        for(Thread thread : list) {
	            thread.start(); // 스레드 시작
	        }
	    }
	}