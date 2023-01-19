package BasicQuestions;
import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int ascii = (int) ch; // typecasting the character
        System.out.println("Ascii value of the character is " + ascii);
        sc.close();
    }
}
