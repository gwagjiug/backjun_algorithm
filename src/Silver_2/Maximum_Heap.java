package Silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Maximum_Heap {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        /*백준 11279번 최대 힙*/

        for(int i = 0; i<N; i++){

            int now = Integer.parseInt(br.readLine());

            if(now == 0){
                if (priorityQueue.isEmpty())sb.append(0+"\n");
                else sb.append(priorityQueue.poll()+"\n");
            }
            else {
                priorityQueue.add(now);
            }

        }

        System.out.println(sb);

    }
}
