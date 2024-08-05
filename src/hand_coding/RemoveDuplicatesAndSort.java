package hand_coding;

import java.util.Scanner;
import java.util.TreeSet;

public class RemoveDuplicatesAndSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("알파벳으로 이루어진 단어를 입력하세요");

        String input = sc.nextLine();
        String result = removeDuplicate(input);

        System.out.println(result);
    }

    private static String removeDuplicate(String input) {
        TreeSet<Character> set = new TreeSet<>();

        for(char c : input.toCharArray()){
            set.add(c);
        }

        StringBuilder result = new StringBuilder();

        for (char c : set) {
            result.append(c);
        }
        return result.toString();

    }
}
