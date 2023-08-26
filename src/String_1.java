import java.util.Scanner;

public class String_1 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] arr = new int[26]; //영문자의 개수는 26개임
        String s = in.next();

        for(int i = 0; i<s.length();i++){//문자열 s에 대하여 첫 번째 문자 부터 마지막 문자까지 검사하기 위한 반복문을 작성해줌

            if('A'<= s.charAt(i) && s.charAt(i)<='Z'){
                arr[s.charAt(i) - 65]++; //i가 0이고 a로 시작하는 문장을 입력했을 경우, a의 아스키 코드 값은 97 97- 97 = 0
                //즉 , arr[0]번 인덱스가 ++되면서 1이됨
            }
            else { //소문자 범위
                arr[s.charAt(i)- 97]++;
            }
        }
        //알파벳을 담을 int 형 배열 선언
        //문자열 s를 입력받음

        //for문을 돌면서 대문자 범위내에 있는 단어 하나를 배열 arr의 인덱스 값에 넣어준다

        int max = -1;
        char ch = '?'; //가장 많이 사용되는 단어가 여러개일 경우

        for(int i=0; i<26; i++){
            if(arr[i]> max ){
                max = arr[i];
                ch = (char )(i+65); //대문자를 출력해야 하므로 65를 더해준다
            }
            else if (arr[i] == max ){
                ch ='?';
            }
        }

        System.out.print(ch);

        //lovee를 입력했을 경우
        //        arr[11] = 1
        //        arr[14] = 1
        //        arr[21] = 1
        //        arr[4] =  2
        //        두 번째 for 루프에서 i = 4일 때 arr[4] > max 조건이 만족되어 max의 값은 2가 되고, 'E'의 아스키 코드는 69이므로 ch에 'E'가 저장됩니다.








    }
}
