package homework_id_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IDMainArrayList {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<IDClass> list = new ArrayList<IDClass>();
		boolean exitFlag = false;
		String choice = null;
		int userInput = 0;
		for(;!(exitFlag);)
		{
			System.out.println("1.신규등록 2.회원검색 3.회원삭제 4.회원표기 5.정렬 6.역정렬 7.종료");
			Pattern pattern = Pattern.compile("^[1-7]$");//패턴검색
            choice =  sc.nextLine();
            Matcher match = pattern.matcher(choice); 
            boolean bool = match.matches();
            if(bool == false) {
                System.out.println("\n1에서 7사이의 정수중에 골라주세요");
                continue;
            }
            userInput = Integer.parseInt(choice);
            
			switch(userInput)
			{
			case Menu.NEW_ID:
				newID(list);
				break;
			case Menu.SEARCH_ID:
				findID(list);
				break;
			case Menu.DELETE_ID:
				deleteID(list);
				break;
			case Menu.PRINT_ID:
				printID(list);
				break;
			case Menu.SORT:
				Collections.sort(list);
				System.out.println("정렬 완료");
				break;
			case Menu.SORT_REVERSE:
				Collections.reverse(list);
				System.out.println("역정렬 완료");
				break;
			case Menu.EXIT:
				System.out.println("종료합니다");
				exitFlag = true;
				break;
			}
		}
	}
//-------------------------------------------
private static void printID(ArrayList<IDClass> list) {
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).toString());
		}
	}

//--------------------------------------------
	public static String randomLowercaseString() {
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            // 'a'부터 'z'까지의 ASCII 값을 사용하여 무작위 문자를 생성
            char randomChar = (char) ('a' + random.nextInt(26));
            result.append(randomChar);
        }
        return result.toString();
    }
	//-----------------------------------------------
	  public static String randomHangulName() {
	        List<String> 성 = Arrays.asList("김", "이", "박", "최", "정", "강", "조", "윤", "장", "임", "한", "오", "서", "신", "권", 
	                "황", "안", "송", "류", "전", "홍", "고", "문", "양", "손", "배", "백", "허", "유", "남", "심", "노", "하", 
	                "곽", "성", "차", "주", "우", "구", "신", "임", "나", "전", "민", "유", "진", "지", "엄", "채", "원", "천", 
	                "방", "공", "강", "현", "함", "변", "염", "양", "변", "여", "추", "노", "도", "소", "신", "석", "선", "설", 
	                "마", "길", "주", "연", "방", "위", "표", "명", "기", "반", "왕", "금", "옥", "육", "인", "맹", "제", "모", 
	                "장", "남", "탁", "국", "여", "진", "어", "은", "편", "구", "용");

	        List<String> 이름 = Arrays.asList("가", "강", "건", "경", "고", "관", "광", "구", "규", "근", "기", "길", "나", "남", 
	                "노", "누", "다", "단", "달", "담", "대", "덕", "도", "동", "두", "라", "래", "로", "루", "리", "마", "만", 
	                "명", "무", "문", "미", "민", "바", "박", "백", "범", "별", "병", "보", "빛", "사", "산", "상", "새", "서", 
	                "석", "선", "설", "섭", "성", "세", "소", "솔", "수", "숙", "순", "숭", "슬", "승", "시", "신", "아", "안", 
	                "애", "엄", "여", "연", "영", "예", "오", "옥", "완", "요", "용", "우", "원", "월", "위", "유", "윤", "율", 
	                "으", "은", "의", "이", "익", "인", "일", "잎", "자", "잔", "장", "재", "전", "정", "제", "조", "종", "주", 
	                "준", "중", "지", "진", "찬", "창", "채", "천", "철", "초", "춘", "충", "치", "탐", "태", "택", "판", "하", 
	                "한", "해", "혁", "현", "형", "혜", "호", "홍", "화", "환", "회", "효", "훈", "휘", "희", "운", "모", "배", 
	                "부", "림", "봉", "혼", "황", "량", "린", "을", "비", "솜", "공", "면", "탁", "온", "디", "항", "후", "려", 
	                "균", "묵", "송", "욱", "휴", "언", "령", "섬", "들", "견", "추", "걸", "삼", "열", "웅", "분", "변", "양", 
	                "출", "타", "흥", "겸", "곤", "번", "식", "란", "더", "손", "술", "훔", "반", "빈", "실", "직", "흠", "흔", 
	                "악", "람", "뜸", "권", "복", "심", "헌", "엽", "학", "개", "롱", "평", "늘", "늬", "랑", "얀", "향", "울", 
	                "련");

	        // 성과 이름을 랜덤하게 섞음
	        Collections.shuffle(성);
	        Collections.shuffle(이름);
	        
	        // 성 + 이름(첫 글자) + 이름(둘째 글자) 조합
	        return 성.get(0) + 이름.get(0) + 이름.get(1);
	    }
