package Silver_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Graph_Count {

    public static ArrayList<Integer>[] graph;
    public static boolean[] visited;

    //백준 11724

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        // 초기화
        visited = new boolean[N + 1];
        graph = new ArrayList[N + 1];

        for (int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            int G = sc.nextInt();
            int A = sc.nextInt();

            graph[G].add(A);
            graph[A].add(G); // 무방향 그래프를 위해 반대 방향도 추가
        }

        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }

        System.out.println(count);
    }

    private static void dfs(int x) {
        visited[x] = true;

        for (int i = 0; i < graph[x].size(); i++) {
            int y = graph[x].get(i);
            if (!visited[y]) {
                dfs(y);
            }
        }
    }
}
