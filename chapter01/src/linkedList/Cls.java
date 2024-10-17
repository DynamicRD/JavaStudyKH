package linkedList;

import java.io.IOException;

public class Cls {
	public static void clearConsole() {
        try {
            String os = System.getProperty("os.name");
            if (os.startsWith("Windows")) {
                // Windows에서 cls 명령어 실행
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Unix 계열에서 ANSI 이스케이프 코드 사용
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
