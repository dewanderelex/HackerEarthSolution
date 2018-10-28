package OctoberCircuits18;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class QuestionPaper {

    // Run out of time
    static int solution1 (int num, int pos, int neg){
        int i;
        HashSet<Integer> set = new HashSet<>();
        for (i = 0; i <= num; i++){
            int j = 0;
            while (i + j <= num){
                set.add(pos * i - neg * j);
                j++;
            }
        }
        return set.size();
    }

    static int solution2 (int num, int pos, int neg){
        HashSet<Integer> set = new HashSet<>();
        int point = num * pos;
        for (int done = 0; done <= num; done ++){
            int correct = point;
            for (int wrong = 0; wrong <= done; wrong++){
                set.add(correct);
                correct -= neg;
            }
            point -= pos;
        }
        return set.size();
    }

    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cases = br.readLine();                // Reading input from STDIN
        int numCases = Integer.parseInt(cases);
        for (int i = 0; i < numCases; i++){
            String line = br.readLine();
            String[] arr = line.split(" ");
            System.out.println(solution2(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2])));
        }
    }
}

