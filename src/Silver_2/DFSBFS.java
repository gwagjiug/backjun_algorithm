package Silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DFSBFS {
    public static ArrayList<Integer>[] graph;
    public static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N+1];

        for(int i = 1; i<=N; i++){
            graph[i] = new ArrayList<>();
        }

        //간선 입력

        for(int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph[u].add(v);
            graph[v].add(u);
        }

        for(int i =1; i<=N; i++){
            Collections.sort(graph[i]);
        }
        //각 정점의 인접 리스트를 오름차순으로 정렬

        //dfs

        visited = new boolean[N+1];
        StringBuilder dfsResult = new StringBuilder();
        dfs(V,dfsResult);
        System.out.println(dfsResult);

        //bfs
        visited = new boolean[N+1];
        StringBuilder bfsResult = new StringBuilder();
        bfs(V,bfsResult);
        System.out.println(bfsResult);




    }

    private static void bfs(int start, StringBuilder result) {
        Queue<Integer> queue  = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        while(!queue.isEmpty()){
            int v = queue.poll();
            result.append(v).append(" ");
            for(int neighbor : graph[v]){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }


        }

    }

    private static void dfs(int v, StringBuilder result) {
        visited[v] = true;
        result.append(v).append(" ");
        for(int neighbor : graph[v]){
            if(!visited[neighbor]){
                dfs(neighbor,result);
            }
        }

    }
}
