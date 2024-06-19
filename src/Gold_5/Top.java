package Gold_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Top {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Stack<int[]> stack = new Stack<>();

        //백준 2493

        //6 9 5 7

        //1 일때 2일 때
        //0 출력 0 출력

        for(int i =1; i<=n; i++){

            int top = Integer.parseInt(st.nextToken()); //6 , 9  ,5
            while(!stack.isEmpty()){
                if(stack.peek()[1] >= top){ //
                    System.out.print(stack.peek()[0] + " ");
                    break;
                }
                stack.pop(); // 6 pop
            }
            if(stack.isEmpty()){
                System.out.print("0 "); //0출력하고
            }
            stack.push(new int [] {i, top}); //1,6 ->


        }

    }
}
