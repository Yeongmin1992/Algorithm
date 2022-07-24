package chap05;

public class QueenBB {
    static boolean[] flag = new boolean[8];     // 각 행에 퀸을 배치했는지 체크
    static int[] pos = new int[8];              // 각 열의 퀸의 위치

    // 각 열의 퀸의 위치를 출력합니다.
    static void print() {
        for (int i = 0; i < 8; i++)
            System.out.printf("%2d". pos[i]);
        System.out.println();
    }
}
