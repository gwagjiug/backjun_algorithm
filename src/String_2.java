import java.util.Scanner;

public class String_2 {
    public static void main(String[] args) {


        //입력으로 주어지는 문자열은 알파벳 소문자로만 이루어져 있음.
        //a~z를 모두 출력하여 주어진 문자열에 대해 해당 문자가 처음으로 나오는 위치를 출력
        //위치는 0부터 시작 문자열 첫 단어는 위치가 0임

        Scanner in = new Scanner(System.in);

        int [] arr = new int[26];

        for(int i=0; i<arr.length;i++){

            arr[i] = -1;
            //먼저 int 형 배열을 하나 생성하여 모두 -1로 초기화 시킴
            //이 배열은 문자열 s에 각 문자의 위치를 가리킬 배열임
        }

        String S = in.nextLine();

        for(int i=0; i<S.length(); i++){
            char ch = S.charAt(i); //ch 에 charAt 메소드를 사용하여 문자를 추출
            //best -> 0번인 b가 ch에 들어가 ->b를 arr[] 1번 인덱스에 넣어줘야 함


            if(arr[ch -97]== -1){
                arr[ch - 97] = i; // b - 97 = 1이고 그럼 arr[1] = 0이 됨
                //여기서 0은 b가 처음 등장한 위치
            }

        }

        //but 동일 문자가 포함되어있는 경우 처음 나타난 위치를 기준으로 나타내야 함.
        //즉, 문자열을 앞에서부터 검사할 때 앞선 동일 문자가 존재하여 arr에 위치를 변경했을 경우 arr의 값을 변경하지 않으면 됨
        // -1인 경우 즉 한번도 배열의 원소 값이 초기화 되지 않은 = 동일 문자가 존재하지 않는 경우에만 원소 값을 변경하도록


        for(int val :arr){ //배열 출력
            System.out.print(val + " ");
        }



    }
}
