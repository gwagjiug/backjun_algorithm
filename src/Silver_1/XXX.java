package Silver_1;

import java.util.Scanner;

public class XXX {
    public static void main(String[] args) {
        //백준 1629번


        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        long sum = 0;

        for(int i = 0; i<B; i++){
            sum *= A;
        }

        System.out.println(sum%3);

    }
}
