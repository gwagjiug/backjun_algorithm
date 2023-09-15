import java.util.Scanner;

public class Star_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=1; i<=N; i++){

            for(int j=1; j<i; j++ ){
                System.out.print(" ");
            }
            for(int k=0; k<=N-i;k++){
                System.out.print("*");
            }
            System.out.println();

        }


    }
}
