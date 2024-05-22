import java.util.Scanner;

public class Make_1 {
    public static void main(String[] args) {





        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        System.out.println(recur(N, 0));





    }


    static int recur(int N, int count) {
        // N이 2 미만인 경우 누적된 count 값을 반환
        if (N < 2) {
            return count;
        }
        // 2로 나누는 경우와 3으로 나누는 경우의 최소 연산 횟수를 선택
        return Math.min(recur(N / 2, count + 1 + (N % 2)), recur(N / 3, count + 1 + (N % 3)));
    }


}
