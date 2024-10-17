package classPractice;

import java.util.Scanner;

public class ChessGame {
    char[][] board = new char[8][8]; // 8x8 체스판
    boolean isWhiteTurn = true; // 턴 관리

    public ChessGame() {
        initializeBoard();
    }

    private void initializeBoard() {
        // 체스판 초기화
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = ' '; // 빈 공간
            }
        }
        // 초기 기물 배치
        String whitePieces = "RNBQKBNR"; // 백 기물
        String blackPieces = "rnbqkbnr"; // 흑 기물
        for (int i = 0; i < 8; i++) {
            board[0][i] = whitePieces.charAt(i);
            board[1][i] = 'P'; // 백 폰
            board[6][i] = 'p'; // 흑 폰
            board[7][i] = blackPieces.charAt(i);
        }
    }

    public void displayBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean movePiece(int startX, int startY, int endX, int endY) {
        char piece = board[startX][startY];
        
        // 기본적인 턴과 기물 확인
        if (piece == ' ' || (isWhiteTurn && Character.isLowerCase(piece)) || (!isWhiteTurn && Character.isUpperCase(piece))) {
            System.out.println("잘못된 이동입니다.");
            return false;
        }

        // 각 기물의 이동 규칙 처리
        if (piece == 'K' || piece == 'k') {
            // 왕의 이동: 1칸 이동
            if (Math.abs(startX - endX) <= 1 && Math.abs(startY - endY) <= 1) {
                return move(startX, startY, endX, endY, piece);
            }
        } else if (piece == 'Q' || piece == 'q') {
            // 여왕의 이동: 가로, 세로, 대각선
            if (startX == endX || startY == endY || Math.abs(startX - endX) == Math.abs(startY - endY)) {
                return move(startX, startY, endX, endY, piece);
            }
        } else if (piece == 'R' || piece == 'r') {
            // 룩의 이동: 가로, 세로
            if (startX == endX || startY == endY) {
                return move(startX, startY, endX, endY, piece);
            }
        } else if (piece == 'B' || piece == 'b') {
            // 비숍의 이동: 대각선
            if (Math.abs(startX - endX) == Math.abs(startY - endY)) {
                return move(startX, startY, endX, endY, piece);
            }
        } else if (piece == 'N' || piece == 'n') {
            // 나이트의 이동: L자 형태
            if ((Math.abs(startX - endX) == 2 && Math.abs(startY - endY) == 1) ||
                (Math.abs(startX - endX) == 1 && Math.abs(startY - endY) == 2)) {
                return move(startX, startY, endX, endY, piece);
            }
        } else if (piece == 'P') {
            // 백 폰의 이동: 직진, 대각선
            if (startX - endX == 1 && startY == endY && board[endX][endY] == ' ') {
                return move(startX, startY, endX, endY, piece);
            }
            if (startX - endX == 1 && Math.abs(startY - endY) == 1 && Character.isLowerCase(board[endX][endY])) {
                return move(startX, startY, endX, endY, piece);
            }
        } else if (piece == 'p') {
            // 흑 폰의 이동: 직진, 대각선
            if (endX - startX == 1 && startY == endY && board[endX][endY] == ' ') {
                return move(startX, startY, endX, endY, piece);
            }
            if (endX - startX == 1 && Math.abs(startY - endY) == 1 && Character.isUpperCase(board[endX][endY])) {
                return move(startX, startY, endX, endY, piece);
            }
        }

        System.out.println("잘못된 이동입니다.");
        return false;
    }

    private boolean move(int startX, int startY, int endX, int endY, char piece) {
        board[endX][endY] = piece;
        board[startX][startY] = ' ';
        isWhiteTurn = !isWhiteTurn;
        return true;
    }

    public static void main(String[] args) {
        ChessGame game = new ChessGame();
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            game.displayBoard();
            System.out.println((game.isWhiteTurn ? "백" : "흑") + " 차례입니다. 이동할 기물의 좌표 (x1 y1)와 목표 좌표 (x2 y2)를 입력하세요:");
            input = scanner.nextLine();
            String[] parts = input.split(" ");
            if (parts.length == 4) {
                int startX = Integer.parseInt(parts[0]);
                int startY = Integer.parseInt(parts[1]);
                int endX = Integer.parseInt(parts[2]);
                int endY = Integer.parseInt(parts[3]);

                if (!game.movePiece(startX, startY, endX, endY)) {
                    System.out.println("이동 실패, 다시 시도하세요.");
                }
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}