

import java.util.Scanner;
import java.io.FileInputStream;

public class Test_2 {
	
	public static void main(String args[]) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		
		int arr [] = new int [10];
		int sum [] = new int [T];
	
		
		for(int i = 0; i<T; i++) {
			
			for(int j=0; j<10; j++) {
				
				arr[j] = sc.nextInt();
				
				if(arr[j] % 2 !=0) {
					sum[i] += arr[j];
				}
				
			}
			


		}
		
		for(int j=0; j<T; j++) {
			System.out.println("#"+ (j+1) +" "+sum[j]);
		}
		
		
		
		
		
	}

}
