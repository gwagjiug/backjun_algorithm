import java.util.Scanner;

public class longitude_reading {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] str = new char[5][15];
        //5줄 최대 15글자 2차원 배열선언

        for(int i = 0; i<5; i++){

            String A = sc.next();

            for(int j =0; j <A.length(); j++){

                str[i][j] = A.charAt(j);

            }
        }

        //0,0 1,0 2,0 3,0
        //행이 1씩 증가하고 열이 증가하지 않아야 함

        for (int k = 0; k < 15; k++) {
            for (int q = 0; q < 5; q++) {
                // '\0'이 아닌 경우에만 출력
//                if (str[q][k] != '\0') {
//                    System.out.print(str[q][k]);
//                }
                System.out.print(str[q][k]);

            }
        }



    }
}