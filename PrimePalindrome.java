package LeetCode;

import java.util.Scanner;

public class PrimePalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int pa =0, pr=1;
        while (pa != pr) {
            while (true) {
                if (true == palin(n)) {
                    //System.out.println(n + " is palin");
                    pa = n;
                    break;
                }
                n++;
            }
            while (true){
                if (prime(n) == true) {
                    //System.out.println(n+"prime");
                    pr = n;
                    break;
                }n++;
            }
            if (true == palin(pr)) {
                System.out.println(n + " is palin");
                pa = n;
                break;
            }
            n++;
        }
        }

        //System.out.println(pr + " " + pa);

    static boolean prime(int n) {
        if (n <= 1) {
            return false;
        }
        int c= 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }c++;
        }
        return  c * c > n;
    }

    static boolean palin ( int x){
        int temp = 0;
        int n = x;
        while (x > 0) {
            temp = temp * 10 + x % 10;
            x /= 10;

        }
        return temp == n;

}
}
