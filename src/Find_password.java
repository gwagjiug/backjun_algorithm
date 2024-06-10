import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Scanner;

public class Find_password {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = sc.nextInt();
        int M = sc.nextInt();

        HashMap<String,String> map = new HashMap<String,String>();

        for (int i =0; i<N; i++){
            String url = sc.next();
            String pass = sc.next();

            map.put(url,pass);
        }

        for (int i = 0; i<M; i++){
            String url = sc.next();
            bw.write(map.get(url) + "\n");
        }

        bw.flush();

    }
}
