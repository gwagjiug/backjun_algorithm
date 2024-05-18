import java.util.Arrays;
import java.util.Scanner;

public class Test_37 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for(int i = 1; i<=10; i++) {
            int numDumps = sc.nextInt();

            int [] height = new int[100];

            for(int j =0; j<height.length; j++) {
                height[j] = sc.nextInt();
            }

            Arrays.sort(height);

            int result = flattenBox(height,numDumps);
            System.out.println("#"+i+" "+result);

        }


    }



    private static int flattenBox(int [] height, int numDumps) {

        for(int i =0 ; i<numDumps; i++) {
            if(height[99] - height[0] <= 1) {
                return height[99] - height[0];
            }
            height[99] --;
            height[0]++;
            Arrays.sort(height);


        }
        return height[99] - height[0];


    }
}