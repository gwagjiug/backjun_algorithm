

import java.util.Scanner;

public class Test_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A < B) {
				System.out.println("#"+(i+1)+" "+"<");
			}
			else if(A==B) {
				System.out.println("#"+(i+1)+" "+"=");
			}
			else {
				System.out.println("#"+(i+1)+" "+">");

			}
			
			
		}
		
	}
}
