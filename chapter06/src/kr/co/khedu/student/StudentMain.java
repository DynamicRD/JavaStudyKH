package kr.co.khedu.student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws InterruptedException {
		final int NEW=1,FIND=2,PRINT=3,EXIT=4;
		int choice = 0;
		ArrayList<Student> student = new ArrayList<Student>();
		
		while(true)
		{
			selection();
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
			case NEW:
				//newStudent(student);
				break;
			case FIND:
				//findStudent(student);
				break;
			case PRINT:
				//printStudent(student);
				break;
			case EXIT:
				System.out.println("프로그램 종료");
				System.exit(1);
				break;
			/*
			 * case 5: Student[] arr = new Student[student.length]; for(int i =
			 * 0;i<student.length;i++) { for(int j = 0;j<student.length;j++) { if(student[j]
			 * != null && arr[i] == null) { arr[i] = student[j]; } } } for(int i = 0;arr[i]
			 * != null;i++) { for(int y = 0;arr[y]) }
			 * 
			 * 
			 * break;
			 */
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
			Thread.sleep(3000);
		}
	}
	
	
	
	
	public static void selection()
	{
		System.out.println("=====================");
		System.out.println("1.학생 등록");			
		System.out.println("2.학생 검색");			
		System.out.println("3.출력");			
		System.out.println("4.종료");						
		System.out.println("=====================");
		System.out.print("번호를 입력하시오");
	}
	
	public static void newStudent(Student[] student)
	{
		System.out.print("학생 번호를 입력하시오");
		int no = sc.nextInt();
		sc.nextLine();
		
		if(no<1 || no>30)
		{
			System.out.println("번호는 1부터 "+student.length+"까지의 정수입니다.");
			return;
		}
		
		System.out.print("학생 이름을 입력하시오");
		String name = sc.nextLine();
		System.out.print("국어 점수를 입력하시오");
		int korScore = sc.nextInt();
		sc.nextLine();
		
		if(korScore<0 || korScore>100)
		{
			System.out.println("점수는 0부터 100까지의 정수입니다.");
			return;
		}
		
		System.out.print("영어 점수를 입력하시오");
		int engScore = sc.nextInt();
		sc.nextLine();
		
		if(engScore<0 || engScore>100)
		{
			System.out.println("점수는 0부터 100까지의 정수입니다.");
			return;
		}
		
		System.out.print("수학 점수를 입력하시오");
		int mthScore = sc.nextInt();
		sc.nextLine();
		
		if(mthScore<0 || mthScore>100)
		{
			System.out.println("점수는 0부터 100까지의 정수입니다.");
			return;
		}
		
		student[no-1] = new Student(no,name,korScore,engScore,mthScore);
		student[no-1].setAverage();
		student[no-1].setTotal();
	}

	public static void findStudent(Student[] student)
	{
		System.out.print("찾을 학생의 이름을 입력하시오 ");
		String name = sc.nextLine();
		boolean isNameThere = false;
		for(int i = 0;i<student.length;i++)
		{
			if(student[i] != null&&student[i].getName().equals(name))
			{
				System.out.println(student[i]);
				isNameThere = true;
				break;
			}			
		}
		if(isNameThere ==false)
		{
			System.out.println("해당 학생은 존재하지 않습니다.");
		}
	}

	public static void printStudent(Student[] student)
	{
		for(int i = 0;i<student.length;i++)
		{
			if(student[i] != null)
			{
				System.out.println(student[i]);
			}			
		}
	}
}
