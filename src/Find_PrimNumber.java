import java.util.Scanner;

public class Find_PrimNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in );

        int N = sc.nextInt();

        int count = 0;


        for(int i = 0; i<N; i++){
            //소수인경우 true, 아닌 경우 false
            boolean isPrime = true;
            int num = sc.nextInt();

            if(num == 1){ //1은 소수가아님 1인 경우 다음 반복문으로
                continue;
            }
            for (int j = 2; j<=Math.sqrt(num); j++){
                if (num % j ==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }


        }

        System.out.println(count);


    }
}
