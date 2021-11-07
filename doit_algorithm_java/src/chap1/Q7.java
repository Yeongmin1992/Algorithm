package chap1;

import java.util.Scanner;

// Q7 n이 7이면 `1 + 2 + 3 + 4 + 5 + 6 + 7 = 28'로 출력하는 프로그램을 작성하세요
public class Q7 {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("1 부터 n까지의 합을 구합니다.");
        System.out.println("n의 값: ");
        int n = stdIn.nextInt();
        String msg = "";

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;

            if (i < n) msg = msg.concat(Integer.toString(i) + " + ");
            else msg = msg.concat(Integer.toString(i));

        }
        System.out.println(msg + " = " + sum);
    }
}
