package kr.co.khedu.multi_chatting;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Messenger {
	//멤버변수(포트번호,데이터입력Input(x),데이터출력output(x),is,os)
	public static final int SERVER_PORT = 5000;
	private JTextField jTextField;	//입력기능GUI
	private JTextArea jTextArea;		//출력기능
	private DataInputStream dis;		//서버에서 오는 데이터를 읽는 기능
	private DataOutputStream dos;	//서버로 데이터를 출력하는기능
	private String name;

	//생성자 디생
	public Messenger() throws UnknownHostException, IOException {
		//1.화면객체를 만든다()
		MyFrame mf = new MyFrame();
		//2.서버소켓을 만든다. 3번벙식 임시객체스레드를 작동시킨다(서버에서 온 메세지를 화면에 출력)
		Socket ss = new Socket("192.168.20.27", SERVER_PORT);
		dis = new DataInputStream(ss.getInputStream());
		dos = new DataOutputStream(ss.getOutputStream());
		name = "김동욱";
		//스레드를 만든다 3번
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					try {
						String message = dis.readUTF();
						jTextArea.append("서버온 메세지: " + message + "\n");
					} catch (IOException e) {
						e.printStackTrace();
						break; // 오류 발생 시 루프 종료
					}
				}
			} // end of run
		});
		
		t.start();
	}

	//내부클래스(화면설계): (x) => 웹(Html,css,javascript,=>react)
	//이벤트 처리한다(서버에 데이터를 전송하는 기능이 들어있다)
	//내부클래스(화면설계): (x) => 웹(Html,css,javascript,=>react) web Server:jsp=>Spring boot,Oracle)
	class MyFrame extends JFrame implements ActionListener {
		//멤버변수
		
		//생성자
		public MyFrame() throws HeadlessException {
			super("Messenger");	//화면창의 메인 Messenger 클래스다.
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//화면창의 닫기기능 활성화
			
			//입력창의 기능을 부여(위치,폭,높이,여백,생상,화면표현할기능,이벤트기능)
			//여기서 이벤트 기능을 부여한다.(글을쓰고 엔터를 입력하면 이벤트 작동)
			jTextField = new JTextField(30);
			jTextField.addActionListener(this);
			
			//작업창을 기능을 부여,편집기능 안됨
			jTextArea = new JTextArea(10, 30);
			jTextArea.setEditable(false);
			JScrollPane jScrollPane = new JScrollPane(jTextArea);
			
			//화면에 배치한다
			add(jTextField, BorderLayout.PAGE_END); // JFrame 화면 아래에 배치
			add(jScrollPane, BorderLayout.CENTER); // JScrollPane을 중앙에 배치

			pack();
			setVisible(true);
		}
		
		//이벤트가 발생하면 입력을 하고 엔터만 치면 실행을 해주는 함수
		@Override
		public void actionPerformed(ActionEvent e) {
			String data = jTextField.getText(); // jTextField에서 텍스트 가져오기
			
			//서버에 전송한다.
			try {
				dos.writeUTF("(" + name + ") " + data);
				jTextArea.append("SEND: " + data + "\n"); // 내가 서버에 보낸 데이터를 텍스트 영역에 출력
				jTextField.setText(""); // 입력 필드 초기화
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			//메시지 출력할 계속해서 마지막 위치에 놓는다. 그래야 계속해서 뒤에 추가할 수 있다
			jTextArea.setCaretPosition(jTextArea.getDocument().getLength());
		}
	}
}