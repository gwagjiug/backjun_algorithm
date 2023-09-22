import javax.jws.soap.SOAPBinding;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cute_NotCute {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cute = 0;
        int notcute = 0;

        int N = Integer.parseInt(br.readLine());

        int arr []  = new int[N];

        for(int i= 0; i<arr.length; i++){
            int count = Integer.parseInt(br.readLine());
            if(count == 1){
                cute++;
            }
            else if(count == 0){
                notcute++;
            }
        }

        if(cute > notcute){
            System.out.println("Junhee is cute!");
        } else if (notcute > cute) {
            System.out.println("Junhee is not cute!");

        }


    }
}
