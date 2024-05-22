

import java.util.Scanner;

public class Test_30 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc .nextInt();
		
		String abc = "abcdefghijklmnopqrstuvwxyz";
				
		
		for(int i =1; i<=N; i++) {
			
			String str = sc.next();
			int count = 0;
			
			for(int j = 0; j<str.length(); j++) {
				if(abc.charAt(j) == str.charAt(j)) {
					count ++;
				}
				else {
					break;
				}
				
			}
			System.out.println("#"+i+" "+count);
			
		}
		
	}
	
}
