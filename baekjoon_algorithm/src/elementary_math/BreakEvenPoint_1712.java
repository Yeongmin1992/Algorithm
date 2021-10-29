package elementary_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BreakEvenPoint_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int fixed_cost = Integer.parseInt(st.nextToken());
        int variable_cost = Integer.parseInt(st.nextToken());
        int price = Integer.parseInt(st.nextToken());

        // 가변비용보다 작은 경우 손익분기점에 도달할 수 없기 때문에, -1 리턴
        if(variable_cost >= price) {
            System.out.println(-1);
        } else{
            System.out.println(fixed_cost / (price - variable_cost) + 1);
        }
    }
}
