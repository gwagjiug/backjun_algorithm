import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Count_Number {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10]; // 0 부터 10까지

        int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());

        String str = String.valueOf(val); //곱한 값 String으로 저장

        for (int i = 0; i < str.length(); i++) {
            arr[(str.charAt(i) - 48)]++;

            //str.charAt(i) - 48은 해당 문자를 정수로 변환하는 것입니다. 예를 들어, '1' - 48은 1로 변환됩니다.
        }



        for (int v : arr) {
            System.out.println(v);
        }

    }
}