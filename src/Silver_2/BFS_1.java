package Silver_2;

import java.io.*;
import java.util.*;

public class BFS_1 {

    static boolean [] visited ;
    static int N,M,R;
    static int [] order;
    static int count = 1;
    static ArrayList<Integer> [] graph;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N+1];

        visited = new boolean[N+1];
        order = new int[N+1];


        for(int i = 0; i<=N; i++){
            graph[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine());

            int U = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            graph[U].add(V);
            graph[V].add(U);


        }

        for(int i = 1; i<=N; i++){
            Collections.sort(graph[i]);
        }

        bfs(R);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 1; i<=N; i++){
            bw.write(order[i] + "\n");

        }

        bw.flush();
        bw.close();




    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);
        //현재 노드를 방문처리
        visited[start] = true;
        order[start] = count++;

        while(!queue.isEmpty()){
            int x = queue.poll();
            //큐에서 하나의 원소를 뽑는다.
            for(int i =0; i<graph[x].size(); i++){
                int y = graph[x].get(i);
                if(!visited[y]){
                    queue.offer(y);
                    /*방문 하지 않았다면 큐에 추가하고 true*/
                    visited[y] =true;
                    order[y] = count++;
                }
            }
        }

    }
}
