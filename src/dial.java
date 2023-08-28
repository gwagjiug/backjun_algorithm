import java.util.Scanner;

public class dial {
    public static void main(String[] args) {

        //백준 5622번 다이얼
        //입력은 대문자로 이루어져 있으며 , 시간의 합을 구하는 문제임


        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        //s 문자열을 입력받고 문자열의 길이만큼 for문을 반복,
        //switch 조건문에 문자열 s의 i번째 인덱스 단어를 검사 조건문이 끝나고 count 값을 출력

        int count = 0;

        for(int i = 0; i<s.length(); i++){

            switch (s.charAt(i)){

                case 'A': case 'B' : case 'C':
                    count += 3;
                    break;
                case 'D' : case 'E': case 'F' :
                    count += 4;
                    break;

                case 'G' : case 'H': case 'I' :
                    count += 5;
                    break;

                case 'J' : case 'K': case 'L' :
                    count += 6;
                    break;

                case 'M' : case 'N': case 'O' :
                    count += 7;
                    break;

                case 'P' : case 'Q': case 'R' : case 'S' :
                    count += 8;
                    break;

                case 'T' : case 'U': case 'V' :
                    count += 9;
                    break;

                case 'W' : case 'X': case 'Y' : case 'Z' :
                    count += 10;
                    break;
            }

        }

        System.out.print(count);

    }
}
