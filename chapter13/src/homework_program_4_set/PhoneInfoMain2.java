package homework_program_4_set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PhoneInfoMain2 {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Set<PhoneInfo> set = new HashSet<>();
        int choice = 0;
        boolean exitFlag = false;
        
        while (!exitFlag) {
            printMenu();
            choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case Menu.NEW_HUMAN:
                    newHuman(set);
                    break;
                case Menu.SEARCH_DATA:
                    searchData(set);
                    break;
                case Menu.DELETE_DATA:
                    deleteData(set);
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

    public static void newHuman(Set<PhoneInfo> set) {
        System.out.println("1. 일반, 2. 대학, 3. 회사");
        int choice = sc.nextInt();
        sc.nextLine();
        
        switch (choice) {
            case Menu.DEFAULT_HUMAN:
                newNormal(set);
                break;
            case Menu.UNIVERSITY_HUMAN:
                newUniversity(set);
                break;
            case Menu.COMPANY_HUMAN:
                newCompany(set);
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }
        System.out.println("데이터의 입력이 완료되었습니다.");
    }

    public static void newNormal(Set<PhoneInfo> set) {
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("전화번호 : ");
        String phoneNumber = sc.nextLine();

        PhoneInfo newInfo = new PhoneInfo(name, phoneNumber);
        if (!set.add(newInfo)) {
            System.out.println("중복번호가 있습니다.");
        }
    }

    public static void newUniversity(Set<PhoneInfo> set) {
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("전화번호 : ");
        String phoneNumber = sc.nextLine();
        System.out.print("전공 : ");
        String major = sc.nextLine();
        System.out.print("학년 : ");
        int year = sc.nextInt();
        sc.nextLine();

        PhoneUnivInfo newInfo = new PhoneUnivInfo(name, phoneNumber, major, year);
        if (!set.add(newInfo)) {
            System.out.println("중복번호가 있습니다.");
        }
    }

    public static void newCompany(Set<PhoneInfo> set) {
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("전화번호 : ");
        String phoneNumber = sc.nextLine();
        System.out.print("회사 : ");
        String company = sc.nextLine();

        PhoneCompanyInfo newInfo = new PhoneCompanyInfo(name, phoneNumber, company);
        if (!set.add(newInfo)) {
            System.out.println("중복번호가 있습니다.");
        }
    }

    public static void searchData(Set<PhoneInfo> set) {
        System.out.print("찾을사람의 전화번호를 입력하세요: ");
        String phoneNumber = sc.nextLine();
        
        for (PhoneInfo info : set) {
            if (info.getPhoneNumber().equals(phoneNumber)) {
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
                return;
            }
        }
        System.out.println("해당사람은 없습니다.");
    }

    public static void deleteData(Set<PhoneInfo> set) {
        System.out.print("삭제할 사람의 전화번호를 입력하세요: ");
        String phoneNumber = sc.nextLine();
        
        PhoneInfo toRemove = null;
        for (PhoneInfo info : set) {
            if (info.getPhoneNumber().equals(phoneNumber)) {
                toRemove = info;
                break;
            }
        }
        
        if (toRemove != null) {
            System.out.println("데이터 삭제를 시작합니다.");
            System.out.println("name: " + toRemove.getName());
            set.remove(toRemove);
            System.out.println("데이터의 삭제가 완료되었습니다.");
        } else {
            System.out.println("해당사람은 없습니다.");
        }
    }
}