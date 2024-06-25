package Silver_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Meeting_Room {
    public static void main(String[] args) {


        //백줕 1931번

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        /*time[][0] 은 시작 지점을 의미
        * time[][1] 은 종료 시점을 의미*/

        int [][] time = new int[N][2];

        for(int i = 0 ; i<N; i++){
            time[i][0] = sc.nextInt(); //시작
            time[i][1] = sc.nextInt(); //종료
        }

        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){
                    return o1[0] - o2[0]; //종료 시간이 같을 경우 시작 시간이 빠른 순으로 정렬
                }
                return o1[1] - o2[1];
            }
        });

        int count =0;
        int prev_end_time = 0;

        for(int i = 0; i<N; i++){
            if (prev_end_time <= time[i][0]){ //직전 종료시간이 다음 회의 시작 시간보다 작거나 같으면 갱신
                prev_end_time = time[i][1];
                count++;
            }
        }

        System.out.println(count);


    }
}
