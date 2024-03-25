import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Queue_2_1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> Dq = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer command;

        while (N-- > 0) {
            command = new StringTokenizer(br.readLine(), " "); // 문자열 분리

            switch (command.nextToken()) {
                case "push":
                    Dq.offer(Integer.parseInt(command.nextToken()));
                    break;

                case "pop":

                    sb.append(Dq.isEmpty() ? -1 : sb.append(Dq.pop()).append('\n'));
                    break;

                case "size":
                    sb.append(Dq.size()).append('\n');
                    break;

                case "empty":
                    sb.append(Dq.isEmpty() ? 1 : 0).append('\n');
                    break;

                case "front":
                    sb.append(Dq.isEmpty() ? -1 : Dq.peek()).append('\n');
                    break;

                case "back":
                    sb.append(Dq.isEmpty() ? -1 : Dq.peekLast()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
}
