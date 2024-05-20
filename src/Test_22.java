

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import java.util.Scanner;

public class Test_22 {
    
    static final String[] grade = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for(int t = 1; t <= T; t++) {
            
            int N = sc.nextInt();
            int K = sc.nextInt();
            
            // 중간, 기말, 과제의 가중치
            double midWeight = 0.35;
            double finWeight = 0.45;
            double testWeight = 0.2;
            
            // 각 학생의 총점을 저장할 배열
            double[] totalScores = new double[N];
            
            // 각 학생의 총점 계산 및 배열에 저장
            for(int i = 0; i < N; i++) {
                int mid = sc.nextInt();
                int fin = sc.nextInt();
                int test = sc.nextInt();
                
                double totalScore = mid * midWeight + fin * finWeight + test * testWeight;
                totalScores[i] = totalScore;
            }
            
            // 총점을 내림차순으로 정렬
            java.util.Arrays.sort(totalScores);
            
            // K번째 학생의 총점으로 학점을 부여
            int gradeIndex = totalScores.length - (N - K) / (N / 10) - 1;
            
            // 학점 출력
            System.out.println("#" + t + " " + grade[gradeIndex]);
        }
        
        sc.close();
    }
}
