import java.util.Scanner;

public class Quick_Sort_2 {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int K = sc.nextInt();

        int arr[] = new int[N];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        quicksort(arr,0,N-1,K);



    }

    private static void quicksort(int[] arr, int left, int right, int target) {

        int pl = left;
        int pr = right;
        int pivot = arr[(pl + pr) /2];

        int count  = 0;


        do {
            while(arr[pl] < pivot) pl++;
            while(arr[pr] > pivot) pr--;

            if(pl <= pr){
                swap(arr,pl++,pr--);
                count ++;

                if(count == target){
                    printArray(arr);
                    return;
                }
            }

        }while(pl <= pr);
        if(left < pr){
            quicksort(arr,left,pr,target);
        }
        if(pl < right){
            quicksort(arr,pl,right,target);
        }



    }

    private static void printArray(int[] arr) {

        for(int val : arr){
            System.out.print(val + " ");
        }

    }

    private static void swap(int[] arr, int idxl, int idxr) {

        int tmp = arr[idxl];
        arr[idxl] = arr[idxr];
        arr[idxr] = tmp;

    }
}
