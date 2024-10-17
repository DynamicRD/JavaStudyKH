package kr.co.khedu.student3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
	public static Scanner sc = new Scanner(System.in);
	public final static int INSERT_STUDENT =1, FIND_STUDENT =2, PRINT_STUDENT =3,
					DELETE_STUDENT = 4,	CHANGE_STUDENT = 5 ,SORT = 6,SORT_REVERSE = 7,EXIT = 8;
	public static void main(String[] args) {
		boolean exitFlag = false;
		int choice = 0;
		ArrayList<Student> stList = new ArrayList<Student>();
		
		System.out.println("1.성적 입력하기");			
		System.out.println("2.성적 검색하기");			
		System.out.println("3.전체 출력하기");			
		System.out.println("4.성적 삭제하기");						
		System.out.println("5.성적 수정하기");			
		System.out.println("6.성적 순위보기");			
		System.out.println("7.종료하기");	
		
		for(;!exitFlag;)
		{
			showMenu();
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
			case INSERT_STUDENT:
				insertStudent(stList);
				break;
			case FIND_STUDENT:
				findStudent(stList);
				break;
			case PRINT_STUDENT:
				printStudent(stList);
				break;
			case DELETE_STUDENT:
				deleteStudent(stList);
				break;
			case CHANGE_STUDENT:
				changeStudent(stList);
				break;
			case SORT:
				Collections.sort(stList, (s1, s2) -> Integer.compare(s1.getNo(), s2.getNo()));
			    System.out.println("학생 목록이 번호 기준으로 정렬되었습니다.");
			    printStudent(stList); 
				break;
			case SORT_REVERSE:
				Collections.sort(stList, (s1, s2) -> Integer.compare(s2.getNo(), s1.getNo()));
                System.out.println("학생 목록이 번호 기준으로 역정렬되었습니다.");
                printStudent(stList);
				break;
			case EXIT:
				exitFlag = true;
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				break;
			}
			
			
			
		}
	}
