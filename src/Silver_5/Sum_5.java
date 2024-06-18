package Silver_5;

import java.util.Scanner;

public class Sum_5 {
    public static void main(String[] args) {

        //백준 2018번
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for(int i = 1; i<=n; i++){
            int sum =0;
            for(int j =i; j<=n; j++){
                sum += j;
                if(sum > n) break;
                else if (sum == n) {
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);


    }
}
