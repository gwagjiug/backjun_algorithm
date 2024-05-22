

import java.util.Arrays;
import java.util.Scanner;

public class Test_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		int arr[] = new int[10];
		int max[] = new int[T];
		
		for(int i=0; i<T; i++) {
			
			for(int j=0; j<10; j++) {
				arr[j] = sc.nextInt();
				
			}
			Arrays.sort(arr);
			System.out.println("#"+(i+1)+" "+arr[9]);
			
		}
		
		
		
		
	}
	
	
}
