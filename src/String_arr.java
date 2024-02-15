import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class String_arr {
    public static void main(String[] args) throws IOException {

        //N 개의 문자열이 주어지고 이후에 주어지는 m 개의 문자열 중에 몇 개가 n과 겹치는지 출력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String,Integer> map = new HashMap<>();

        for(int i = 0; i<N; i++){
            map.put(br.readLine(), 0);
        }

        int count = 0;

        for (int i = 0; i<M; i++){
            if (map.containsKey(br.readLine())) count++;
        }

        System.out.println(count);


    }
}
