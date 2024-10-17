package linkedList;

import java.io.IOException;

public class Pause {
    public static void waitForAnyKey() {
        System.out.println("Press any key to continue...");
        try {
            System.in.read(); // 사용자로부터 입력이 있을 때까지 기다립니다.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
