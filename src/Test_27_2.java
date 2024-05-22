

import java.util.Scanner;

public class Test_27_2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // 2
		
		for(int i = 1; i<=T; i++)  { //1부터~ 2랑 같아질때 까지 1,2
			
			int N = sc.nextInt(); // 2를입력 
			int sum = 0;
			
			for(int j=0; j<N; j++) {  //i가 1일때 j는 0부터 1까지 
								
				int time = sc.nextInt();
				int command = sc.nextInt(); 
				
				if(command == 1) {
					sum += 2;
				}
				else if(command == 2) {
					sum += 1;
				}
				else if(command == 0) {
					
				}

			
			
				
			}
			System.out.println("#"+i+" "+ sum);
			
			
		}
		
	}

}
