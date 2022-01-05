package chap2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
// 배열 요소를 역순으로 정렬하는 과정을 하나하나 나타내는 프로그램을 작성하세요.

public class Q2 {

    // 배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
    static void swap(int[] a, int idx1, int idx2) {
        System.out.println("a[" + idx1 + "]과(와) " + "a[" + idx2 + "]를 교환합니다.");
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
        Arrays.stream(a).forEach(v -> System.out.print(v + " "));
        System.out.println();
    }

    // 배열 a의 요소를 역순으로 정렬
    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();   // 요솟수

        int[] x = new int[num];    // 여솟수가 num인 배열

        // 요소수 만큼 돌면서 값 받기
        for (int i = 0; i < num; i++) {
            x[i] = stdIn.nextInt();
        }

        Arrays.stream(x).forEach(v -> System.out.print(v + " "));
        System.out.println();

        reverse(x);    // 배열 a의 요소를 역순으로 정렬

        System.out.println("역순 정렬을 마쳤습니다.");
    }
}
