package kr.co.khedu.change_type;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangFileMain {

	public static void main(String[] args) throws Exception {
		//1.stream => Reader변환 =>BufferedReader 변환
		//2.readLine( ),~~~~~~~~
		
		FileInputStream fi = new FileInputStream("test.txt");
		InputStreamReader isr = new InputStreamReader(fi,"UTF-8");
		BufferedReader br = new BufferedReader(isr);
		String data=null;
		while((data = br.readLine())!=null)
		{
			System.out.println(data);
		}
		System.out.println("The End");
	}

}
