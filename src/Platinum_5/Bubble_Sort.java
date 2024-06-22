package Platinum_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;



public class Bubble_Sort {

    //23968번

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int arr [] = new int[N];


        st = new StringTokenizer(br.readLine());

        for(int i = 0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }


        int swapCount = 0;
        boolean found = false;

        /*버블 정렬의 round는 배열크기 -1 만큼 진행되고
        * 한번의 라운드에서는 비교가 현재 진행 round - 배열크기 만큼 진행된다.*/

        for(int i = 1; i<arr.length && !found; i++){

            for(int j = 0; j<arr.length - i; j++){
                if (arr[j] > arr[j+1]){
                    swapCount++;

                    if(swapCount == K){
                        int smaller = Math.min(arr[j] , arr[j+1]);
                        int larger = Math.max(arr[j] , arr[j+1]);
                        System.out.println(smaller + " "+ larger);
                        found = true;
                        break;
                    }


                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;

                }
            }

        }
        if (!found){
            System.out.println(-1);
        }





    }


}
