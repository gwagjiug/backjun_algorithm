package Silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Minimum_Heap {
    public static void main(String[] args) throws IOException {

        //백준 1927번 최소 힙
        /*배열에 자연수 x를 넣는다
        * 0을 입력할 때 배열에서 가장 작은 값을 출력하고 그 값을 제거한다.
        * 일반적인 큐는 FIFO 구조이지만 우선순위 큐는 들어간 순서에 상관없이 우선순위가 높은 데이터가 먼저 나오는 것을 말함
        * */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        /*PriorityQueue 를 생성하면 최소힙이 구현됨
        *
        * PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
         MaxHeap을 구현하고 싶다면 사용자정의 Comparator를 역순으로 생성하면 됨*/

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<N; i++){
            int now = Integer.parseInt(br.readLine());
            if(now == 0){
                if (priorityQueue.isEmpty())sb.append(0+"\n");
                else sb.append(priorityQueue.poll()+"\n");
            }
            else{
                priorityQueue.add(now);
            }




        }
        System.out.println(sb);


    }
}
