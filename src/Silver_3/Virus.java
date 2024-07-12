package Silver_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Virus {
    static boolean  [] visited;
    static int N,M;
    private static ArrayList<Integer>[] lists;
    static int cnt;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        visited = new boolean[N+1];
        lists = new ArrayList[N+1];


        for(int i=0; i<=N; i++){
            lists[i] = new ArrayList<Integer>();
        }


        for(int i = 1; i<= M; i++){
            st = new StringTokenizer(br.readLine());

            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());

            lists[v1].add(v2);
            lists[v2].add(v1);

        }

        dfs(1);

        System.out.println(cnt);

    }

    private static void dfs(int x) {
        visited[x] = true;

        for (int y : lists[x]) {  // 인접 노드를 직접 탐색
            if (!visited[y]) {
                cnt++;
                dfs(y);
            }
        }
    }
}

/*1 true
* 2 ++ true
* 3 ++ true
* 5 ++ true
* 2건너뜀
* 6 ++ true
* */
