package kr.co.khedu.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionMain {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int result = 0;
		int inputNum = 0;
		FileInputStream fio =null;
	
			try {
				fio = new FileInputStream("data.txt");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}finally
			{
				try {
					fio.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
	
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.print("0말고 다른수를 입력");
		inputNum = sc.nextInt();
		sc.nextLine()
;		try {
			result = 10/inputNum;
		}catch(Exception e){
			//e.printStackTrace();
			result = 10;
		}finally {
			System.out.println("자원반납 무조건 실행");
		}
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("result = "+result);
		System.out.println("The End");
			}

	}

