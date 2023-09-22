import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Change {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count =0;


        int price = 1000 - Integer.parseInt(br.readLine());



        while(price > 0){
            if (price >= 500 ){
                count++;
                price -= 500;
            } else if (price < 500 && price >=100) {
                count++;
                price -= 100;
            } else if (price < 100 && price >= 50) {
                count++;
                price -= 50;
            } else if (price < 50 && price >= 10) {
                count++;
                price -=10;
            } else if (price < 10 && price >=5 ) {
                count++;
                price -= 5;
            } else if (price < 5 && price >= 1) {
                count++;
                price -=1;
            }


        }
        System.out.println(count);






    }
}
