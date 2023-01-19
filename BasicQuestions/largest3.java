package BasicQuestions;

import java.util.Scanner;

public class largest3 {
    public static void main(String[] args) {
        System.out.println("enter three numbers");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        input.close();
        if(a>b){
            if(a>c){
                System.out.println("largest is " + a);
            }
            else{
                System.out.println("largest is "+c );

            }
        }
        else if(b>c) {
            System.out.println("Largest is " + b );
        }
        else{
            System.out.println("largest is "+c);

        }
    }
}
