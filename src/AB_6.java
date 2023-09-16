import java.util.Scanner;
import java.util.StringTokenizer;

public class AB_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringTokenizer st;

        String str;

        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            str = sc.next();
            st = new StringTokenizer(str,",");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(a+b);
        }




    }
}
