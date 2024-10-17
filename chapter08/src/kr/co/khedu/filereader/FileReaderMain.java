package kr.co.khedu.filereader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {
	public static void main(String[] args) throws IOException {
		
		FileReader fr  = new FileReader("d:\\data.txt");
		
		while(true) {
			char read = (char) fr.read();
			//모두읽으면 -1값을 준다. EOF
			if(read == -1) {
				break;
			}
			System.out.println(read);
		}
		
		if(fr!= null) {
			fr.close();
		}
		
		System.out.println("The End");
	}
}
