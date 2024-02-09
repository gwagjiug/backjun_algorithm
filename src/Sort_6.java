import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sort_6 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int [][] arr = new int[N][2];

        StringTokenizer st;

        //두 번째 원소를 기준으로 오름차순으로 정렬 , 두 번째 원소가 같을 경우 첫 번째 원소를 오름차순 정렬

        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][0] = Integer.parseInt(st.nextToken()); //공백() 으로 구분
        }

        //0 4 를 입력할 경우
        // arr[0][1] = 0

        Arrays.sort(arr,(e1,e2)->{
            if (e1[0] == e2[0]) {
                return e1[1] - e2[1];
            }else {
                return e1[0] - e2[0];
            }
        });



        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i< N ; i++) {
            sb.append(arr[i][1] + " " + arr[i][0]).append('\n');
        }
        System.out.println(sb);

    }
}
