import java.util.Scanner;

public class Find_PrimeNumber_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean primeNo;
        int cnt = 0;

        int N = sc.nextInt();

        int prime[] = new int[N];

        for (int i = 0; i < prime.length; i++) {
            primeNo = true; // 각 숫자마다 primeNo를 초기화해야 함
            prime[i] = sc.nextInt();
            if (prime[i] == 1) {
                primeNo = false; // 1은 소수가 아님
            } else {
                for (int j = 2; j <= Math.sqrt(prime[i]); j++) {
                    if (prime[i] % j == 0) {
                        primeNo = false;
                        break;
                    }
                }
            }

            if (primeNo) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
