import java.util.Arrays;
import java.util.Scanner;

public class Represent_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr [] = new int[5];
        int max =0;


        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();

            max += arr[i];
        }
        System.out.println(max / 5);

        Arrays.sort(arr);

        System.out.println(arr[2]);



    }
}
