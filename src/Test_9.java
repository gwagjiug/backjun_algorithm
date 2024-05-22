

import java.util.Scanner;

public class Test_9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String T = sc.next();
		
		char c [] = new char[26];
		
		for(int i=0; i<c.length; i++) {
			c[i] = T.charAt(i);
			
		}
		
		for(int i=0; i<c.length; i++) {
		System.out.print(c[i]-'A'+1+" ");
			
		}
		
	
		
		
	}
}
