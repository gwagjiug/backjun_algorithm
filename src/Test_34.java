

import java.util.Scanner;

public class Test_34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        // Days in each month (index 0 is a placeholder to make months 1-based)
        int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for (int i = 1; i <= T; i++) {
            int M = sc.nextInt();
            int D = sc.nextInt();
            
            int M_2 = sc.nextInt();
            int D_2 = sc.nextInt();
            
            int result = 0;
            
            if (M == M_2) {
                result = D_2 - D + 1; //M이 같을 땐 D_2 - D + 1
            } else {
                // Days remaining in the first month
                result = day[M] - D + 1; // 아닐 경우 31 - 5 + 1
                
                // Add days for the months in between
                for (int j = M + 1; j < M_2; j++) {
                    result += day[j]; // 6부터 7까지 day를 더해주고 
                }
                
                // Add days in the last month
                result += D_2; //마지막 달의 D_2를 더해준다
            }
            
            System.out.println("#" + i + " " + result);
        }
        
        sc.close();
    }
}
