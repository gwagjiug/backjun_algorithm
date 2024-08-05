import java.util.Scanner;

//백준 11830 골4
public class Procession_Squared {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();

        int arr [][] = new int[N][N];

        for(int i =0; i<arr.length; i++){

            for(int j = 0; j<arr[i].length; j++){
                arr[i][j]= sc.nextInt();
            }

        }

    }
}
