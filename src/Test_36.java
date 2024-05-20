

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Test_36 {
	
	static int maxVal;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 1; i<=T; i++) {
			
			String num = sc.next();
			
			int k = sc.nextInt(); //교환 횟수
			maxVal = 0;
			dfs(num.toCharArray(), k , new HashSet<>());
			
			// 숫자를 charArray로 넘기고 , 교환 횟수 넘기고,
			
	
			
		}
		
	}
	
	private static void dfs(char[] numArr, int k ,HashSet<String> visited) {
		
		if(k==0) {
			maxVal = Math.max(maxVal, Integer.parseInt(new String(numArr)));
			return;
		}
		//k가 0이 되었을 때 더 이상 교환할 수 없을 때 현재 숫자 배열의 값과 지금 까지 기록된 최대값을 비교하여 갱신
		
		//numArr을 문자열로 변환하고, 다시 정수로 변환하고 현재 숫자 계산
		
		String current = new String(numArr);
		
		if(visited.contains(current+k)) {
			return;
		}
		
		//해시 맵이 123 + 1을 포함하면? 
		visited.add(current + k);
		
		for(int i = 0; i<numArr.length;i++) {
			for(int j = i+1; j<numArr.length; j++) {
				swap(numArr,i,j);
				dfs(numArr, k -1, visited);
				swap(numArr,i,j);
			}
		}
		
		
	}
	
	
	private static void swap(char[] numArr, int i, int j) {
		char temp  = numArr[i];
		numArr[i] = numArr[j];
		numArr[j] = temp;
	}

}
