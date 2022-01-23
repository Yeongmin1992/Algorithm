package chap2;

// 변환한 기수의 자리수
public class CardConvRev {

    static int cardConvR(int x, int r) {
        int digits = 0;
        char[] d = {};
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);
    return digits;
    }

    public static void main(String[] args) {
        System.out.println(CardConvRev.cardConvR(59, 16));
    }
}


