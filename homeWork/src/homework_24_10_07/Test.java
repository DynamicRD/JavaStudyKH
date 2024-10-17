//package homework_24_10_07;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Objects;
//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//
//class Student implements Comparable<Student>
//{
//	String name;
//	String address;
//	String phone;
//	//-------------------------------
//	public Student(String name, String address, String phone) {
//		super();
//		this.name = name;
//		this.address = address;
//		this.phone = phone;
//	}
//	public Student() {
//		this(null,null,null);
//	}
//	//-------------------------------
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	public String getPhone() {
//		return phone;
//	}
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//	//-------------------------------
//	@Override
//	public int compareTo(Student o) {
//		return this.phone.compareTo(o.phone);
//	}
//	@Override
//	public String toString() {
//		return "Student [name=" + name + ", address=" + address + ", phone=" + phone + "]";
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hashCode(phone);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if(!(obj instanceof Student))
//			return false;
//		Student stu = (Student)obj;
//		return this.phone.equals(stu.phone);
//	}
//}
//
//public class Test
//{
//	public static Scanner sc = new Scanner(System.in);
//	
//	public static void main(String[] args) {
//		ArrayList<Student> list = new ArrayList<Student>();
//		boolean exitFlag = false;
//		
//		for(;!exitFlag;)
//		{
//			 System.out.println("1.학생추가 2.학생검색 3.학생삭제 4.종료");
//			 Pattern pattern = Pattern.compile("^[1-4]$");
//			 String choice = sc.nextLine();
//	         Matcher match = pattern.matcher(choice);
//	         boolean bool = match.matches();
//	         if (bool == false) {
//	                System.out.println("\n1에서 4사이의 정수중에 골라주세요");
//	                continue;
//	            }
//	         int select = Integer.parseInt(choice);
//	         switch(select)
//	         {
//	         case 1:
//	        	 addStudent(list);
//	        	 break;
//	         case 2:
//	        	 System.out.print("찾을 학생의 번호를 입력하세요");
//	        	 String phone = sc.nextLine();
//	        	 for(int i)
//	        	 break;
//	         case 3:
//	        	 break;
//	         case 4:
//	        	 break;
//	         }
//			
//			
//		}
//		
//	}
//	public static void addStudent(ArrayList<Student> list)
//	{
//	 System.out.print("학생의 이름을 입력하시오: ");
//   	 String name = sc.nextLine();
//   	 System.out.print("학생의 주소를 입력하시오: ");
//   	 String address = sc.nextLine();
//   	 System.out.print("학생의 번호를 입력하시오: ");
//   	 String phone = sc.nextLine();
//   	 list.add(new Student(name,address,phone));
//   	 System.out.println(list.get(list.size()-1).toString());
//	}
//}