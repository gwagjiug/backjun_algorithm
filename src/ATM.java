import java.util.Arrays;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();

        int arr[] = new int[N];

        int sum = 0;
        int prev = 0;


        for (int i =0; i<N;i++){
            arr[i] = sc.nextInt();

        }

        Arrays.sort(arr);

/*        for (int i =0; i<N;i++){

            for (int j =0; j<=i;j++){
                sum += arr[j];

            }

        }*/

        for(int i = 0; i < N; i++) {
            // 이전까지의 대기시간과 현재 사람이 걸리는 시간을 더해준다.
            sum += prev + arr[i];

            // 이전까지의 누적합에 현재 걸리는 시간을 더해준다.
            prev += arr[i];
        }


        System.out.println(sum);


    }

}
