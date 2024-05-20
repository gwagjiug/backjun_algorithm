

import java.util.Scanner;

public class Test_20 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		
		
		for(int j = 0; j<T; j++) {
			
			int sum =0;
			
			int N = sc.nextInt();
			
			for(int i=1; i<=N; i++) {
				
				if(i % 2 ==0) {
					sum -= i;
				}
				else if(i%2 != 0) {
					sum += i;
				}
				
			}
			
			System.out.println("#"+(j+1)+" "+sum);
			
			
		}
		

		
		
	}
}
