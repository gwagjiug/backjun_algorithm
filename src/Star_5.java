

import java.util.Scanner;

public class Star_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        //5줄에 걸쳐서 1,3,5,7
        //4,3,2,1
        //i가 0일때 j가4번

        for(int i=1; i<=N; i++){
            for(int j=1; j<=N-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
