package hand_coding;

import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        /*각종 정렬 알고리즘을 구현해보자*/


        /*1. 선택 정렬 주어진 리스트에서 최솟값을 찾아 맨 앞자리의 값과 교환하는 것이 포인트
        * 맨 앞자리의 값(i)로 두고 i+1부터 쭉 돌면서 결과적으로 가장 작은 값이 맨 앞 (i)번 인덱스에 위치하게 됨*/

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i = 0; i<N-1;i++){
            for(int j = i+1; j<N; j++){
                if (arr[i] > arr[j]){
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }

        for (int val : arr){
            System.out.println(val);
        }





    }
}
