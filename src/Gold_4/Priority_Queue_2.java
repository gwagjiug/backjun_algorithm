package Gold_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Priority_Queue_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        //7662번

        for(int test = 0; test <T; test++){

            int input = Integer.parseInt(br.readLine());

            TreeMap<Integer,Integer> map = new TreeMap<>();

            for(int i = 0; i<input; i++){

                StringTokenizer st = new StringTokenizer(br.readLine());
                String op = st.nextToken();

                if(op.equals("I")){
                    int num = Integer.parseInt(st.nextToken());
                    map.put(num,map.getOrDefault(num,0)+1);
                }else{
                    if(map.size() == 0) continue;
                    int type = Integer.parseInt(st.nextToken());
                    int num;

                    if(type == 1){
                        num = map.lastKey(); //최댓값 삭제
                    }else{
                        num = map.firstKey(); //최솟값 삭제
                    }
                    if(map.put(num,map.get(num) - 1) == 1){
                        map.remove(num);
                    }
                    /*삭제 연산일 경우 입력받은 num을 put 메소드를 이용해서 업데이트.
                    * num의 값을 1씩 감소 시키고 num의 현재 값이 1과 같다면 즉, 하나밖에 없다면 삭제연산
                    * put 메서드는 맵에 키-값 쌍을 삽입하거나 키가 이미 존재하는 경우 해당 키의 값을 업데이트 함*/

                }

            }

            if(map.size() == 0){
                sb.append("EMPTY\n");
            }
            else{
                sb.append(map.lastKey()+" "+ map.firstKey()+"\n");
            }


        }

        System.out.println(sb.toString());

    }
}
