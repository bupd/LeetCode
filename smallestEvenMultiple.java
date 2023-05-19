package LeetCode;

import java.util.Scanner;

public class smallestEvenMultiple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = 0;
        // block of code to be executed if the condition is true
        if (r == (n % 2)) {
            r= n;

            // block of code to be executed if the condition is false
        } else {
            r = n * 2;
        }

        System.out.println(r);

//        //         if (n %2 == 0) {
////             return n;
////         }
////         else {
////             return n*2;
//// }
//        return n % 2 == 0 ? n : n * 2;
//        // ?- if :-else
//        // (condition) ? if block : else block
//    }
//
//}

    }


}
