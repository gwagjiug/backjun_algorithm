package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_java {
    public static void main(String[] args) {
        // 덱(Deque) 생성
        Deque<Integer> deque = new ArrayDeque<>();

        // push_front(item): 앞(front)에 원소 추가
        deque.addFirst(1);
        deque.addFirst(2);

        // push_back(item): 뒤(rear)에 원소 추가
        deque.addLast(3);
        deque.addLast(4);

        // pop_front(): 앞(front)에서 원소 제거하고 반환
        int frontElement = deque.removeFirst();
        System.out.println("Front element removed: " + frontElement);

        // pop_back(): 뒤(rear)에서 원소 제거하고 반환
        int rearElement = deque.removeLast();
        System.out.println("Rear element removed: " + rearElement);

        // front(): 앞(front)에 있는 원소 반환
        int front = deque.peekFirst();
        System.out.println("Front element: " + front);

        // back(): 뒤(rear)에 있는 원소 반환
        int rear = deque.peekLast();
        System.out.println("Rear element: " + rear);

        // empty(): 덱이 비어 있는지 확인
        boolean isEmpty = deque.isEmpty();
        System.out.println("Is deque empty? " + isEmpty);

        // size(): 덱에 저장된 원소의 개수 반환
        int size = deque.size();
        System.out.println("Deque size: " + size);
    }
}
