package kr.co.khedu.file_reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {

	public static void main(String[] args) {
		//1.상대파일을 읽어올것이다.(Inputstream,Reader) : FileReader
		//외부 파일을 건드리는 checked exception
		//2.int-> 형변환,배열 char[ ]
		FileReader fr = null;
		int rValue = 0;
		try {
			fr = new FileReader("D:\\JavaTest\\chapter15\\src\\kr\\co\\khedu\\file_reader\\test.txt");
			int data = 0;
			char[] dataArray = new char[5];
			while((rValue = fr.read(dataArray))!=-1) {
				System.out.print(rValue+String.valueOf(dataArray));
			}
			
//			while((data = fr.read()) != -1) {
//				System.out.print((char)data);
//			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("rValue = "+rValue);
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
