package Loops;

import java.util.Scanner;

public class sumOfN {
    public static void main(String[] args) {
       System.out.println("Enter the num");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       sc.close();
       int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum  + i;
        }
        System.out.println("The sum of n natural numbers is... " + sum);
    }
}
