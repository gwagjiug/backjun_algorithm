

import java.util.Scanner;

public class Test_25 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=1; i<=T; i++) {
			
			String str = sc.next();
			String str2 ="";
			
			char c []  = new char[str.length()];
			
			for(int k = 0; k<str.length(); k++) {
				c[k] = str.charAt(k);
				
			}
			
			for(int j = str.length()-1; j>=0 ; j--) {
				str2 += c[j];
			}
			
			if(str.equals(str2)) {
				System.out.println("#"+i+" "+ 1);
				
			}
			else {
				System.out.println("#"+i+" "+ 0);
				
			}
			
			//length = 5 
			// 0 1 2 3 4 
			
		}
		
		
	}

}
