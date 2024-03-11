import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Stack_2_1 {

    static LinkedList<Integer> stack = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        int N = Integer.parseInt(br.readLine());

        while(N --> 0){
            solution(br.readLine());
        }

        br.close();

        System.out.println(sb);


    }

    private static void solution(String query) {
        char c = query.charAt(0); //첫번째 문자는 명령어

        switch (c){
            //substring(2)를 한 이유는 공백도 문자로 포함하기 때문에 입력을 1 3 이런식으로 하기 때문에 사용자가 입력을 원하는 x번의 인덱스는 2이다.

            case '1' :stack.push(Integer.parseInt(query.substring(2))); return;
            case '2' : sb.append(stack.isEmpty()? - 1 : stack.pop()).append("\n");return;
            case '3' : sb.append(stack.size()).append("\n"); return;
            case '4' :sb.append(stack.isEmpty() ? 1 : 0).append("\n");return;
            case '5' : sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");return; //정수가 있을때 맨위의 정수를 출력하는 것
            default: break;
        }


    }
}
