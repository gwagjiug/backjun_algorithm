

import java.util.Scanner;

public class Test_28 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		int T = sc.nextInt();
		
		for(int i = 1; i<=T; i++) {
			
	
			int N = sc.nextInt();
			int result = N/3;
			
			System.out.println("#"+i+" "+ result);
			
		}
		
		
	}

}
