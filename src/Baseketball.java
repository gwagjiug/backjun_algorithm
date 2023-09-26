import java.util.Scanner;

public class Baseketball {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String arr  [] = new String[N];
        int [] alpha = new int[26];


        for(int i=0; i<arr.length; i++){
            arr[i] = sc.next();
            char a = arr[i].charAt(0);
            alpha[a-97]++;
        }

        boolean sign = false;
        for(int i=0; i<alpha.length;i++){
            if(alpha[i] >= 5){
                sign = true;
                System.out.print((char)(i+97));
            }
        }
        if(!sign) System.out.println("PREDAJA");


    }
}
