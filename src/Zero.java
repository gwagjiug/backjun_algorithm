import java.util.Scanner;
import java.util.Stack;

public class Zero {
    public static void main(String[] args) {

        //0을 입력받으면 최근에 입력받았던 수를 지우면 된다.


        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<Integer>();

        int K = sc.nextInt();

        int sum = 0;

        for(int i = 0; i<K; i++){
            int num = sc.nextInt();

            if (num == 0){
                stack.pop();
            }
            else {
                stack.add(num);
            }



        }

        for (int zero : stack){
            sum += zero;
        }

        System.out.println(sum);

    }
}
