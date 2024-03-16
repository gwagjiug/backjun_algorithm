import java.util.Scanner;

public class Zero_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int top = -1;

        int K = sc.nextInt();

        int arr []  = new int[K];

        for(int i = 0; i<K; i++){

            int num = sc.nextInt();

            //0 = 3 현재 top은 0임 -> 0 들어왔어 top을 -1로 만들어줘야 함 그럼 어차피 합을 구할 때 top가지 계산

            if(num == 0){
                top--;
            }
            else {
                top++;
                arr[top] = num;
            }

        }

        int sum = 0;

        for(int i = 0; i<=top; i++){
            sum += arr[i];
        }
        System.out.println(sum);

    }
}
