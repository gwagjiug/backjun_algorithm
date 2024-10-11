package Gold_5;

import javax.xml.soap.Node;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HideAndSeek {
    //진행되는 연산은 3종류 +1,-1,*2 이다 이때 연산 순서도 중요함
    static int min = Integer.MAX_VALUE;
    static int n,k;
    static boolean[] visited;
    static int max = 100000; //수빈이가 이동할 수 있는 최대위치
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        visited = new boolean[max+1]; //위치 범위는 0~10000
        bfs();
        System.out.println(min);


    }

    private static void bfs() {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(n,0)); //수빈이의 초기 위치와 시간(0)을 큐에 넣음
        while(!q.isEmpty()) {
            Node node = q.poll(); //현재위치를 node로 꺼내고 그 위치를 방문한 것으로 처리
            visited[node.x] = true;
            if(node.x == k) min = Math.min(min, node.time); //현재 위치가 동생의 위치 k와 같으면 최소시간 갱신

            if(node.x * 2 <= max && visited[node.x * 2] == false) q.offer(new Node(node.x * 2, node.time));
            if(node.x + 1 <= max && visited[node.x + 1] == false) q.offer(new Node(node.x + 1, node.time + 1));
            if(node.x - 1 >= 0 && visited[node.x - 1] == false) q.offer(new Node(node.x - 1, node.time + 1));
        }
    }
    public static class Node{
        int x;
        int time;
        public Node(int x, int time){
            this.x  = x;
            this.time  = time;
        }
    }
}
