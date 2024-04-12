import java.util.Arrays;
import java.util.Scanner;

public class Find_Number_1 {
    public static void main(String[] args) {


        //백준 1920번 자바

        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();

        int arr1 [] = new int[N];

        for (int i = 0; i< arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        Arrays.sort(arr1); //이분탐색을 이용하기 때문에 반드시 정렬되어 있어야 함

        int M = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i<M; i++){

            if (binarySearch(arr1,sc.nextInt()) >= 0){
                sb.append(1).append('\n');
            }
            else {
                sb.append(0).append('\n');
            }

        }
        System.out.println(sb);





    }

    public static int binarySearch(int[] arr1, int key) {

        int low = 0;
        int high = arr1.length -1;

        while(low <= high){

            int mid = (low+high) / 2 ;

            if (key < arr1[mid]){
                high = mid-1;
            } else if (key > arr1[mid]) {
                low = mid+1;

            }
            else{
                return mid;
            }

        }



        return -1;
    }
}
