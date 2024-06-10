import java.util.ArrayList;
import java.util.Scanner;

public class N_M {
    public static int[] arr;
    public static boolean[] visit;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        arr = new int[M];
        visit = new boolean[N]; //3
        dfs(N, M, 0);

    }

    public static void dfs(int N, int M, int depth) {

        if (depth == M) { //depth == 2와 같으므로 arr을 출력한다
            for (int val : arr) {
                System.out.print(val + " ");
            }

            System.out.println();
            return;
        }


        for (int i = 0; i < N; i++) { //0~2까지

            if (!visit[i]) { // 0이 false 이면?

                visit[i] = true; // 0을 true 로 만듦

                arr[depth] = i + 1; // arr 0 = 1 // 1은 2 // 2 는 3

                dfs(N, M, depth + 1); // 다시 3 2 1로 호출 -> 3 2 2

                visit[i] = false;
            }
            //depth (1)은 == 2가 아니므로 다시 루프

             //다시 0~2까지 for 문을 실행하는데 0은 true 이므로 1부터


        }



    }

}
