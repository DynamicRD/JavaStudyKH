package kr.co.khedu.naver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class NaverMain {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.naver.com:443");
		//네이버서버진입점 = Naver.txt	FileInputStream fis  = new FileInputStream("naver.txt"); 파일집입점
		URLConnection urlConn = url.openConnection();	
		
		InputStream is = urlConn.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String data = null;
		while((data = br.readLine())!=null) {
			//웹브라우저에 써주면 => 브라우저가 태그를 해석해서 화면으로 변환해서 보여준다
			System.out.println(data);
		}
		
		br.close();
		System.out.println("The End");
	}
}
