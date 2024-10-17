package kr.co.khedu.filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithMain {
    public static void main(String[] args) {
        FileReader fr = null;

        try {
            fr = new FileReader("d:\\data.txt");
            // 일기장에 글을 읽는다
            while (true) {
                // 25개를 한번에 읽는다
                char[] char25Array = new char[25];
                int data = fr.read(char25Array);
                
                // 더 이상 읽을 데이터가 없으면 종료
                if (data == -1) {
                    System.out.println("모두 읽었어요.");
                    break;
                }
                
                // 읽은 만큼만 문자열로 만들기
                System.out.print(new String(char25Array, 0, data)); // 수정된 부분
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("data.txt 찾을 수 없습니다.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("입출력 예외 발생.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("예외 발생.");
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                    System.out.println("자원 반납 완료.");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}