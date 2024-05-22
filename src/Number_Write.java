import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_Write {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sum = new StringBuilder();

        for(int i = 1; i <= N; i++){
            sum.append(i);
        }

        System.out.println(sum.length());
    }
}
