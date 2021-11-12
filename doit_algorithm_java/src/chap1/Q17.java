package chap1;

import java.util.Scanner;

// 오른쪽과 같이 아래를 향한 n단의 숫자 피라미드를 출력하는 메서드를 작성하세요.
public class Q17 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();

        for(int i = 1; i <= n; i++) {
            int max = (n-1)*2+1;
            int cnt = (i-1)*2+1;
            int space = (max-cnt)/2;
            while(space > 0) {
                System.out.print(" ");
                space -= 1;
            }

            while(cnt > 0) {
                System.out.print(i % 10);
                cnt -= 1;
            }

            System.out.println();
        }
    }
}
