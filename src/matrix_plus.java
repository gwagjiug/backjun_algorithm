import java.util.Scanner;

public class matrix_plus {
    public static void main(String[] args) {

        //N x M 크기의 두 행렬 A B가 주어졌을 때 두 행렬을 더하는 프로그램을 작성하시오


        Scanner sc =new Scanner(System.in);

        int N = sc.nextInt(), M = sc.nextInt();

        int [][] A = new int [N][M];
        int [][] B = new int [N][M];

        //3 3 입력하면  0,0 ~ 2,2
        //A[0][0] A[0][1] A[0][2]
        //A[1][0] A[1][1] A[1][2]
        //A[2][0] A[2][1] A[2][2]


        for (int i = 0; i<N;i++){
            for(int j = 0; j<M; j++){
                A[i][j] = sc.nextInt();
            }
        }

        for(int k = 0; k<N; k++ ){
            for(int q=0; q<M;q++){
                B[k][q] = sc.nextInt();
            }
        }


        for(int i=0; i<N; i++){
            for (int j =0; j < M;j++){
              int result = A[i][j] + B[i][j];
                System.out.print(result + " ");
            }
            System.out.print("\n");
        }






    }
}
