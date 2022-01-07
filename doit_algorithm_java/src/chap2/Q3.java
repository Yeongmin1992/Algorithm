package chap2;

import java.util.Arrays;

// 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드를 작성하세요.
public class Q3 {

    static int sumOf(int[] a) {
        return Arrays.stream(a).sum();
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        System.out.println(sumOf(a));
    }
}