import java.util.Scanner;

public class Arithmetic_Sequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int result = 1;
        int hang = 1;

        if(N ==1){
            System.out.println("1");
        }

        for(int i = 1; i<= N; i++){
            result = hang + 2; //
            hang = i;
        }

    }
}
