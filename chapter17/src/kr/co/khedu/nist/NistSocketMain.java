package kr.co.khedu.nist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class NistSocketMain {

	public static void main(String[] args) {
		//new File("Nist.txt") == 외부에 디바이그(포트,주소,MAC 주소)
		Socket socket = null;
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			socket = new Socket("time-c.nist.gov", 13);
			is =socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			String data = null;
			while((data = br.readLine()) != null) {
				System.out.println(data);
			}
			
		} catch (Exception e) {
		}finally {
			try {
				socket.close();
				br.close();
				isr.close();
				is.close();                                                                                              
			} catch (IOException e) {
			}
		}
		System.out.println("The End");
	}

}
