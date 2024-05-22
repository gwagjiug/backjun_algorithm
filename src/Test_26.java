

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test_26 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		int T = sc.nextInt();
		
		for(int i = 1; i<=T; i++) {
			int N = sc.nextInt();
			
			
			Set<Character> seenDigits = new HashSet<>();
			
			int k = 0;
			
			while(seenDigits.size()<10) {
				k++;
				
				int currentNumber = k*N;
				
				//k*N 한 숫자를 문자열 -> char 배열로 변환시켜 digit 배열에 저장 (한 글자씩)
				//그 이후 digits 배열에 저장된 숫자를 하나씩 seendigits 라는 HashSet에 저장 (HashSet은 중복 허용안함)
				
				
				char [] digits = String.valueOf(currentNumber).toCharArray();
				
				for (char digit : digits) {
					
					seenDigits.add(digit);
					
				}
				
			}
			System.out.println("#" + i + " " + (k*N));
			
		}
		
		
		
		
	}
	


}

