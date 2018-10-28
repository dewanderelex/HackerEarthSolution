//The Hexagon University of India will be hosting its Prom Night tonight.There would be M boys and N girls at the prom tonight. Each boy wants a girl who is strictly shorter than him. A girl can dance with only one boy and vice-versa. Given the heights of all the boys and girls tell whether it is possible for all boys to get a girl.
//
//        Input:
//        The first line contains T denoting the number of test cases.
//        Each test case contains three lines.
//        The first line contains M and N.
//        The second line contains M integers each denoting the height of boy.
//        The third contains N integers each denoting the height of girl.
//
//        Output:
//        Print YES if it is possible for each boy to get a girl else print NO.
//
//        Constraints:
//        1<=T<=10
//        1<=N, M<=10000
//        1<=Height<=200

package CodeArena;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class Problema18918e {

    static boolean solution (int[] boys, int[] girls){
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(boys);
        Arrays.sort(girls);
        LinkedList<Integer> listGirls = new LinkedList<>();
        for (int i : girls){
            listGirls.add(i);
        }
        for (int i = 0; i < boys.length; i++){
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < girls.length; j++){
                if (girls[j] < boys[i] && boys[i] - girls[j] < min){
                    map.put(boys[i], girls[j]);
                    min = boys[i] - girls[j];
                }
            }
            listGirls.remove(map.get(boys[i]));
        }
        return listGirls.isEmpty();
    }


    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        for (int i = 0; i < cases; i++){
            String[] length = br.readLine().split(" ");
            String[] boy = br.readLine().split(" ");
            String[] girl = br.readLine().split(" ");
            int[] boys = new int[Integer.parseInt(length[0])];
            int[] girls = new int[Integer.parseInt(length[1])];
            for (int j = 0; j < boys.length; j++){
                boys[j] = Integer.parseInt(boy[j]);
            }
            for (int k = 0; k < girls.length; k++){
                girls[k] = Integer.parseInt(girl[k]);
            }
            if (Integer.parseInt(length[0]) > Integer.parseInt(length[1])){
                System.out.println(false);
            }else {
                System.out.println(solution(boys, girls));
            }
        }
    }
}
