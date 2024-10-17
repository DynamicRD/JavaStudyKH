package kr.co.khedu.chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		//1.서버소켓을 생성한다.
		Socket ss = null;
		PrintWriter pw =null;
		BufferedReader br = null;
		try {
			ss = new Socket("192.168.20.7",5000);
			//2.서버소켓에서 송수신기
			pw = new PrintWriter(ss.getOutputStream());
			br = new BufferedReader(new InputStreamReader(ss.getInputStream()));
			//4.대화를 나눔,(프로토콜)  
			//서버:읽는다(읽었는데 quit이면 끝냄), 화면보여준다,입력한다(클라이언트보낼메세지),보낸다
			//클라:입력한다(서버에보낼메세지),보낸다(끝내고싶으면 quit보낸다),읽는다,화면에 보여준다
			while(true) {
				//1.입력한다(서버보낼메세지)
				System.out.println("서버에 보낼 메세지");
				String sendData = sc.nextLine();
				
				//2.보낸다(끝내고싶으면quit을보냄)
				pw.println(sendData);
				pw.flush();
				if(sendData.equalsIgnoreCase("quit")) {
					System.out.println("클라이언트가 종료를 요청했습니다.");
					break;}
				//3.읽는다
				String receivData = br.readLine();
				//4.화면보여준다
				System.out.println("서버에서 보낸 메세지:"+receivData);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				ss.close();
			} catch (IOException e) {}
		}
	}

}
