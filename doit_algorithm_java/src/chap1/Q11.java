package chap1;

import java.util.Scanner;

// 양의 정수를 입력하고 자릿수를 출력하는 프로그램 작성
public class Q11 {

    public static void main(String[] args) {
        Scanner stdInt = new Scanner(System.in);
        int num = stdInt.nextInt();
        int cnt = 0;

        do {
            num = num / 10;
            cnt += 1;
        } while (num >= 1);

        System.out.println("그 수는 " + cnt + "자리입니다.");

    }
}
