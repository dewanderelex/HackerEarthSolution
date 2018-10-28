package CodeArena;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem9aa90a3 {

    static long ncr(long n, long r) {
        long numerator = 1, denominator = 1;
        if (r > n - r) {
            r = n - r;
        }
        for (long i = 1L; i <= r; ++i) {
            denominator *= i;
        }
        for (long i = n - r + 1L; i <= n; ++i) {
            numerator *= i;
        }
        return numerator / denominator;
    }

    static int solution (int days, int happy){
        if (days == happy) return ((int) Math.pow(2, days)) % 1000000007;
        return ((int)ncr (days, happy) * (int) Math.pow(2, happy)) % 1000000007;
    }

    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        for (int i = 0; i < cases; i++){
            String[] s = br.readLine().split(" ");
            int[] arr = new int[s.length];
            for (int j = 0; j < s.length; j++){
                arr[j] = Integer.parseInt(s[j]);
            }
            System.out.println(solution(arr[0], arr[1]));
        }
    }
}
