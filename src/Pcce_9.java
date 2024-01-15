import java.util.Scanner;

public class Pcce_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(); //문자열 입력
        char b; //문자열을 하나씩 비교할 char 선언
        String result = ""; //최종적으로 출력할 문자열을 저장하는 result 선언




        for(int i=0; i<a.length(); i++ ){

            b = a.charAt(i); //하나씩 b에 삽입

            String charAsString = String.valueOf(b); //toLowercase를 사용하기 위해선 char 가 아닌 String 자료형으로 문자를 변환해야 함.
            //String.valueof 메소드를 사용하여 char를 String으로 변환

            if ((65 <= b) && (b <=90)){ //문자가 65<= b <= 90 즉, 문자가 65보다 크거나 같고 90보다 작거나 같음 (대문자)일 경우 소문자로 변환
                result += charAsString.toLowerCase();
            } else if ((97<=b) && (b <=122)) {
                result += charAsString.toUpperCase();
            }
            else {
                result += b;
            }

        }

        System.out.println(result);

    }
}
