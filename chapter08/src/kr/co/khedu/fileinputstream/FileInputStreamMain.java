package kr.co.khedu.fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamMain {

	public static void main(String[] args) {
		//FileReader는 한 문자를(2byte) 읽어옴 char a, FileInputStream은 1바이트씩 읽어옴 byte a
		//char a, byte a => int a
		//checked Exception: 실행하기도전에 빨간줄
		FileInputStream fs = null;
		try {
			fs = new FileInputStream("d:\\data.txt");
			for(;true;) {
				byte[] read25Array = new byte[25];
				byte data = (byte)fs.read(read25Array);
				//파일이 끝이면 -1을 리턴함
				if(data == -1) {
					System.out.println("data.txt.파일을 모두 읽었다");
					break;
				}
				//byte[] 문자열로 바꾸자
				System.out.println(new String(read25Array));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
		
		
		if(fs != null) {
			try {
				fs.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("The end");
	}

	}
	}
