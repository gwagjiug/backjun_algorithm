import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Sort_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int arr [][] = new int[N][2];

        for (int i =0; i<N; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr,(o1, o2) -> {
            if (o1[0] == o2[0]){ //첫번째 원소가 같다면 두 번째 원소끼리 비교
                return o1[1] - o2[1];
            }else {
                return o1[0] - o2[0];
            }
        });


/*        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] e1, int[] e2) {
                if(e1[0] == e2[0]) {
                    return e1[1] - e2[1];
                }
                else {
                    return e1[0] - e2[0];
                }
            }
        });      */



        for (int j = 0; j<N; j++){
            System.out.println(arr[j][0] + " " + arr[j][1] );
        }


    }
}
