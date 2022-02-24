package chap03;

import java.util.Scanner;

// 요솟수가 n인 배열 a에서 key와 일치하는 모든 요소의 인덱스 배열 idx의 맨 앞부터
// 순서대로 저장하고, 일치한 요솟수를 반환하는 메서드 작성
public class Q3 {

    static int searchIdx(int[] a, int n, int key, int[] idx) {
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if (a[i] == key)
                idx[cnt++] = i;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];     // 요솟수 num인 배열
        int[] y = new int[num];     // 요솟수 num인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("찾는 값 : ");    // 키 값을 입력 받음
        int ky = stdIn.nextInt();

        int counnt = searchIdx(x, num, ky, y);

        if (count == 0)
            System.out.println("그 값의 요소가 없습니다.");
        else
            for (int i = 0; i < count; i++)
                System.out.println("그 값은 " + "x[" + y[i] + "]에 있습니다.");
    }
}