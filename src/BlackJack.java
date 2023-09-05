import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {


        //카드의 개수를 정하고, 둘째 줄에는 카드에 쓰여있는 수가 주어 짐 ,
        //정해진 카드로 M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 출력



        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();


        int [] arr = new int [N];

        for(int i =0; i<N; i++){
            arr[i] = sc.nextInt(); //N개의 카드의 숫자를 각각 정해주는 것
        }

        int result = search(arr,N,M);
        System.out.println(result);


    }

    //18 21 24

    private static int search(int[] arr, int N, int M) {
        int result = 0;

        for(int i = 0; i< N-2; i++){
            for(int j = i+1; j<N-1; j++){
                for(int k= j+1; k<N; k++){

                    int temp = arr[i]+arr[j]+arr[k];

                    if(temp > result && temp <=M ){
                        result = temp;
                    }


                }
            }
        }




        return result;
    }
}
