package chap05;

public class EightQueen {
    static boolean[] flag_a = new boolean[8];   // 각 행에 퀸을 배치했는지 체크
    static boolean[] flag_b = new boolean[15];  // 우상향 대각선 방향으로 퀸을 배치했는지 체크
    static boolean[] flag_c = new boolean[15];  // 우하향 대각선 방향으로 퀸을 배치했는지 체크
    static int[] pos = new int[8];
}
