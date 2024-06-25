package Silver_2;

import java.util.Scanner;

public class Cut_LAN {
    public static void main(String[] args) {
        //백준 1654

        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int N = sc.nextInt();

        int [] arr = new int[K];
        long max = 0;
        for(int i = 0; i<K; i++){
            arr[i] = sc.nextInt();
            if(max < arr[i]){
                max = arr[i];
            }

        }


        max ++;

        long min = 0;
        long mid = 0;

        while(min < max ){
            mid = (max + min)/2;

            long count = 0;

            for(int i = 0; i<arr.length; i++){
                count += (arr[i] / mid);
            }

            /*mid 길이로 잘랐을 때의 개수가 만들고자 하는 랜선의 개수보다 작다면 자르고자 하는 길이를 줄이기 위해
            * 최대 길이를 줄여서 다시 mid를 계산, 그 외에는자르고자 하는 길이를 늘려야 하므로 최소 길이를 늘린다.*/

            if(count < N){
                max = mid;
            }
            else{
                min = mid + 1;
            }

        }

        System.out.println(min -1);


    }
}
