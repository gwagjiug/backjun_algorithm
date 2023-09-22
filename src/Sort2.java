import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sort2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i< N ;i++){

            list.add(sc.nextInt());

        }

        Collections.sort(list);
        //list 내의 정수를 오름차순으로 정렬

        for(int value : list){
            sb.append(value).append('\n');
        }

        System.out.println(sb);




    }
}
