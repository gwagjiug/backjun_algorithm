

import java.util.Scanner;

public class Test_33 {
	
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
        int[] currency = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

		
		
		for(int i = 1; i<= T; i++) {
			
			int money = sc.nextInt();
			
			int [] count = new int[currency.length];
			
			for(int k = 0; k<currency.length; k++) {
				count[k] = money/currency[k];
				
				money %= currency[k];
			}
			
			System.out.println("#"+i);
			for(int cnt : count) {
				System.out.print(cnt+" ");
			}
			System.out.println();
			
			
		
			
		}
		
		
	}

}
