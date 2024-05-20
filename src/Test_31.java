

import java.util.Arrays;
import java.util.Scanner;

public class Test_31 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); //테스트 케이스의 수
		
		for(int i =1; i<=T; i++) {
			
			int N = sc.nextInt(); //수강생의 수
			int K = sc.nextInt(); //과제 제출자 수
			
			int [] submitted = new int[K];
			
			for(int j = 0; j<K; j++) {
				submitted[j] = sc.nextInt(); //낸 사람들 번호
			}
			
			
			for(int k = 1; k<=N; k++) {
				if(Arrays.binarySearch(submitted, k) < 0) {
					System.out.println("#"+i+" "+k);
				}
			}
			
		}
		
		
		
		
		
	}

}
