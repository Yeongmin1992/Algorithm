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

    // 꼬리 재귀 제거(위와 동일 함수)
    static void recur2(int n) {
        if (n > 0) {
            recur(n - 1);
            System.out.println(n);
            n = n - 2;
        }
    }

    // 재귀의 비재귀적 표현
    static void recur3(int n) {
        IntStack s = new IntStack(n);

        while (true) {
            if (n > 0) {
                s.push(n);      // n의 값을 푸시
                n = n - 1;
                continue;
            }

            if (s.isEmpty() != true) {      // 스택이 비어있지 않다면
                n = s.pop();
                System.out.println(n);
                n = n - 2;
                continue;
            }
            break;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수를 입력하세요. : ");
        int x = stdIn.nextInt();

        recur(x);
    }
}