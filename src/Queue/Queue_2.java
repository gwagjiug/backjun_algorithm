package Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Queue_2 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        Deque<Integer> Dq = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer command;

        while(N--> 0){
            command = new StringTokenizer(br.readLine()," "); //문자열 분리

            switch (command.nextToken()){
                case "push":
                    Dq.offer(Integer.parseInt(command.nextToken()));
                    break;

                case "pop":
                    Integer item = Dq.poll();
                    if (item == null){
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(item).append('\n');
                    }
                    break;
                case "size":
                    sb.append(Dq.size()).append('\n');
                    break;
                case "empty":
                    if(Dq.isEmpty()) {
                        sb.append(1).append('\n');
                    }
                    else {
                        sb.append(0).append('\n');
                    }
                    break;
                case "front":
                    // peek()은 큐에 꺼낼 요소가 없을 경우 null을 반환한다.
                    Integer ite = Dq.peek();
                    if(ite == null) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(ite).append('\n');
                    }
                    break;

                case "back":
                    // peekLast()은 큐에 꺼낼 요소가 없을 경우 null을 반환한다.
                    Integer it = Dq.peekLast();
                    if(it == null) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(it).append('\n');
                    }
                    break;
            }
        }
        System.out.println(sb);
    }


    }


