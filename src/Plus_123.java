import java.util.Scanner;

public class Plus_123 {
    public static void main(String[] args) {


        //9095번

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        // 4 =  1 + 2 + 4 -> 7
        // 5 =  7 + 4 + 2 -> 13

        for(int t = 0; t<T; t++){

            int N =sc.nextInt();
            int dp []  = new int[11];

            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            for(int i =4; i<= N; i++){ //i의 최솟값은 4임 dp를 이용하기 때문에 가장 작은 dp[4]의 값을 저장하고 N까지 가면서 값을 계산

                dp[i] = dp[i-1] + dp[i-2] +dp[i-3];

            }

            System.out.println(dp[N]);



           /* 즉, dp[4] 는 결국 dp[3] + dp[2] + dp[1]을 더한 것과 같다.여기서 얻을 수 있는 점화식은
        dp[n] = dp[n-1] + dp[n-2] + dp[n-1] 이 된다.점화식을 얻었으니 이를 이용하여 dp의 값들을 구할 수 있다.*/

        }

    }
}
