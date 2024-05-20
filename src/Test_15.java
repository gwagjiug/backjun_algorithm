

import java.util.Scanner;

public class Test_15 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str [] = new String[5];
		
		str[0] = "+";
		str[1] = "+";
		str[2] = "+";
		str[3] = "+";
		str[4] = "+";
		
		for(int i =0; i<str.length; i++) {
			
			for(int j=0; j<str.length; j++) {
				str[i] = "#";
				System.out.print(str[j]);
				str[i] = "+";
				
			}
			System.out.print("\n");
			
		}
		
		
		
	}

}
