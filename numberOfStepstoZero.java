package LeetCode;

import java.util.Scanner;
// hi java testing the commit
public class numberOfStepstoZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;
        while (n > 0){
            if (n % 2 == 0){
                n/=2;
            }else {
                n--;
            }
        i++;}
        System.out.println(i);
    }
}
