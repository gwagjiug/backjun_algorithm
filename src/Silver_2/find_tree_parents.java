package Silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class find_tree_parents {

    private static ArrayList<Integer>[] adjList;
    private static int[] parents;
    private static boolean [] visited;

    static int N;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        N = Integer.parseInt(br.readLine());
        parents = new int[N+1];
        visited = new boolean[N+1];
        adjList = new ArrayList[N+1];

        for(int i =1; i<=N; i++){
            adjList[i] = new ArrayList<Integer>();
            //list 초기화
        }

        for(int i = 0; i<N-1; i++){
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());

            adjList[v1].add(v2);
            adjList[v2].add(v1);


        }

        dfs(1);



        for(int i = 2; i<=N; i++){
            System.out.println(parents[i]);
        }



    }

    private static void dfs(int v) {
        visited[v] = true;

        for(int vertex : adjList[v]){
            if(!visited[vertex]){
                parents[vertex] = v;
                dfs(vertex);
            }
        }

    }
}
/*
*
* 1 = true
* 1넘어가고 2
* parent[2] = 1 -> 2의 부모는 1
* dfs(2) */
