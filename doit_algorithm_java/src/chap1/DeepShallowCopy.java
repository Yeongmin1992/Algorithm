package chap1;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class DeepShallowCopy {

    public static void main(String[] args) {
        int a = 1;
        int b = a;
        a = 3;

        System.out.print("a = ");
        System.out.println(a);
        System.out.print("b = ");
        System.out.println(b);

        int[] c = {1, 2, 3, 4, 5};
        int[] d = c.clone();

        d[3] = 0;

        System.out.print("c = ");
        Arrays.stream(c).forEach(v -> System.out.print(v));
        System.out.print("\nd = ");
        Arrays.stream(d).forEach(v -> System.out.print(v));
    }

}
