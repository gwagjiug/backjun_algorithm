package BackTracking;

import java.util.Arrays;
import java.util.Scanner;

public class NM_2 {

    private static int N,M;
    private static int arr[];
    private static boolean visited[];
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[M];
        visited = new boolean[N + 1];

        combination(0,1);

    }

    private static void combination(int cnt, int start) {
        if(cnt == M){
            for(int val : arr){
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for(int i = start; i<=N; i++){
            arr[cnt] = i;
            combination(cnt + 1,i +1);
        }


    }
}
