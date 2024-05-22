

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test_35 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		
		
		
		for(int i =1; i<=T; i++) {
			
			int N = sc.nextInt();
			HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

			for(int j = 0; j<1000; j++) {
			

				int score = sc.nextInt();
				map.put(score, map.getOrDefault(score,0 )+1);
				
			}
			
			int mode = -1;
			int maxFrequency = 0;
			
			for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
				
				int score = entry.getKey(); //숫자의 크기
				int frequency = entry.getValue(); //빈도수
				
				if(frequency > maxFrequency || frequency == maxFrequency && score > mode) {
					
					//빈도수가 맥스 빈도수보다 크거나 , 빈도수가 같은데, 점수가 높을 경우엔 max 값을 변경해줌 
					mode = score;
					maxFrequency = frequency;
				}
				
			}
			
			System.out.println("#"+i+" "+mode);
			
			
			
			
			
		}
		
	}

}
