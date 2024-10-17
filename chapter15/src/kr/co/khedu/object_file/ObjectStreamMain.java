package kr.co.khedu.object_file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//객체를 파일로 저장한다.
		//1.FileOutputStream =>ObjecftOutputStream
		//2. ObjecrOutputStream 제공되어진 함수 활용
		FileOutputStream fos  = new FileOutputStream("object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
	
		Student stu = new Student(10,"kdj",100);
		oos.writeObject(stu);
		
		oos.close();
		fos.close();
		System.out.println("The End");

		FileInputStream fis  = new FileInputStream("object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
	
		Object object = ois.readObject();
	
		
		if(object instanceof Student) {
			Student stu2 =(Student)object;
			System.out.println(stu2.toString());
		}else {
			System.out.println("객체속에 Student타입 없다 "+object.toString());
		}
	}

}
