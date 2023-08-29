import java.util.Scanner;

public class matrix_max {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A[][] = new int[9][9];
        int max = 0;
        int x = 0;
        int y = 0;



        for(int i = 0; i<9;i++){
            for(int j = 0; j<9; j++){
                A[i][j] = sc.nextInt();
                if(A[i][j]> max){
                    max = A[i][j];
                    x = i;
                    y = j;
                }
            }
        }

        System.out.print(max + "\n");
        System.out.print((x + 1) + " " + (y +1));




    }
}
