package Silver_2;

import java.io.*;
import java.util.*;

public class DFS_1 {
    public static ArrayList<Integer>[] graph;
    public static boolean[] visited;
    static int[] order;
    static int count = 1;

    //백준 24479번

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        order = new int[N + 1];
        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int U = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            graph[U].add(V);
            graph[V].add(U);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        dfs(R);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 1; i <= N; i++) {
            bw.write(order[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void dfs(int x) {
        visited[x] = true;
        order[x] = count++;

        for (int y : graph[x]) {
            if (!visited[y]) {
                dfs(y);
            }
        }
    }
}
