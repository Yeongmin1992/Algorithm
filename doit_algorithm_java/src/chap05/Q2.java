package chap05;

// 재귀 메서드 호출을 사용하지 않고 최대공약수 구하기
class Q2 {
    static int gcd(int x, int y) {
        while(true) {
            if (y == 0) {
                return x;
            } else {
                int a = y;
                y = x % y;
                x = a;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(gcd(6, 18));
    }
}
