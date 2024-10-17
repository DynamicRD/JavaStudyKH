package kr.co.khedu.file_reader;

import java.io.DataInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamMain {

	public static void main(String[] args) {
		//1.상대파일을 읽어올것이다.(Inputstream) : FileInputStream => DataInputStream
		//2.보조스트림 방식으로 쓴다(이건 몰라서 검색해봐야한다)
		FileInputStream fis = null;
		DataInputStream dis = null;
		int rValue = 0;
		try {
			fis = new FileInputStream("D:\\JavaTest\\chapter15\\src\\kr\\co\\khedu\\file_reader\\test2.txt");
			dis = new DataInputStream(fis);
			
//			dos.writeInt(100);
			int iData = dis.readInt();
//			dos.writeDouble(123.45);
			double dData = dis.readDouble();
//			dos.writeChars("abc");
			String sData = dis.readLine();
			System.out.println(iData);
			System.out.println(dData);
			System.out.println(sData);
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(dis != null) {
				try {
					dis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		System.out.println("파일을 잘 저장했습니다");
	}

}
