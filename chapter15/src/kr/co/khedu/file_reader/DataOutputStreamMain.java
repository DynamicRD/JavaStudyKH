package kr.co.khedu.file_reader;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamMain {

	public static void main(String[] args) {
		//1.상대파일을 출력할이다.(Outputstream) : FileOutputStream => DataOutputStream
		//2.보조스트림 방식으로 쓴다(이건 몰라서 검색해봐야한다)
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		int rValue = 0;
		try {
			fos = new FileOutputStream("D:\\JavaTest\\chapter15\\src\\kr\\co\\khedu\\file_reader\\test2.txt");
			dos = new DataOutputStream(fos);
			
			dos.writeInt(100);
			dos.writeDouble(123.45);
			dos.writeChars("abc");
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(dos != null) {
				try {
					dos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		System.out.println("파일을 잘 저장했습니다");
	}

}
