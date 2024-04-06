import java.util.LinkedList;

public class LinkedListQueue<T> {
    private LinkedList<T> list;

    // Queue 생성자
    public LinkedListQueue() {
        list = new LinkedList<>();
    }

    // Queue가 비어있는지 확인
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Queue에 요소 추가
    public void enqueue(T item) {
        list.addLast(item);
    }

    // Queue에서 요소 제거 및 반환
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }
        return list.removeFirst();
    }

    // Queue의 첫 번째 요소 반환
    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return null;
        }
        return list.getFirst();
    }

    // Queue의 현재 크기 반환
    public int size() {
        return list.size();
    }

    // Queue 출력
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        for (T item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListQueue<Integer> queue = new LinkedListQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.display(); // Queue: 1 2 3 4 5
        System.out.println("Dequeued item: " + queue.dequeue()); // Dequeued item: 1
        queue.display(); // Queue: 2 3 4 5
        System.out.println("Front item: " + queue.peek()); // Front item: 2
        System.out.println("Queue size: " + queue.size()); // Queue size: 4
    }
}
