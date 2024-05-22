

import java.util.Scanner;

public class Test_24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int T = sc.nextInt();
		
		for(int i =1; i<=T; i++) {
			
			int P = sc.nextInt(); //리터당 요금
			int Q = sc.nextInt(); //기본 요금
			int R = sc.nextInt(); //기준 요금
			int S = sc.nextInt(); //초과
			int W = sc.nextInt(); //수도 사용량 
			
			
			int A = W * P; //A사
			int B = 0;
			
			if(W <= R) {
				B = Q;
			}
			else {
				B = Q+(W-R)*S;
			}
			
			if(A< B) {
				System.out.println("#"+i+" "+A);
			}
			else {
				System.out.println("#"+i+" "+B);
			}
			
		}
		
		
		
		
	}
}
