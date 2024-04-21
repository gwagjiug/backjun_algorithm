import java.util.Arrays;
import java.util.Scanner;

public class Suffix_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in  );

        String S = sc.next();

        String str [] = new String[S.length()];

        for (int i = 0; i<S.length(); i++ ){
            str[i] = S.substring(i,S.length());
            //지정된 범위에 해당하는 부분 문자열을 반환하는 메서드
        }

        Arrays.sort(str);

        for (String strarr : str) {

            System.out.println(strarr);

        }



    }
}
