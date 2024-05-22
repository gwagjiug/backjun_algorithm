import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sum_3 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());



        //1 = 0 + 10
        //2 = 10 + 30
        // 3 = 30 + 30

        //1 , 3 입력 -> [3](60) -

        int[] sum = new int[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            sum[i] = sum[i - 1] + Integer.parseInt(st.nextToken());
        }

        //누적합 계산

        /*구간의 합을 구할 때 누적합의 갑을 사용하여 시작 구간 이전의 누적합을 마지막 구간까지의 누적합에서 빼면 구간의 합을 구할 수 있음
        * 3,5 구간의 합은  = 5까지의 누적합  - 3 이전의 누적합 */

        int M = Integer.parseInt(br.readLine());
        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            sb.append(sum[j] - sum[i - 1]).append("\n");
        }

        System.out.println(sb);
    }
}