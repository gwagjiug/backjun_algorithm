

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test_40 {
	
	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		int idx = 1;
		
		while(T --> 0) {
			int N = Integer.parseInt(br.readLine());
			
			int [][] map = new int[N][N];
			
			int x = 0, y = 0;
			
			map[x][y] =1;
			int num = 2;
			
			while(num <= N*N) { //오른쪽 , 아래 , 왼쪽 ,위
				while(y+1 < N && map[x][y+1] == 0) {
					y++;
					map[x][y] = num++;
				}
				while(x+1<N && map[x+1][y] == 0) {
					x++;
					map[x][y] = num++;
				}
				while(y-1 >= 0 && map[x][y-1] == 0) { // y-1 이 3보다 크고
					y--;
					map[x][y] = num++;
				}
				while(x-1 >= 0 && map[x-1][y]==0) {
					x--;
					map[x][y] = num++;
				}
			}
			
			
	
			StringBuilder sb = new StringBuilder();
			
			for(int i=0; i<N; i++) {
				for(int j = 0; j<N; j++) {
					sb.append(map[i][j]).append(" ");
				}
				sb.append("\n");
			}
			System.out.printf("#%d\n%s", idx++, sb.toString());
			
		}
		
		
		
	}

}
