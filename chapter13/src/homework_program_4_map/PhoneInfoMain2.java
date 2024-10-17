package homework_program_4_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneInfoMain2 {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Map<String, PhoneInfo> phoneBook = new HashMap<>(); // HashMap으로 변경
        int choice = 0;
        boolean exitFlag = false;
        
        while (!exitFlag) {
            printMenu();
            choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case Menu.NEW_HUMAN:
                    newHuman(phoneBook); // HashMap을 전달
                    break;
                case Menu.SEARCH_DATA:
                    searchData(phoneBook); // HashMap을 전달
                    break;
                case Menu.DELETE_DATA:
                    deleteData(phoneBook); // HashMap을 전달
                    break;
                case Menu.EXIT:
                    System.out.println("프로그램 종료됐습니다.");
                    exitFlag = true;
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("선택하세요");
        System.out.println("1. 데이터입력");
        System.out.println("2. 데이터검색");
        System.out.println("3. 데이터삭제");
        System.out.println("4. 프로그램 종료");
        System.out.print("선택 : ");
    }

    public static void newHuman(Map<String, PhoneInfo> phoneBook) {
        System.out.println("1. 일반, 2. 대학, 3. 회사");
        int choice = sc.nextInt();
        sc.nextLine();
        
        switch (choice) {
            case Menu.DEFAULT_HUMAN:
                newNormal(phoneBook); // HashMap을 전달
                break;
            case Menu.UNIVERSITY_HUMAN:
                newUniversity(phoneBook); // HashMap을 전달
                break;
            case Menu.COMPANY_HUMAN:
                newCompany(phoneBook); // HashMap을 전달
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }
        System.out.println("데이터의 입력이 완료되었습니다.");
    }

    public static void newNormal(Map<String, PhoneInfo> phoneBook) {
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("전화번호 : ");
        String phoneNumber = sc.nextLine();

        if (phoneBook.containsKey(phoneNumber)) { // 중복 체크
            System.out.println("중복번호가 있습니다.");
            return;
        }
        
        phoneBook.put(phoneNumber, new PhoneInfo(name, phoneNumber)); // 추가
    }

    public static void newUniversity(Map<String, PhoneInfo> phoneBook) {
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("전화번호 : ");
        String phoneNumber = sc.nextLine();
        
        if (phoneBook.containsKey(phoneNumber)) { // 중복 체크
            System.out.println("중복번호가 있습니다.");
            return;
        }
        
        System.out.print("전공 : ");
        String major = sc.nextLine();
        System.out.print("학년 : ");
        int year = sc.nextInt();
        sc.nextLine();
        
        phoneBook.put(phoneNumber, new PhoneUnivInfo(name, phoneNumber, major, year)); // 추가
    }

    public static void newCompany(Map<String, PhoneInfo> phoneBook) {
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("전화번호 : ");
        String phoneNumber = sc.nextLine();
        
        if (phoneBook.containsKey(phoneNumber)) { // 중복 체크
            System.out.println("중복번호가 있습니다.");
            return;
        }
        
        System.out.print("회사 : ");
        String company = sc.nextLine();
        phoneBook.put(phoneNumber, new PhoneCompanyInfo(name, phoneNumber, company)); // 추가
    }

    public static void searchData(Map<String, PhoneInfo> phoneBook) {
        System.out.print("찾을사람의 전화번호를 입력하세요: ");
        String phoneNumber = sc.nextLine();
        
        PhoneInfo info = phoneBook.get(phoneNumber); // 전화번호로 검색
        
        if (info != null) {
            System.out.println("데이터 검색을 시작합니다.");
            System.out.println("name: " + info.getName());
            System.out.println("phone: " + info.getPhoneNumber());
            if (info instanceof PhoneUnivInfo) {
                PhoneUnivInfo pui = (PhoneUnivInfo) info;
                System.out.println("major: " + pui.getMajor());
                System.out.println("year: " + pui.getYear());
            } else if (info instanceof PhoneCompanyInfo) {
                PhoneCompanyInfo pci = (PhoneCompanyInfo) info;
                System.out.println("company: " + pci.getCompany());
            }
            System.out.println("데이터의 검색이 완료되었습니다.");
        } else {
            System.out.println("해당사람은 없습니다.");
        }
    }

    public static void deleteData(Map<String, PhoneInfo> phoneBook) {
        System.out.print("삭제할 사람의 전화번호를 입력하세요: ");
        String phoneNumber = sc.nextLine();
        
        if (phoneBook.containsKey(phoneNumber)) {
            PhoneInfo toRemove = phoneBook.get(phoneNumber);
            System.out.println("데이터 삭제를 시작합니다.");
            System.out.println("name: " + toRemove.getName());
            phoneBook.remove(phoneNumber); // 삭제
            System.out.println("데이터의 삭제가 완료되었습니다.");
        } else {
            System.out.println("해당사람은 없습니다.");
        }
    }
}