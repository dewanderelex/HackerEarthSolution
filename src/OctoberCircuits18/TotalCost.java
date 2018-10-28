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

class TotalCost {

    static int solution (int price, int available, int limit, int hiked, int mems){
        if (available - limit > mems){
            return mems * price;
        }else if (available < limit) {
            return mems * hiked;
        }else {
            int seats = available - limit;
            return seats * price + (mems - seats) * hiked;
        }
    }

    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] data = br.readLine().split(" ");
        int price = Integer.parseInt(data[0]);
        int available = Integer.parseInt(data[1]);
        int limit = Integer.parseInt(data[2]);
        int hiked = Integer.parseInt(data[3]);
        int mems = Integer.parseInt(data[4]);
        System.out.println(solution(price, available, limit, hiked, mems));
    }
}
