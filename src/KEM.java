import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class KEM {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String [][] arr = new String[N][4];

        for (int i = 0; i<N; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());

            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
            arr[i][2] = st.nextToken();
            arr[i][3] = st.nextToken();
        }

        Arrays.sort(arr,new Comparator<String[]>(){
            @Override
            public int compare(String[] o1, String[] o2){
                if(o2[1].equals(o1[1])){

                    if(o1[2].equals(o2[2])){

                        if(o1[3].equals(o2[3])){

                            return o1[0].compareTo(o2[0]);
                            //국,영,수 점수가 같으면 이름을 오름차순으로 정렬
                        }

                        return Integer.parseInt(o2[3])-Integer.parseInt(o1[3]);

                        //국,영이 같다면 수학 점수를 비교해서 내림차순으로 정렬

                    }

                    return Integer.parseInt(o1[2])-Integer.parseInt(o2[2]);

                }

                return Integer.parseInt(o2[1])- Integer.parseInt(o1[1]);
            }
        });

        //성적은 내림차순(높은 순) 으로 정렬하되, 성적이 모두 같을 경우 이름을 오름차순(사전 순) 으로 정렬함

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i][0]);
        }

    }
}