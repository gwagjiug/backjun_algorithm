package BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NM_3 {
    private static int N,M;
    private static int [] arr;
    private static StringBuilder sb = new StringBuilder();
    /*출력 횟수 sysout을 자주 호출하지 않기 위해 StringBuilder 사용*/

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());



        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr  = new int[M];

        NM(0);
        System.out.println(sb.toString());

    }

    private static void NM(int cnt) {

        if(cnt == M){
            for(int val : arr){
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 1; i<=N; i++){
            arr[cnt] = i;
            NM(cnt +1);
        }

    }
}
