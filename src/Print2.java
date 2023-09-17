import java.util.ArrayList;
import java.util.Scanner;

public class Print2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){
            String s = sc.nextLine(); //띄어쓰기 포함
            System.out.println(s);
            if(sc.hasNextLine() == false){
                break;

            }
        }



    }
}
