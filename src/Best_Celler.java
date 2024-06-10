import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Best_Celler {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        HashMap<String,Integer> books = new HashMap<>();

        int max = 0;

        for(int i = 0; i<n; i++){
            String key = br.readLine();

            books.put(key,books.getOrDefault(key,0)+1); //입력받은 책 이름을 key값으로 넣음

            //getOrDefault 메서드는 key가 books에 존재하면 그 값을 반환하고, 그렇지 않으면 0을 반환함
            //책 제목이 처음입력되면 초기값 0에서 1을 더하고 이미 존재한다면 현재 값에서 1을 더함

            max = Math.max(max,books.get(key));
            //큰 값 비교
            //get() 메서드는 주어진 key와 연결된 값을 반환함

        }

        List<String> list = new ArrayList<>();

        for (Map.Entry<String,Integer> entry : books.entrySet()){ //books의 모든 엔트리를 순회
            // 키-값 쌍(엔트리)들의 집합을 반환
            if(entry.getValue() == max){ //값(책의 수) 가 맥스와 같으면
                list.add(entry.getKey());  //리스트에 책 이름 집어 넣음
            }
        }

        // 리스트를 사전 순으로 정렬

        Collections.sort(list);

        System.out.println(list.get(0));





    }
}
