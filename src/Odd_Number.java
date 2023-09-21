import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Odd_Number {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //홀수가 존재하지 않을 경우 첫째 줄에 -1 출력
        //홀수가 존재하는 경우 홀수의 합을 출력하고 홀수들 중 최솟 값을 출력함



        int arr [] = new int[7];
        int count  =0;
        int sum =0;
        int min = 100;


        for(int i =0; i<arr.length; i++ ){
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i] % 2 != 0){
                count++;;
                sum += arr[i];
                min = Math.min(min,arr[i]);




            }
        }
        if(count == 0){
            System.out.println("-1");
        }
        else{
            System.out.println(sum);
            System.out.println(min);
        }

    }
}
