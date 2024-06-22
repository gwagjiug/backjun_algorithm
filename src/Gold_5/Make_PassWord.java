package Gold_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Make_PassWord {

    private static int L, C;
    private static char list[];
    private static char code[];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //백준 1759번

        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        list = new char[C]; //재료들
        code = new char[L]; //비밀번호 길이

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < C; i++) {
            list[i] = st.nextToken().charAt(0);
            /*StringToken 메서드는 String을 반환하기 때문에 charAt*/
        }

        Arrays.sort(list);
        /*0 1 2 3 4 5
        * a c i s t w*/

        /*재료들 오름차순*/

        makeCode(0, 0);

    }

    private static void makeCode(int x, int idx) {
        if (idx == L) {
            if (isVaild()) {
                System.out.println(code);
            }
            return;
        }

        for(int i = x; i<C; i++){
            code[idx] = list[i];
            makeCode(i + 1, idx +1);
        }

        /*a,c,i,s
        * a,c,i,t
        * a,c,i,w
        * */


    }

    private static boolean isVaild() {
        int mo = 0;
        int ja = 0;

        for (char x : code) {
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                mo++;
            } else {
                ja++;
            }

        }

        if(mo >= 1 && ja>= 2){
            return true;
        }
        return false;

    }
}

