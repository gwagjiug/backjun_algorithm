import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class AC {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        //백준 5430번
        ArrayDeque<Integer> deque;
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        while(T --> 0){

            String command = br.readLine(); //명령어

            int n = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine(),"[],");

            deque = new ArrayDeque<Integer>();

            for(int i = 0; i<n; i++){
                deque.add(Integer.parseInt(st.nextToken()));
            }

            ACC(command,deque);


        }
        System.out.println(sb);



    }

    public static void ACC(String command, ArrayDeque<Integer> deque) {
        boolean isRight = true;

        for(char cmd : command.toCharArray()){

            if(cmd =='R'){
                isRight = !isRight;
                continue;
            }

            //D의 경우
            //D함수이면서 방향을 바꾼적 없을 때
            if(isRight){
                //원소가 비어있을 경우 error를 출력하고 함수 종료
                if (deque.pollFirst() == null){
                    sb.append("error\n");
                    return;
                }
            }
            else{ //D 함수이면서 방향을 바꿨을 때

                if(deque.pollLast() == null){
                    sb.append("error\n");
                    return;
                }

            }

        }

        //모든 함수가 정상적으로 작동했다면 덱에 남아있는 요소들을 출력문으로

        makePrintString(deque,isRight);

    }

    public static void makePrintString(ArrayDeque<Integer> deque, boolean isRight) {

        sb.append('['); //우선 여는 대괄호 먼저 저장

        if(deque.size() > 0){ //출력할 원소가 한 개 이상 있을 경우

            if(isRight){//정방향일 경우
                sb.append(deque.pollFirst());

                while (!deque.isEmpty()){ //그러고 나서 deque 가 비어있지 않다면,
                    sb.append(',').append(deque.pollFirst());
                }

            }
            else{ //역방향일 경우

                sb.append(deque.pollLast());

                while(!deque.isEmpty()){
                    sb.append(',').append(deque.pollLast());
                }

            }

        }

        sb.append(']').append('\n'); //닫는 대괄호 및 개행


    }


}
