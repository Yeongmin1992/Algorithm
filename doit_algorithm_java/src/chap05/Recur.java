package chap05;
// 재귀 호출을 여러 회 실행하는 순수한 재귀를 이해합니다.

import java.util.Scanner;

class Recur {
    // 재귀 함수
    static void recur(int n) {
        if (n > 0) {
            recur(n - 1);
            System.out.println(n);
            recur(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수를 입력하세요. : ");
        int x = stdIn.nextInt();

        recur(x);
    }
}