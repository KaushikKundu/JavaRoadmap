import java.util.Scanner;
public class PrintInput {
    public static void main(String[] args) {
        System.out.println("Enter the num");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("You have entered " + num);
        sc.close();
    }
}
