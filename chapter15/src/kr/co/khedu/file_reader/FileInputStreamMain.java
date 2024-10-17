package kr.co.khedu.file_reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamMain {

	public static void main(String[] args) {
		//1.상대파일을 읽어올것이다.(Inputstream,Reader) : FileReader
		//외부 파일을 건드리는 checked exception
		//2.int-> 형변환(byte),배열 byte
		FileInputStream fis = null;
		int rValue = 0;
		try {
			fis = new FileInputStream("D:\\JavaTest\\chapter15\\src\\kr\\co\\khedu\\file_reader\\test.txt");
			byte[] byteArray = new byte[5];
			while((rValue = fis.read(byteArray))!=-1) {
				//System.out.println("rValue = "+(char)rValue+"");
				for(int i = 0;i<rValue;i++) {
					System.out.println((char)byteArray[i]+" ");
				}
				System.out.println();
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
			System.out.println("rValue = "+(char)rValue);
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
