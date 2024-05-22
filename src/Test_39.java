

import java.util.Scanner;

public class Test_39 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt(); 
		
		for(int t =1; t<= testCase; t++) {
			int N = sc.nextInt();
			
			int arr[][] = new int [N][N];
			
			for(int i = 0; i<N; i++) {
				String row = sc.next();
				for(int j = 0; j<N; j++) {
					arr[i][j] = row.charAt(j) - '0';
				}
			}
			
			// 3/2
			//start = 1 - 0
			//end = 1 + 0
			// 1부터 1까지 더하고 i가 커졌기 때문에 range ++  0,1
			
			//다시 start = 1 - 1
			//    end =  1 + 1
			
			// i가 1일때 1부터 2까지 두번 동안 1,1 -> 1,2 더하고 
		
			
		}//1
		
		
	}
}
