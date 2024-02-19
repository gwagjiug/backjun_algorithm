import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Set_1269 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); // 읽어들이는 문자열을 공백으로 토큰으로 저장

        int a = Integer.parseInt(st.nextToken()); // 읽어들여서 st객체에 저장된 토큰 1을 반환하고 정수로 변환하여 변수 a에 저장
        int b = Integer.parseInt(st.nextToken());

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i<a; i++){
            setA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < b; i++) {
            setB.add(Integer.parseInt(st.nextToken()));
        }

        int answer = 0;
        for(int num : setA) {
            if(!setB.contains(num)) {
                answer += 1;
            }
        }

        for(int num : setB) {
            if(!setA.contains(num)) {
                answer += 1;
            }
        }

        System.out.println(answer);
    }
}
