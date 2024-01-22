import java.util.Scanner;

public class Sum_Divisor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){

            int N = sc.nextInt();

            if(N == -1) break;

            StringBuilder sb = new StringBuilder();

            sb.append(N + " = 1");
            int sum = 1;
            for(int i = 2; i<N; i++){
                if (N % i == 0){
                    sb.append(" + " + i);
                    sum += i;
                }

            }
            if (N == sum) {
                System.out.println(sb);
            }
            else {
                System.out.println(N + " is NOT perfect.");
            }

        }







    }
}
