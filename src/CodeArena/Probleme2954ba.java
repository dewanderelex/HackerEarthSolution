package CodeArena;

//Micro's girlfriend Mini wants to go to shopping with Micro. Of course, Micro will be taking care of all her expenses. She wants to go to Code Mall for shopping. There are N shops in the mall, numbered 1 to N. Each shop is having a standard S ,represented by an integer value. Since she understands that Micro is undergoing a financial crisis, she will only go to those shops with standard less than or equal to c, but she wants to go to shops whose number lie between a and b. Now Micro wonders for different given values of a, b and c, how many shops he will have to visit.
//
//        Input:
//        First line consists of two space separated integers N and Q denoting the number of shops and number of queries respectively.
//        Second line consists of N space separated integers. ith integer denotes the standard of ith shop.
//        Q lines follow each containing three space separated integers a, b and c.
//
//        Output:
//        For each value of a, b and c print the answer in a new line.
//
//        Constraints:
//        1 ≤ N ≤ 100000
//        1 ≤ Q ≤ 100000
//        1 ≤ S , c ≤ 1000000000
//        1 ≤ a ≤ b ≤ N

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Probleme2954ba {

    static int solution (int[] shop, int from, int to, int c){
        int result = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = from - 1; i <= to - 1; i++){
            if (set.contains(shop[i])){
                result ++;
            }
            else if (shop[i] <= c){
                set.add(shop[i]);
                result++;
            }
        }
        return result;
    }

    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int cases = Integer.parseInt(a[1]);
        if (cases == 0){
            System.out.println(0);
        }else{
            int numShop = Integer.parseInt(a[0]);
            String[] sh = br.readLine().split(" ");
            int[] shop = new int[numShop];
            for (int i = 0; i < numShop; i++){
                shop[i] = Integer.parseInt(sh[i]);
            }
            for (int i = 0; i < cases; i++){
                String[] s = br.readLine().split(" ");
                if (s.length != 3){
                    System.out.println(0);
                }else{
                    int[] arr = new int[3];
                    for (int j = 0; j < 3; j++){
                        arr[j] = Integer.parseInt(s[j]);
                    }
                    System.out.println(solution(shop, arr[0], arr[1], arr[2]));
                }
            }
        }
    }
}
