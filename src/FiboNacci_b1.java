import java.util.Scanner;

public class FiboNacci_b1 {

    static long[] arr;
    public static void main(String[] args) {
        //백준 2748


        /*dp와 재귀 호출의 다른 점
        * dp는 반복되는 문제는 한 번만 푼다는 조건이 추가됨 즉, 쉽게 말하면 이미 풀렸던 값을 재활용 한다고 생각하면 쉬움
        * 재귀로 풀었을 때
        *
        * int Fib(int N) {
	    if(N == 0) return 0;
	    if(N == 1) return 1;

	    return Fib(N - 1) + Fib(N - 2);
        }*/

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        arr = new long[N +1];

        for(int i =0; i<arr.length; i++){
            arr[i] = -1;
        }

        arr[0] = 0;
        arr[1] = 1;

        System.out.println(Fib(N));



    }

    private static long Fib(int n) {
        if(arr[n] == -1){
            arr[n] = Fib(n-1) + Fib(n-2);
        }
        return arr[n];
    }
}
