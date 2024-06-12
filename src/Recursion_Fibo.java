import java.util.Scanner;

public class Recursion_Fibo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(fibo(N));

    }

    private static long fibo(int n) {

        if(n == 0){
            return  0;
        } else if (n == 1) {
            return 1;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }


    }
}
