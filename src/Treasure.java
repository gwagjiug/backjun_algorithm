import java.util.*;
import java.util.Collections;
import java.util.Scanner;


public class Treasure {
    public static void main(String[] args) {

        int sum = 0;


        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int arr1[] = new int[N];
        int arr2[] = new int[N];

        for (int i = 0; i<N; i++){
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i<N; i++){
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr1);

        Arrays.sort(arr2);

        for (int i = 0; i<N; i++){
            sum += arr1[i] * arr2[N-1 - i];
        }

        //0일때 0 * 4
        //1일때 1 * 4

        System.out.println(sum);



    }
}
