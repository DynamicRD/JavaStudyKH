package homework_progream_other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PhoneInfoMain {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<PhoneInfo> list = new ArrayList<PhoneInfo>();
        boolean exitFlag = false;

        for (; !exitFlag;) {
            showMenu();
            int menu = sc.nextInt();
            switch (menu) {
            case 1:
                insertData(list);
                break;
            case 2:
                System.out.println("종료");
                exitFlag = true;
                break;
            default:
                break;
            }
        } // end of for

    }// end of main

    public static void showMenu() {
        System.out.println("선택하세요");
        System.out.println("1. 데이터입력");
        System.out.println("2. 데이터 검색");
        System.out.println("3. 데이터 삭제");
        System.out.println("4. 프로그램 종료");
        System.out.print("선택 : ");
    }

    public static void insertData(ArrayList<PhoneInfo> list) {
        System.out.print("이름 : ");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.print("전화번호 : ");
        String phoneNumber = sc.nextLine();
        System.out.print("생년월일 : ");
        String birthday = sc.nextLine();
        PhoneInfo pi = new PhoneInfo(name, phoneNumber, birthday);
        list.add(pi);
        System.out.println("입력된 정보 출력...\n" + pi.toString());
    }

    public static String makeNumber() {
        List<String> no0 = Arrays.asList("0","1","2","3","4","5","6","7","8","9");
        List<String> no1 = Arrays.asList("0","1","2","3","4","5","6","7","8","9");
        List<String> no2 = Arrays.asList("0","1","2","3","4","5","6","7","8","9");
        List<String> no3 = Arrays.asList("0","1","2","3","4","5","6","7","8","9");
        List<String> no4 = Arrays.asList("0","1","2","3","4","5","6","7","8","9");
        List<String> no5 = Arrays.asList("0","1","2","3","4","5","6","7","8","9");
        List<String> no6 = Arrays.asList("0","1","2","3","4","5","6","7","8","9");
        Collections.shuffle(no0);
        Collections.shuffle(no1);
        Collections.shuffle(no2);
        Collections.shuffle(no3);
        Collections.shuffle(no4);
        Collections.shuffle(no5);
        Collections.shuffle(no6);
            return no0.get(0)+no1.get(0)+no2.get(0)+"-"+no3.get(0)+no4.get(0)+no5.get(0)+no6.get(0);
    }
    public static String makeBirth() {
        int year = (int)(Math.random()*(2024-1900+1)+1900);
        int month = (int)(Math.random()*(12-1+1)+1);
        int day = (int)(Math.random()*(31-1+1)+1);
        //최종본 랜덤1900~2024+"년 "+랜덤 1~12+" "+랜덤 1~31+"일"
        return ""+year+"년 "+month+"월 "+day+"일";
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
}