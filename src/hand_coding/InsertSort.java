package hand_coding;

import java.util.Scanner;

public class InsertSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();

        }

        insert(arr,arr.length);


    }

    private static void insert(int[] a, int size) {
        for(int i = 1; i<size; i++){
            int target = a[i];

            int j = i-1;

            while (j >=0 && target < a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = target;

            /*오른쪽으로 계속 복사,복사
            * 더 이상 taget 보다 큰 수가 없거나 이미 제일 앞에 왔을 때, 미리 복사해놓은 target 값을
            * 삽입*/




        }
    }
}
