import java.util.Scanner;

public class Better_Physical {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] arr = new int [N][2];

        for(int i = 0; i<N; i++){

            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        //[0,0],[0,1]은 같은 사람 비교해야 하는 사람은??

        //[1,0],[1,1]인 사람하고 비교해 함

        for (int i = 0; i<N; i++){
            int rank = 1;
            for (int j = 0; j<N; j++){
                if(i==j) continue;
                if (arr[i][0]<arr[j][0] && arr[i][1] < arr[j][1]){
                    rank ++;
                }
            }


/*            3
            55 185 = 0,0 / 0,1
            58 183 = 1,0 / 1,1
            88 186 = 2,0 / 2,1

            0,0 < 1,0 && 0,1 < 1,1 = !! 유지
            0,0 < 2,0 & 0,1 < 2,1 = 1번 남자 랭크 1 증가
            1,0 < 2,0 & 1,1 < 2,1 = 2번 랭크 1 증가
            2,0 < 2,0 = if조건에서 걸려서 반복문 증가

            정답은 2 2 1





            */

            System.out.print(rank + " ");
        }




    }
}
