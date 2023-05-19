package LeetCode;

import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int temp = 0;
        int n = x;

        while (x > 0){
            temp = temp *10 + x % 10;
            x /= 10;

        }
        System.out.println(temp == n);
    }
}
