package homework_24_10_08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentMain {

		public static Scanner sc = new Scanner(System.in);
		
		public static void main(String[] args) {
			ArrayList<Student> list = new ArrayList<Student>();
			boolean exitFlag = false;
			
			for(;!exitFlag;)
			{
				 System.out.println("1.학생추가 2.학생검색 3.학생삭제 4.종료");
				 Pattern pattern = Pattern.compile("^[1-4]$");
				 String choice = sc.nextLine();
		         Matcher match = pattern.matcher(choice);
		         boolean bool = match.matches();
		         if (bool == false) {
		                System.out.println("\n1에서 4사이의 정수중에 골라주세요");
		                continue;
		            }
		         int select = Integer.parseInt(choice);
		         switch(select)
		         {
		         case 1:
		        	 addStudent(list);
		        	 break;
		         case 2:
		        	 findStudnet(list);
		        	 break;
		         case 3:
		        	 deleteStudnet(list);
		        	 break;
		         case 4:
		        	 System.out.println("프로그램을 종료합니다");
		        	 System.exit(1);
		        	 break;
		         }
				
				
			}
			
		}
		public static void addStudent(ArrayList<Student> list)
		{
		 System.out.print("학생의 이름을 입력하시오: ");
	   	 String name = sc.nextLine();
	   	 System.out.print("학생의 주소를 입력하시오: ");
	   	 String address = sc.nextLine();
	   	 System.out.print("학생의 번호를 입력하시오: ");
	   	 String phone = sc.nextLine();
	   	for(int i=0;i<list.size();i++)
	   	{
   		 if(phone.equals(list.get(i).getPhone()))
   			 {
   			 	System.out.println("해당학생이 존재합니다");
   			 	return;
   			 }
	   	}
	   	 list.add(new Student(name,address,phone));
	   	 System.out.println(list.get(list.size()-1).toString());
		}
		public static void findStudnet(ArrayList<Student> list)
		{
			 System.out.print("찾을 학생의 번호를 입력하세요");
	    	 String phone = sc.nextLine();
	    	 for(int i=0;i<list.size();i++)
	    	 {
	    		 if(phone.equals(list.get(i).getPhone()))
	    			 {
	    			 	System.out.println(list.get(i).toString());	
	    			 	System.out.println("해당학생이 존재합니다");
	    			 	return;
	    			 }
	    	 }
	    	System.out.println("해당학생은 존재하지 않습니다.");
		}
		public static void deleteStudnet(ArrayList<Student> list)
		{
			System.out.print("삭제할 학생의 번호를 입력하세요");
			String phone = sc.nextLine();
			for(int i=0;i<list.size();i++)
			{
				if(phone.equals(list.get(i).getPhone()))
				{
					System.out.println(list.get(i).toString());	
					System.out.println("해당학생을  삭제합니다");
					list.remove(i);
					return;
				}
			}
			System.out.println("해당학생은 존재하지 않습니다.");
		}
	}

