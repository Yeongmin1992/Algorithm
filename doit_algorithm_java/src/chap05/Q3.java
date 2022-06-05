package chap05;

// 배열 a의 모든 요소의 최대공약수를 구하는 다음 메서드를 작성하세요
public class Q3 {

    static int gcd(int x, int y) {
        if (y == 0)
            return x;
        else
            return gcd(y, x % y);
    }

    static int gcdArray(int[] a) {
        int now_gcd = 0;
        // 배열 길이가 2미만일 때 오류처리 추가
        // 여기에 배열길이 2인 경우와 2 초과인 경우만 분기
        for (int i = 2; i < a.length; i ++) {
            now_gcd = gcd(a[0], a[1]);
            now_gcd = gcd(now_gcd, a[i]);
        }
        return now_gcd;
    }

    public static void main(String[] args) {
        System.out.println(gcdArray(new int[] {4, 8, 16}));
    }
}
