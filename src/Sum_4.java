import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sum_4 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int arr[] = new int[N +1 ];

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());

        arr[0] = 0;

        for (int i = 1; i<=N; i++){
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            sb.append(arr[end] - arr[start - 1]).append("\n");
        }
        System.out.println(sb);



    }
}
