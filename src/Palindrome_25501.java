import java.util.Scanner;

public class Palindrome_25501 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T --> 0){
            String s = sc.next();

            int [] result = isPalindrome(s);
            System.out.println(result[0] + " " + result[1]);

        }

    }

    private static int [] isPalindrome(String s) {
        return recursion(s,0,s.length()-1,1);
    }

    private static int [] recursion(String s, int i, int r, int cnt) {
        if(i >= r){ //i가 r보다 크거나 같다면 문자열이 1자리 라면
            return new int [] {1,cnt};
        } else if (s.charAt(i) != s.charAt(r)) {
            return new int [] {0,cnt}; //팰린드롬의 조건인 문자열 일치가 되지 않는다면 0

        }
        else{
            return recursion(s,i+1,r-1,cnt +1); //다시한번 재귀호출 -> 가운데로 모이며
        }
    }
}
