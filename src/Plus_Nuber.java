import java.util.Scanner;

public class Plus_Nuber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[][] = new int[N][10];
        int sum [] = new int[N];


        for(int i=0; i<N; i++){

            for (int j = 0; j<arr[i].length; j++){
                    arr[i][j] = sc.nextInt();
                    if (arr[i][j] % 2 != 0){
                        sum[i] += arr[i][j];
                    }

            }

        }

        for (int i = 0; i<N; i++){
            System.out.print("#" + (i+1));
            System.out.println(" "+sum[i]);
        }

/*        arr.length: 이것은 배열 arr의 전체 길이를 나타냅니다.
        2차원 배열에서 이것은 배열의 행 수를 나타냅니다. 즉, arr.length는 행의 수입니다.

        arr[i].length: 이것은 배열 arr의 i번째 행의 길이를 나타냅니다.
                즉, arr[i].length는 i번째 행의 열 수를 나타냅니다.*/


    }
}
