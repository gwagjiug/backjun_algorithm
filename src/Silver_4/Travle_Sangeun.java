package Silver_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*class Edge implements Comparable<Edge>{
    private int distance;
    private int nodeA;
    private int nodeB;

    public Edge(int distance, int nodeA, int nodeB) {

        this.distance = distance;
        this.nodeA = nodeA;
        this.nodeB = nodeB;
    }

    public int getDistance() {
        return distance;
    }

    public int getNodeA() {
        return nodeA;
    }

    public int getNodeB() {
        return nodeB;
    }

    public int compareTo(Edge other){
        return this.distance - other.distance;
    }
}*/

public class Travle_Sangeun {
    public static int v,e;
    public static int [] parent;
//    public static ArrayList<Edge> edges = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();


        while(T --> 0){
            int cnt = 0;
            v = sc.nextInt();
            e = sc.nextInt();

            parent = new int[v+1];

            for(int i = 1; i<=v; i++){
                parent[i] = i;
            }

            for(int i=0; i<e; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();

                if(findParent(a) != findParent(b)){
                    unionParent(a,b);
                    cnt += 1;
                }

            }

            System.out.println(cnt);


        }


    }

    private static void unionParent(int a, int b) {
        a = findParent(a);
        b = findParent(b);

        if(a<b) parent[b] =a;
        else parent[a] =b;
    }

    private static int findParent(int x) {

        if(x == parent[x]) return x;
        return parent[x] = findParent(parent[x]);
    }
}
