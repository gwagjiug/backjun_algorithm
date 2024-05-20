

import java.util.Arrays;
import java.util.Scanner;

public class Test_21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {

			int sum = 0;
			int min = Integer.MAX_VALUE; // 최솟값을 최대값으로 초기화
			int max = Integer.MIN_VALUE; // 최댓값을 최소값으로 초기화


			int arr[] = new int[10];

			for (int j = 0; j < 10; j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];

				if (arr[j] < min) {
					min = arr[j];
				}
				if (arr[j] > max) {
					max = arr[j];
				}

			}
			
			sum -= min;
			sum -= max;
			
			
			
			System.out.println("#" + (i+1) + " " + Math.round((double) sum / 8));

			
			

		}

	}
}
