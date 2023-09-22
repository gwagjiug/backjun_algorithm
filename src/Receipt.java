import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Receipt {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int sum = Integer.parseInt(br.readLine());

        for(int i =0; i<9; i++){
            int price = Integer.parseInt(br.readLine());
            sum -= price;
        }

        System.out.println(sum);



    }
}
