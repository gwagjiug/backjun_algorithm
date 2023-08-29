import java.util.Scanner;

public class group_word {
    public static void main(String[] args) {

        //문자열의 문자가 연속되지 않으면서 이미 앞서 해당 문자가 입력된 적이 있을 경우 그룹 단어가 아니다.

        //이전 문자가 이미 존재했을 경우 ,

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //그룹 단어 개수
        int cnt = 0; // 그룹 단어 개수를 세는 변수

        for (int i = 0; i < N; i++) { //n만큼 반복하면서 문자열 입력받음
            String S = sc.next();
            boolean check[] = new boolean[26]; // 알파벳 사용 내역
            boolean tmp = true; // 그룹 단어 인지

            for (int j = 0; j < S.length(); j++) {
                int index = S.charAt(j)-'a';  //단어의 아스키코드를 소문자로 변환해서 index 변수에 저장
                if(check[index]) { // 이전에 사용한적이 있는 문자라면
                    if(S.charAt(j) != S.charAt(j-1)) { // 이전 문자와 연속되지 않는다면
                        tmp = false; // 그룹 단어가 아님
                        break;
                    }
                }else { // 이전에 사용한적이 없는 문자라면
                    check[index] = true; // 문자 사용 체크
                }
            }


            if(tmp) cnt++;
        }

        System.out.println(cnt);
        // 이전에 사용한 적이 있다면 무조건 연속해야 함

    }
}
