import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {


        //N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        int arr[] = new int[N];


        for(int i=0; i<arr.length;i++){

            arr[i] = sc.nextInt();

        }

        Arrays.sort(arr);

        for (int j=0; j<arr.length; j++){
            System.out.println(arr[j]);
        }


    }
}
