package hand_coding;

import java.util.Scanner;

public class Quick_Sort {
    public static void main(String[] args) {

        /*퀵 정렬 : 피벗을 이용하여 분할*/

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("정렬 전");

        for(int val : arr){
            System.out.print(val + " ");
        }

        quickSort(arr,0,arr.length-1);

    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low < high){
            int pivotIndex = partition(arr,low,high);
            // 재귀적으로 왼쪽과 오른쪽 서브 배열 정렬
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low -1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;

                // 배열의 i번째 원소와 j번째 원소를 교환
                swap(array, i, j);
            }
        }

        // 피벗을 i+1 번째 원소와 교환
        swap(array, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
