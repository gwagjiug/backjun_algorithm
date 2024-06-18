package Silver_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Av_Heap {
    public static void main(String[] args) throws IOException {

        //백준 11286번

        /*해당 문제는 우선 원소들을 절댓값을 기준으로 오름차순 정렬을 함 만약 절댓 값이 같다면
        * 실제 값을 기준으로 오름차순 정렬을 함
        * 절댓 값이 달라? 그럼 그냥 절댓값 기준 오름차순*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1) == Math.abs(o2)) return o1-o2;
                //o1 과 o2의 절대값이 같은지 비교 같다면, 실제 값으로 비교하여 순서 결정
                //return o1-o2는 o1이 o2 보다 작으면 음수 같으면 0 크면 양수를 반환하는데 오름차순 정렬을 의미함
                //
                else return Math.abs(o1) - Math.abs(o2);
            }
        });

        /*Math.abs()메서드는 다양한 타입의 숫자에 대해 절댓값을 반환하는 메서드를 제공함*/

        for(int i = 0; i<N; i++){
            int x = Integer.parseInt(br.readLine());

            if(x == 0){
                if(queue.isEmpty()) sb.append(0+"\n");
                else sb.append(queue.poll()).append("\n");
            }
            else{
                queue.add(x);
            }

        }
        System.out.println(sb);






    }
}