//-----------------------------------------------
	  public static int randomPassword() {
		  return (int)(Math.random()*89999999+10000000);
	  }
//-------------------------------------------------
	  public static String randomSiteName()
	  {
		  int select = (int)(Math.random()*3);
		  String name = null;
		  switch(select)
		  {
		  case 0:
			  name = "Google";
			  break;
		  case 1:
			  name = "Naver";
			  break;
		  case 2:
			  name = "Daum";
			  break;
		  }
		  return name;
	  }
//------------------------------------------------	  
	  public static void newID(ArrayList<IDClass> list)
	  {
		  boolean exitFlag = false;
		  for(;!exitFlag;) {
		  System.out.println("1. 검색엔진 가입 2. 유튜브 가입");
		  Pattern pattern = Pattern.compile("^[1-2]$");
          String choice =  sc.nextLine();
          Matcher match = pattern.matcher(choice); 
          boolean bool = match.matches();
          if(bool == false) {
              System.out.println("\n1에서 2사이의 정수중에 골라주세요");
              continue;
          }
          int userInput = Integer.parseInt(choice);
		  switch(userInput)
		  {
		  	case Menu.SEARCH_SITE:
		  		list.add(new PortalSite(randomLowercaseString(),randomPassword(),randomSiteName(),randomHangulName()));
		  		exitFlag = true;
		  		break;
		  	case  Menu.YOUTUBE:
		  		list.add(new Youtube(randomLowercaseString(),randomPassword(),"YouTube",randomHangulName()));
		  		exitFlag = true;
		  		break;
		  	}
		  }
		  System.out.println(list.get(list.size()-1).toString());
	  }
//------------------------------------------------
	  private static void findID(ArrayList<IDClass> list) {
			System.out.print("아이디를 입력하세요");
			String id = sc.nextLine();
			System.out.print("사이트를 입력하세요");
			String siteName = sc.nextLine();
			boolean isThereHuman = false;
			for(int i = 0;i<list.size();i++)
			{
				if(id.toLowerCase().equals(list.get(i).getID().toLowerCase()) &&siteName.toLowerCase().equals(list.get(i).getSiteName().toLowerCase()))
				{
					System.out.println("해당 회원이 있습니다.");
					System.out.println(list.get(i).toString());
					isThereHuman = true;
					break;
				}
			}
			if(isThereHuman == false)
			{
				System.out.println("해당회원은 없습니다.");
			}		
			}
//---------------------------------------------
private static void deleteID(ArrayList<IDClass> list) {
	System.out.print("아이디를 입력하세요");
	String id = sc.nextLine();
	System.out.print("사이트를 입력하세요");
	String siteName = sc.nextLine();
	boolean isThereHuman = false;
	for(int i = 0;i<list.size();i++)
	{
		if(id.toLowerCase().equals(list.get(i).getID().toLowerCase()) &&siteName.toLowerCase().equals(list.get(i).getSiteName().toLowerCase()))
		{
			System.out.println("해당 회원을 삭제합니다.");
			System.out.println(list.get(i).toString());
			list.remove(i);
			System.out.println("삭제완료.");
			isThereHuman = true;
			break;
		}
	}
	if(isThereHuman == false)
	{
		System.out.println("해당회원은 없습니다.");
	}		
	}
//----------------------------------------------------
}
