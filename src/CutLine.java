import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class CutLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        Integer[] arr = new Integer[N]; // Integer 배열로 선언

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder()); // 내림차순으로 정렬


        System.out.println(arr[K-1]);

    }
}
