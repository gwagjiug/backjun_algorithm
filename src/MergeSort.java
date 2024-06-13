import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MergeSort {

    static  int [] A ,tmp;
    static  int count = 0;
    static int result = -1;

    static int K ;
    public static void main(String[] args) throws IOException {
        //백준 24060

        /*합병 정렬의 전체적인 과정은 이렇다.
        * 주어진 리스트를 절반으로 분할하여 부분리스트로 나눈다 (Divide : 분할)
        * 해당 부분리스트의 길이가 1이 아니라면 1번 과정을 다시 진행
        * 인접한 부분리스트끼리 정렬하여 합침 (정복)
        * */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N  = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        A = new int[N];
        st = new StringTokenizer(br.readLine());



        for(int i = 0; i< N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        tmp = new int[N];

        merge_sort(A,0,N-1);


        System.out.println(result);



    }

    private static void merge_sort(int[] A, int left, int right) {

        if(count > K) return; //저장횟수가 K보다 작으면 -1 반환
        if(left<right) {
            int mid = (left + right ) /2; //divide
            merge_sort(A,left,mid); //배열 , 맨 왼쪽 원소 , 맨 오른쪽(절반)
            merge_sort(A,mid+1,right);
            merge(A,left,mid,right);
        }

    }

    /* 초기값 : [4] [5]
    배열: [4, 5, 1, 3, 2]
      left = 0, mid = 0, right = 1*/

    private static void merge(int[] A, int left, int mid, int right) {

        int i = left; // i = 0
        int j = mid+1; // j = 1
        int t = 0;

        /*초기상태 i = 0
        * j = 1
        * t = 0
        * */

        while(i <= mid && j<= right ){ // 0 <= 0 && 1 <= 1

            /* 0<=1 && 2<=2
            * */
            /*좌측 부분 배열의 모든 원소를 처리한 경우 i>mid
            * 좌측 부분 배열의 인덱스 i가 mid를 넘어가면 좌측 부분 배열의 모든 원소를 처리한 것*/
            if(A[i] <= A[j]){
                tmp[t] = A[i];
                i++;
            }
            else{
                tmp[t] = A[j];
                j++;
                /*A[j] 가 더 작으면 A[j]를 tmp에 저장함
                * 가장 작은 수가 tmp[0]에 위치하게 됨
                * 그러고 j값 증가*/
            }
            t++;
            /*t 값도 마찬가지로 증가*/

        }

        while(i<=mid){
            tmp[t++] = A[i++];
        }
        while(j<=right){
            tmp[t++] = A[j++];
        }

        /*좌측 부분 배열과 우측 부분 배열 중 하나에 남아있는 원소들을 모두 tmp 배열로 복사*/

        i = left;
        t = 0;

        while(i<= right){
            count++;
            if(count == K){
                result = tmp[t];
                break;
            }
            A[i++] = tmp[t++];
        }
        /*오름차순으로 정리되어 있는 임시 배열을 원래 배열로 복사함과 동시에 K값도 서칭*/



    }
}
