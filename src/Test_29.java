

import java.util.Scanner;

public class Test_29 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		int T = sc.nextInt();
		
		for(int i=1; i<=T; i++) {
			
			int N = sc.nextInt();
			String str = sc.next();
			
			if(N % 2 == 0) {
				String first = str.substring(0,N/2);
				String second = str.substring(N/2);
				
				
				if(first.equals(second)) {
					System.out.println("#"+i+" "+"Yes");
				}
				else {
					System.out.println("#"+i+" "+"No");

				}
				
				
			}
			else {
				System.out.println("#"+i+" "+"No");

			}
			
		
		}
		
		
	}
	
	

}
