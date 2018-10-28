package CodeArena;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem00e7c40 {

    static boolean solution (int[] space, int from, int to, int length){
        if (from >= length) return false;
        if (space[from] == to){
            return true;
        }else{
            return solution(space, space[from], to, length);
        }
    }

    public static void main (String[] args) throws Exception {
        FastReader f = new FastReader();
        int a = f.nextInt();
        String[] arr = f.nextLine().split(" ");
        int[] space = new int[a];
        for (int i = 0; i < a; i++){
            space[i] = Integer.parseInt(arr[i]);
        }
        String[] des = f.nextLine().split(" ");
        System.out.println(solution(space, Integer.parseInt(des[0]), Integer.parseInt(des[1]), a) ? "Yes" : "No");
    }
}
