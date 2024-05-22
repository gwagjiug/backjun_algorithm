

import java.util.Scanner;

public class Test_3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		//
		
		int arr[] = new int[10];
		float sum[] = new float[T];
		
		for(int i =0; i<T; i++) {
			
			for(int j=0; j<10; j++) {
				arr[j] = sc.nextInt();
				sum[i] += arr[j];
			}
			
		}
		
		for(int i=0; i<T; i++) {
			sum[i] = sum[i]/10;
			System.out.print("#"+(i+1));
			System.out.println(String.format(" "+"%.0f",sum[i]));
		}
		
	}

}
