package BackTracking;

import java.util.Scanner;

public class NM_1 {

    private static int n,r;
    private static int arr[];
    private static boolean [] visited;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         n = sc.nextInt();
         r = sc.nextInt();


        arr = new int[r];
        visited = new boolean[n+1];

        permutation(0);



    }

    private static void permutation(int cnt) {

        if(cnt == r){
            for(int val : arr){
                System.out.print(val + " ");

            }
            System.out.println();
            return;
        }

        for(int i = 1; i<=n; i++){
            if(visited[i] == false){
                visited[i] = true;
                arr[cnt] = i;
                permutation(cnt + 1);
                visited[i] =false;
            }
        }

    }
}
