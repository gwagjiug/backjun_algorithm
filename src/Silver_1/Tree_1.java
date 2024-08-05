package Silver_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Node {
    char value;
    Node left;
    Node right;

    public Node(char value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class Tree_1 {
    static Node[] tree;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


    }
}
