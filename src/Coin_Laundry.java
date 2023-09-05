import java.util.Scanner;

public class Coin_Laundry {
    public static void main(String[] args) {

        //테스트 케이스 개수 T
        //가장 큰 금액부터 빼주면서 최소 동전의 개수를 구하는 문제
        //입력단위는 센트 단위 최대 500 ->
        //Q : 25센트, D : 10센트, N : 5센트, P: 1센트

        int Q =0;
        int D =0;
        int N =0;
        int P =0;


        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i=0; i<T; i++){

            int Case = sc.nextInt();

            while (Case > 0){ //Case가 0이 될 때 까지 반복

                if(Case >= 25){
                    Case -= 25;
                    Q++;

                } else if (Case < 25 && Case >= 10) {
                    Case -=10;
                    D++;

                } else if (Case < 10 && Case >=5) {
                    Case -=5;
                    N++;
                } else if (Case < 5 && Case >=1) {
                    Case -=1;
                    P++;
                }

            }
            System.out.println(Q+" "+D+" "+N+" "+P);
            Q = 0; D=0; N= 0; P= 0;






        }


    }
}
