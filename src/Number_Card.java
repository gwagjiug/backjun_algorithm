import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Number_Card {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine()); // 카드의 개수
        int [] Card = new int [N];


        st = new StringTokenizer(br.readLine());

        for(int i =0; i<N; i++){
            Card[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(Card); //이분 탐색을 위한 배열정렬

        int M = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i<M; i++){
            int tmp = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(Card, N, tmp) + " ");

        }

        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
        br.close();

    }

    public static int binarySearch(int[] cards, int N, int search) {
        int first = 0;
        int last = N - 1;
        int mid = 0;

        while (first <= last) {
            mid = (first + last) / 2; // 중간 인덱스

            if (cards[mid] == search) { // 중간값과 찾으려는 수가 같은 경우
                return 1;
            }

            if (cards[mid] < search) { // 중간값이 찾으려는 수보다 작으면, 그 이하로는 볼 필요 없음.
                first = mid + 1;
            } else { // 중간값이 찾으려는 수보다 크면, 그 이상으로는 볼 필요 없음.
                last = mid - 1;
            }
        }

        return 0;
    }

}




