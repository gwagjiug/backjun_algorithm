

import java.util.Scanner;

public class Tset_8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int N = sc.nextInt();
		
		
		for(int i=1; i<=N; i++) {
			
			String T = sc.next();
			
			String y = T.substring(0,4);
			String m = T.substring(4,6);
			String d = T.substring(6,8);
			
			int M = Integer.parseInt(m);
			int D = Integer.parseInt(d);
			
			 if (M < 1 || M > 12 || D < 1 || D > 31) {
	                System.out.println("#" + i + " -1");
	            } else if (M == 2 && D > 28) {
	                System.out.println("#" + i + " -1");
	            } else if (M == 4 || M == 6 || M == 9 || M == 11 && D > 30) {
	                System.out.println("#" + i + " -1");
	            } else {
	                System.out.println("#" + i + " " + y + "/" + m + "/" + d);
	            }
	        }
			
			
		}
		
	}

