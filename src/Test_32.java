

import java.util.Scanner;

public class Test_32 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=1; i<=T; i++) {
			
			int time = sc.nextInt();
			int minute = sc.nextInt();
			
			int time_two = sc.nextInt();
			int minute_two = sc.nextInt();
			
			int result_time = time+time_two;
			int result_minute = minute + minute_two;
			
			if(result_time >= 13) {
				result_time = result_time -12;
			}
			if(result_minute == 60) {
				result_time = result_time +1;
				result_minute = 0;
			}
			if(result_minute > 60) {
				result_time = result_time +1;
				result_minute = result_minute - 60; 
				
			}
			
			System.out.println("#" + i+" "+result_time+" "+result_minute);
			
		}
		
		
		
	}

}
