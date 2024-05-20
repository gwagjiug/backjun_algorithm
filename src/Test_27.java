

import java.util.Scanner;

public class Test_27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); // 테스트 케이스의 수 1 

		for (int caseIndex = 1; caseIndex <= T; caseIndex++) {
			int N = sc.nextInt(); // 명령어의 수 2
			int speed = 0; // 초기 속도
			int distance = 0; // 이동 거리

			for (int i = 0; i < N; i++) {
				int command = sc.nextInt(); // 명령어 1
				if (command == 0) {
					// 현재 속도 유지
				} else if (command == 1) {
					// 가속
					int acceleration = sc.nextInt(); //2
					speed += acceleration; // 
					
					
				} else if (command == 2) {
					// 감속
					int deceleration = sc.nextInt();
					speed -= deceleration;
					
					
					if (speed < 0) {
						speed = 0; // 속도가 0 미만이면 0으로 설정
					}
					
					
				}
				
				
				distance += speed; // 매 초마다 이동한 거리 누적
			}

			System.out.println("#" + caseIndex + " " + distance);
		}

		sc.close();
	}
}
