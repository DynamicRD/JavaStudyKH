package kr.co.khedu.chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 1.서버 소켓을 만든다
		ServerSocket ss = null;
		Socket clientSocket = null;
		BufferedReader br = null;
		PrintWriter pw  = null;
		try {
			ss = new ServerSocket(5007);
			// 2.클라이언트 접속을 기다린다.(접속할때까지 무한대기다
			System.out.println("서버가 클라이언트가 접속하기를 기다립니다.");
			clientSocket =ss.accept();
			//3.클라이언트와 대화를 나눌 송신기,수신기 생성
			//inputStream=>BufferedReader, outputStream=>PrintWriter
			br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			pw = new PrintWriter(clientSocket.getOutputStream());
			System.out.println("클라이언트와 대화할 송수신기 완성함.");
			//4.대화를 나눔,(프로토콜) 서버: 
			//읽는다(읽었는데 quit이면 끝냄), 화면보여준다,입력한다(클라이언트보낼메세지),보낸다
			while(true) {
				//1.읽는다(읽었는데 quit이면 끝냄)
				String data = br.readLine();
				if(data.equalsIgnoreCase("quit")) {
					break;
				}
				//2.화면보여준다
				System.out.println("client:"+data);
				//3.입력한다(클라이언트 보낼메세지)
				System.out.print("클라이언트한테 보낼메세지 입력요망:");
				String sendData = sc.nextLine();
				//4.보낸다
				pw.println(sendData);
				pw.flush();
			}
			
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				clientSocket.close();
				ss.close();
				br.close();
				pw.close();
			} catch (IOException e) {
			}
			System.out.println("서버소캣종료");
		}

	}

}
