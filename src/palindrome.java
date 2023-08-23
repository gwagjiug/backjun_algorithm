import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        StringBuilder sb = new StringBuilder(A);

        if(A.equals(sb.reverse().toString())){
            System.out.print(1);
        }
        else {
            System.out.print(0);
        }

    }
}
