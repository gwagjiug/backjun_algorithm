package Silver_3;

import com.sun.org.apache.xpath.internal.operations.Neg;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class Two_Pointer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n =sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        int sum = 0;
        int pair = 0;
        int start = 0;
        int end = n-1;

        Arrays.sort(arr);

        while(start<end){
            sum = arr[start] + arr[end];

            if(sum == x){
                pair++;
            }
            if(sum <= x){
                start++;
            }
            else {
                end--;
            }

        }

        System.out.println(pair);



    }
}
