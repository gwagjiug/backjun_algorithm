import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Word_Sort {
    public static void main(String[] args) {

        //단어를 길이순으로 정렬한 뒤, 길이가 같을 경우 사전순으로 정렬해야함.

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String wd [] = new String[N];


        for (int i = 0; i<wd.length; i++){
            wd[i] = sc.next();
        }

        Arrays.sort(wd, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                else {
                    return o1.length() - o2.length();
                }


            }
        });

        System.out.println(wd[0]);

        for(int i = 1; i<N; i++){


            if(!wd[i].equals(wd[i -1])){
                System.out.println(wd[i]);
            }
        }


    }
}
