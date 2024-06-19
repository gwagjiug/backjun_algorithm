import java.util.Scanner;
import java.util.Stack;

public class Makdaegi_Stack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Stack<Integer> stack = new Stack<>();






        for(int i = 0; i<N; i++)    {
            stack.push(sc.nextInt());
        }

        int max = stack.pop();
        int cnt = 1;

        while(!stack.isEmpty()){
            int A = stack.pop();

            if(A > max){
                cnt++;
                max = A;
            }


        }
        System.out.println(cnt);


    }
}
