import java.util.Scanner;

public class Find_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = M; i <= N; i++) {
            boolean isPrime = true;

            if (i == 1)
                isPrime = false;

            //1은 소수가 아님

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) { //나누어 떨어지면 소수아님
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                if (min > i) min = i;
                sum += i;
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
