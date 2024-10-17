package kr.co.khedu.ip_address;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class HostFindMain {
	public static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		String domain = null;
		InetAddress ia = null;
		System.out.print("통신하고싶은 도메인명을 입력요망: ");
		domain = sc.nextLine();
		
		try {
			ia = InetAddress.getByName(domain);
		} catch (UnknownHostException e) {}
		
		System.out.println(domain +" "+ia.getHostAddress());
	
	
	}

}
