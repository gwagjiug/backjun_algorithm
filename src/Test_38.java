

import java.util.Scanner;

public class Test_38 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int testCase = 1; testCase <= 10; testCase++) {
			int [][] arr = new int	[100][100];
			
			int caseNumber = sc.nextInt();
			
			
			for(int i = 0; i<100; i++) {
				for(int j = 0; j<100; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			int max = 0;
			
			//각 행의 합 중 최댓 값
			
			for(int i=0; i<100; i++	) {
				int rowSum  = 0;
				
				for(int j = 0; j<100; j++) {
					rowSum += arr[i][j];
				}
				max = Math.max(max, rowSum);
			}
			
			//각 열의 합 중 최댓 값
			//0,0 / 1,0 // 2,0
			
			for(int i=0; i<100; i++) {
				int colSum = 0;
				
				for(int j = 0; j<100; j++) {
					colSum += arr[j][i]; //0일때 0,0 -> 1,0 -> 2,0
				}
				max = Math.max(max, colSum);
			}
			
			int diasum1 = 0;
			
			for(int i =0; i<100; i++) {
				diasum1 += arr[i][i];
			}
			max = Math.max(max, diasum1);

			//부 대각선 
			
			int diasum2 = 0; 
			
			for(int i=0; i<100; i++) {
				diasum2 += arr[i][99-i];
			}
			max = Math.max(max, diasum2);

			//0,4 -> 1,3
			
			System.out.println("#"+testCase+" "+max);
			
		}
		
	
		
	}
	
}
