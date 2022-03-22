package chap04;

import java.util.Scanner;

public class IntQueueTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntQueue s = new IntQueue(64);      // 최대 64개를 인큐할 수 있는 큐

        while (true) {
            System.out.println("현재 데이터 수 : " + s.size() + " / " + s.capacity());
        }
    }
}
