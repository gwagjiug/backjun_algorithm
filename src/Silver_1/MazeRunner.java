package Silver_1;

import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MazeRunner {

    //단계 1 받아 줄 값 세팅하기
    static int n,m ;
    //미로의 행,열 크기
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0}; //x방향 상하좌우
    static int[] dy = {0,0,-1,1}; //y방향 상하좌우
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][m];
        
        visited = new boolean[n][m];
        
        sc.nextLine(); //버퍼 비워주기

        for(int i = 0; i<n; i++){
            String line = sc.next(); //값을 한 줄로 받아옴
            for(int j =0; j<m; j++){
                arr[i][j] = line.charAt(j) - '0';//아스키코드 정수로 변환
            }
        }
        visited = new boolean[n][m];
        visited[0][0] = true;
        bfs(0,0);//시작위치
        System.out.println(arr[n-1][m-1]);

    }

    private static void bfs(int x, int y) {
        Queue<int []> q = new LinkedList<>();
        //큐 생성
        q.add(new int[] {x,y}); //시작점 추가 [0,0]
        while(!q.isEmpty()){ //큐가 빌 때 까지 좌표를 꺼냄
            int now [] = q.poll(); //현재 좌표를 큐에서 꺼냄
            int nowX = now[0];//[0]
            int nowY = now[1];//[0]


            for(int i = 0; i<4; i++){ //4방향 이동
                int nextX = nowX + dx[i]; //
                int nextY = nowY + dy[i];


                if(nextX < 0 || nextY < 0 || nextX >= n || nextY >= m) //미로의 범위를 벗어나는지 확인
                    continue; //벗어난다면 반복 건너뛰고 다음 방향 탐색
                if(visited[nextX][nextY] || arr[nextX][nextY] == 0) //이미 방문했거나, 벽이 있는지 확인
                    continue;
                q.add(new int[] {nextX,nextY});
                arr[nextX][nextY] = arr[nowX][nowY] +1;
                visited[nextX][nextY] =true;
            }

        }
    }


}
