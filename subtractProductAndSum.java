package LeetCode;

import java.util.Scanner;

public class subtractProductAndSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 0;

        int prod = 1;
        int sum = 0;

        while (n > 0) {


            int rem = n % 10;

            prod = prod * rem;

            sum = sum + rem;

            n = n / 10;

        }

        result = prod - sum;
        System.out.println(result);

    }
}
