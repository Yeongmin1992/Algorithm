package chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 가우스의 덧셈 방법을 이용하여 1 부터 n까지의 정수 합 구하기
public class Q8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("숫자를 입력하세요 : ");
        int n = Integer.parseInt(br.readLine());

        int sum = (n * (1 + n))/2;

        System.out.println(sum);
    }

}
