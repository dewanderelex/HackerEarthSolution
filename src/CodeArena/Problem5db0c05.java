package CodeArena;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem5db0c05 {

    static int solution (int[] arr, int k){
        int result = 0;
        for (int i : arr){
            if (i > k) continue;
            if (k - i > result){
                result = k - i;
            }
        }
        return result;
    }

    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        for (int i = 0; i < cases; i++){
            String[] arr1 = br.readLine().split(" ");
            String[] arr2 = br.readLine().split(" ");
            int[] arr = new int[arr2.length];
            for (int j = 0; j < arr2.length; j ++){
                arr[j] = Integer.parseInt(arr2[j]);
            }
            System.out.println(solution(arr, Integer.parseInt(arr1[1])));
        }
    }
}
