import java.util.Scanner;

public class Print_Word {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        int count = 0;
        sc.close();

        for(int i =0; i<input.length(); i++){
            System.out.print(input.charAt(i));
            count ++;

            if(count == 10){
                System.out.println();
                count = 0;
            }




        }

    }
}
