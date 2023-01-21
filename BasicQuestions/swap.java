package BasicQuestions;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        Swap(a,b);
    }
    public static void Swap(int x, int y) {
        int temp = x;
        x = y; 
        y = temp;
        System.out.println("After swapping " );
        System.out.println("a  = "+x );
        System.out.println("b  = "+y );
        
    }
}
