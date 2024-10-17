package kr.co.khedu.path_test;

import java.nio.file.Path;

public class PathMain {

	public static void main(String[] args) {
		//Path 클래스의 정보를 알아보자
		Path path = Path.of("D:\\JavaTest\\chapter15\\src\\test.txt");
		System.out.println("전체경로: "+path.toString());
		System.out.println("파일이름: "+path.getFileName());
		Path path2 = path.getParent();
		System.out.println("부모이름: "+path.getParent().getFileName());
		System.out.println("인덱스"+path.getName(1));
		System.out.println("인덱스"+path.getName(0));
	}

}
