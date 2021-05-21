package elementary_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hive_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int com = 1;

        for(int i = 0; i < 166666667; i++) {
            com += i*6;
            if(com >= num) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
