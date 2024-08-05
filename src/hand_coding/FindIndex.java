package hand_coding;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {

        /*배열에 1,000,000 개의 수가 있다고 가정할 때, 여기에서 원하는 수가 몇 번째 인덱스에 위치해 있는지
        확인하는 프로그램을 작성해 보세요. (단, 원하는 수가 하나가 아닐 수 있습니다.)*/

        int size = 1_000_000;
        int arr[] = generateRandomArray(size);

        Scanner sc = new Scanner(System.in);
        System.out.println("찾고자 하는 값을 입력하세요");
        int target = sc.nextInt();


        ArrayList<Integer> indices = findIndices(arr,target);

        if (indices.isEmpty()) {
            System.out.println("값 " + target + "이(가) 배열에 없습니다.");
        } else {
            System.out.println("값 " + target + "의 인덱스:");
            for (int index : indices) {
                System.out.println(index);
            }
        }




    }

    private static ArrayList<Integer> findIndices(int[] arr, int target) {
        ArrayList<Integer> indices = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                indices.add(i);
            }
        }
        return indices;
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = random.nextInt(1_000_000);
            //0부터 999,999까지의 랜덤한 정수
        }
        return arr;

    }
}
