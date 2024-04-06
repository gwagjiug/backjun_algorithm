package Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Dqueue_2 {
    public static void main(String[] args) throws IOException {
        Deque<Integer> dq = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;

        while (N --> 0){
            st = new StringTokenizer(br.readLine()," ");

            switch (st.nextToken()){
                case "1":
                    dq.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "2":
                    dq.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "3":
                    if (!dq.isEmpty()){
                        sb.append(dq.removeFirst()).append('\n');
                        break;
                    }else {
                        sb.append("-1").append('\n');
                        break;
                    }
                case"4":
                    if (!dq.isEmpty()){
                        sb.append(dq.removeLast()).append('\n');
                        break;
                    }
                    else {
                        sb.append("-1").append('\n');
                        break;
                    }
                case"5":
                    sb.append(dq.size()).append('\n');
                    break;
                case"6":
                    if (dq.isEmpty()){
                        sb.append(1).append('\n');
                        break;
                    }else {
                        sb.append(0).append('\n');
                        break;
                    }
                case"7":
                    if (!dq.isEmpty()){
                        sb.append(dq.peekFirst()).append('\n');
                        break;
                    }
                    else {
                        sb.append(-1).append('\n');
                        break;
                    }
                case"8":
                    if (!dq.isEmpty()){
                        sb.append(dq.peekLast()).append('\n');
                        break;
                    }
                    else {
                        sb.append(-1).append('\n');
                        break;
                    }

            }



        }
        System.out.println(sb);

    }
}
