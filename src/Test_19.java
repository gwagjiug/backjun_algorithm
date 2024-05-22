

import java.util.Scanner;

public class Test_19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		
		
		
		for(int i=0; i<N; i++) {
			
			String str = sc.next();
			char first = str.charAt(0);
			char two = str.charAt(1);
			int cnt = 0;
			
			for(int j = 2; j<=str.length(); j++) {
				
				if(str.charAt(j)==first && str.charAt(j+1) == two) {
					cnt = j;
					break;
				}
				
			}
			System.out.println("#"+(i+1)+" "+cnt);
			
			
			
		}
		
		
		
	}

}