//---------------------------------------------------
	public static void showMenu()
	{
		System.out.println("--------------------------");
		System.out.println("1.성적 생성하기");			
		System.out.println("2.성적 검색하기");			
		System.out.println("3.전체 출력하기");			
		System.out.println("4.성적 삭제하기");						
		System.out.println("5.성적 수정하기");			
		System.out.println("6.성적 정렬하기");			
		System.out.println("7.성적 역정렬하기");			
		System.out.println("8.종료하기");						
		System.out.println("--------------------------");
		System.out.print("번호를 입력하시오");
	}
	
	public static String makeName() {
		
		List<String> 성 = Arrays.asList("김", "이", "박", "최", "정", "강", "조", "윤", "장", "임", "한", "오", "서", "신", "권", "황", "안",
				"송", "류", "전", "홍", "고", "문", "양", "손", "배", "조", "백", "허", "유", "남", "심", "노", "정", "하", "곽", "성", "차", "주",
				"우", "구", "신", "임", "나", "전", "민", "유", "진", "지", "엄", "채", "원", "천", "방", "공", "강", "현", "함", "변", "염", "양",
				"변", "여", "추", "노", "도", "소", "신", "석", "선", "설", "마", "길", "주", "연", "방", "위", "표", "명", "기", "반", "왕", "금",
				"옥", "육", "인", "맹", "제", "모", "장", "남", "탁", "국", "여", "진", "어", "은", "편", "구", "용");
		
		List<String> 이름 = Arrays.asList("가", "강", "건", "경", "고", "관", "광", "구", "규", "근", "기", "길", "나", "남", "노", "누", "다",
		        "단", "달", "담", "대", "덕", "도", "동", "두", "라", "래", "로", "루", "리", "마", "만", "명", "무", "문", "미", "민", "바", "박",
		        "백", "범", "별", "병", "보", "빛", "사", "산", "상", "새", "서", "석", "선", "설", "섭", "성", "세", "소", "솔", "수", "숙", "순",
		        "숭", "슬", "승", "시", "신", "아", "안", "애", "엄", "여", "연", "영", "예", "오", "옥", "완", "요", "용", "우", "원", "월", "위",
		        "유", "윤", "율", "으", "은", "의", "이", "익", "인", "일", "잎", "자", "잔", "장", "재", "전", "정", "제", "조", "종", "주", "준",
		        "중", "지", "진", "찬", "창", "채", "천", "철", "초", "춘", "충", "치", "탐", "태", "택", "판", "하", "한", "해", "혁", "현", "형",
		        "혜", "호", "홍", "화", "환", "회", "효", "훈", "휘", "희", "운", "모", "배", "부", "림", "봉", "혼", "황", "량", "린", "을", "비",
		        "솜", "공", "면", "탁", "온", "디", "항", "후", "려", "균", "묵", "송", "욱", "휴", "언", "령", "섬", "들", "견", "추", "걸", "삼",
		        "열", "웅", "분", "변", "양", "출", "타", "흥", "겸", "곤", "번", "식", "란", "더", "손", "술", "훔", "반", "빈", "실", "직", "흠",
		        "흔", "악", "람", "뜸", "권", "복", "심", "헌", "엽", "학", "개", "롱", "평", "늘", "늬", "랑", "얀", "향", "울", "련");
		    Collections.shuffle(성);
		    Collections.shuffle(이름);
		    return 성.get(0) + 이름.get(0) + 이름.get(1);
	}
	
	public static void insertStudent(ArrayList<Student> stList)
	{
		int no = (int)(Math.random()*10001+10000);
		String name = makeName();
		int kor = (int)(Math.random()*51+50);
		int eng = (int)(Math.random()*51+50);
		int math = (int)(Math.random()*51+50);
		Student student = new Student(no,name,kor,eng,math);
		stList.add(student);
	}
	
	public static void findStudent(ArrayList<Student> stList)
	{
		System.out.print("검색할 번호를 입력하시오. ");
		int no = sc.nextInt();
		sc.nextLine();
		boolean isStudentThere =false;
		for(int i = 0;i<stList.size();i++)
		{
			if(stList.get(i).getNo() == no)
			{
				System.out.println(stList.get(i).toString());
				isStudentThere =true;
				break;
			}
		}
		if(isStudentThere == false)
		{
			System.out.println("해당번호의 학생은 없습니다.");
		}
	}
	
	public static void printStudent(ArrayList<Student> stList)
	{
		for(int i = 0;i<stList.size();i++)
		{
			System.out.println(stList.get(i).toString());
		}
	}
	
	public static void deleteStudent(ArrayList<Student> stList)
	{
		System.out.print("삭제할 번호를 입력하시오. ");
		int no = sc.nextInt();
		sc.nextLine();
		boolean isDeleteSuccess =false;
		for(int i = 0;i<stList.size();i++)
		{
			if(stList.get(i).getNo() == no)
			{
				stList.remove(i);
				System.out.println("삭제하였습니다");
				isDeleteSuccess =true;
				break;
			}
		}
		if(isDeleteSuccess == false)
		{
			System.out.println("해당번호의 학생은 없습니다.");
		}
	}
	
	public static void changeStudent(ArrayList<Student> stList)
	{
		System.out.print("수정할 번호를 입력하시오. ");
		int no = sc.nextInt();
		sc.nextLine();
		boolean isChangeSuccess =false;
		for(int i = 0;i<stList.size();i++)
		{
			if(stList.get(i).getNo() == no)
			{
				System.out.print("국어 성적을 입력하시오.");
				int kor = sc.nextInt();
				sc.nextLine();
				System.out.print("수학 성적을 입력하시오.");
				int math = sc.nextInt();
				sc.nextLine();
				System.out.print("영어 성적을 입력하시오.");
				int eng = sc.nextInt();
				sc.nextLine();
				stList.get(i).setKor(kor);
				stList.get(i).setEng(eng);
				stList.get(i).setMath(math);
				isChangeSuccess =true;
				break;
			}
		}
		if(isChangeSuccess == false)
		{
			System.out.println("해당번호의 학생은 없습니다.");
		}
	}
	
}
