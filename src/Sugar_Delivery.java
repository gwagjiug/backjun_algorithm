import java.util.Scanner;

public class Sugar_Delivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int bagCount = 0;

        while (N > 0) {
            if (N % 5 == 0) {
                bagCount += N / 5;
                N = 0;
            } else {
                N -= 3;
                bagCount++;
            }

            if (N < 0) { //N이 0보다 작을때
                System.out.println(-1);
                return;

                //break는 반복문을 빠져나오는 역할을 하기 때문에 바로 메서드를 종료시키는 return을 사용하여

            }
        }

        System.out.println(bagCount);
    }
}
