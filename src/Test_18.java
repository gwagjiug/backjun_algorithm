

import java.util.Scanner;

public class Test_18 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int T = sc.nextInt();
		
		
		
		
		for(int i =0; i<T; i++) {
			
			int N = sc.nextInt();
			int arr[] = new int[N];
			long answer = 0;
			
			for(int j =0; j<arr.length; j++) {
				arr[j] = sc.nextInt();			
			}
			
			int max = arr[N-1];
			
			for(int k = N-2; k>= 0; k--	) {
				if(arr[k] > max) {
					max = arr[k];
				}
				else {
					answer += max- arr[k];
				}
							
			}
			
			System.out.println("#"+(i+1)+" "+ answer);
			
			
		}
		
		
		
	}

}
