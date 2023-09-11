import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortInside {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().toCharArray();

        //5개 입력 =  길이는 5  인덱스의 끝은 4


        Arrays.sort(arr);

        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }


    }
}
