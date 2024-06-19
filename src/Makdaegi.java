import java.util.Scanner;

public class Makdaegi {
    public static void main(String[] args) {
        //백준 17608

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int arr[] = new int[N];


        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();

        }

        int cnt = 1;
        int max = arr[N-1];

        for (int i = N-2; i>= 0; i--   ){

            if(arr[i] > max){
                cnt++;
                max = arr[i];
            }

        }

        System.out.println(cnt);
    }
}
