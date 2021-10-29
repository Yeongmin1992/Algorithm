package elementary_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FoundFraction_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        if (num == 1) {
            System.out.println("1/1");
        } else {
            // num이 몇 번째 대각선에 있는지 구하기
            int stdr = 0;
            for (int i = 1; i < 4500; i++) {
                stdr += i;
                if (stdr >= num) {
                    stdr = i;
                    break;
                }
            }

            // num이 있는 대각선 이전까지의 합 구하기
            int pre_sum = 0;
            for (int i = 0; i < stdr; i++) {
                pre_sum += i;
            }

            // num이 있는 대각선 위에서 몇 번째에 있는지 구하기
            int cnt = num - pre_sum;

            // 짝수 or 홀수 대각선인지, 몇 번째인지 에 따라 분수 반환환
            if (stdr % 2 == 0) {
                System.out.println(cnt + "/" + (stdr - cnt + 1));
            } else {
                System.out.println((stdr - cnt + 1) + "/" + cnt);
            }
        }
    }
}
