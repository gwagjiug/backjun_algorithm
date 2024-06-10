import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Number_Following {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        
        int plus = 1;
        int num = 10;

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i<= N; i++){

            if(i % num == 0){ //자릿 수가 변경될 때 마다 plus 값을 상승시키고 num 곱하기 10
                plus++;
                num *= 10;
            }

            count += plus;
        }
        System.out.println(count);
        //comit

    }
}
