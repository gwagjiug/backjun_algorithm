import java.util.Scanner;

public class Pcce_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = c*c - a*a;

        //기존 int b_square = c - a; 로 되어있던 코드를 c의제곱 - a의 제곱으로 수정함


        System.out.println(b_square);
    }
}

