import java.util.Scanner;

public class Pcce_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 h와 w 값을 입력받습니다.
        System.out.println("Enter the value of h:");
        int h = sc.nextInt();
        System.out.println("Enter the value of w:");
        int w = sc.nextInt();

        // 사용자로부터 보드의 행과 열 개수를 입력받습니다.
        System.out.println("Enter the number of rows in the board:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns in the board:");
        int cols = sc.nextInt();

        // 사용자로부터 보드의 요소를 입력받습니다.
        String[][] board = new String[rows][cols];
        System.out.println("Enter the elements of the board:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = sc.next();
            }
        }

        // solution 메소드를 호출하여 결과를 출력합니다.
        int result = solution(board, h, w);
        System.out.println("Count of adjacent cells with the same value: " + result);
    }

    public static int solution(String[][] board, int h, int w) {
        int n = board.length;
        int count = 0;
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};

        // 주어진 좌표를 기준으로 인접한 셀 중 같은 값인 경우를 카운트합니다.
        for (int i = 0; i < 4; i++) {
            int h_check = h + dh[i];
            int w_check = w + dw[i];
            if (h_check >= 0 && h_check < n && w_check >= 0 && w_check < n) {
                if (board[h][w].equals(board[h_check][w_check])) {
                    count++;
                }
            }
        }
        return count;
    }
}
