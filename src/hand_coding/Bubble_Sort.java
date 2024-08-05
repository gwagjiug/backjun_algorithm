package hand_coding;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        sort(arr,arr.length);

        for(int val : arr){
            System.out.print(val+ " ");
        }


    }

    private static void sort(int[] a, int size) {
        for(int i = 1; i<size; i++){
            for(int j = 0; j<size-i; j++){
                if(a[j] >a[j+1]){
                    swap(a,j,j+1);
                }
            }
        }
    }
    /*버블 정렬은  맨 앞 원소부터 비교해 가면서 한번의 round 가 끝나면 가장 큰 값이 맨 뒤 인덱스에 위치하기 때문에
    * 다음 라운드에서는 맨 뒤 인덱스는 포함할 필요가 없다.
    * 총 라운드는 배열크기 -1 , 각 라운드별 비교회수는 배열크기- 라운드 횟수*/

    private static void swap(int[] a, int bigger, int smaller) {
        int tmp = a[bigger];
        a[bigger] = a[smaller];
        a[smaller] = tmp;
    }
}
